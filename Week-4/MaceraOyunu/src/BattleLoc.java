import java.io.ObjectStreamClass;
import java.util.Random;

public abstract class BattleLoc extends Location {

    private Monster monster;
    protected String award;
    private int maxMonster;

    public BattleLoc(Player player, String name, Monster monster, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    @Override
    public boolean onLocation() {
        int monsterNumber = this.randomMonsterNumber();
        System.out.println("Suan burdasiniz : " + this.getName());
        System.out.println("Dikkatli Ol! Burada " + monsterNumber + " tane " + this.getMonster().getName() + " Yasiyor !");
        System.out.println("<S>avas veya <K>ac");
        String selectBattle = input.nextLine();
        selectBattle = selectBattle.toUpperCase();
        if (selectBattle.equals("S")) {
            if (combat(monsterNumber)) {
                System.out.println(this.getName() + " Tum dusmanlari yendiniz !");
                if (this.award.equals("Food") && getPlayer().getInventory().isFood() == false) {
                    System.out.println("Tebrikler " + this.award + " Kazandiniz !");
                    this.getPlayer().getInventory().setFood(true);
                } else if (this.award.equals("Firewood") && getPlayer().getInventory().isFirewood() == false) {
                    System.out.println("Tebrikler " + this.award + " Kazandiniz !");
                    this.getPlayer().getInventory().setFirewood(true);
                } else if (this.award.equals("Water") && getPlayer().getInventory().isWater() == false) {
                    System.out.println("Tebrikler " + this.award + " Kazandiniz !");
                    this.getPlayer().getInventory().setWater(true);
                }
                return true;
            }
        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Oldunuz !");
            System.out.println("GAME OVER");
            return false;
        }

        return true;
    }

    public boolean combat(int monsterNumber) {

        for (int i = 1; i <= monsterNumber; i++) {
            this.getMonster().setHealth(this.getMonster().getDefHealth());
            playerStats();
            monsterStats(i);

            while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                    System.out.print("<V>ur veya <K>ac");
                    String selectCombat = input.nextLine().toUpperCase();
                    if (selectCombat.equals("V")) {
                        System.out.println("Oyuncu vurdu");
                        this.getMonster().setHealth(this.monster.getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        if (this.getMonster().getHealth() > 0) {
                            System.out.println();
                            System.out.println("Canavar size vurdu !");
                            int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (monsterDamage < 0) {
                                monsterDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                            afterHit();
                        }
                } else {
                    return false;
                }
            }
            if (this.getMonster().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("Dusmani yendiniz !");
                if (getMonster().getName().equals("Yilan")) {
                    snakeAward();
                }
                System.out.println(this.getMonster().getAward() + " para kazandiniz !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getAward());
                System.out.println("Guncel paraniz : " + this.getPlayer().getMoney());
            } else {
                return false;
            }
        }
        return true;
    }
    public void snakeAward() {
        Random rand = new Random();
        int getDrop = rand.nextInt(101);
        //System.out.println("Random sayi kontrol " + getDrop);

        if (getDrop <= 15) {
            Random randGun = new Random();
            int gunDrop = randGun.nextInt(101);
            if (gunDrop < 20) {
                getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(3));
                System.out.println("Sanslisiniz bir " + getPlayer().getInventory().getWeapon().getName() + " Kazandiniz ");
            }
            if (gunDrop > 20 && gunDrop <= 50) {
                getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(2));
                System.out.println("Sanslisiniz bir " + getPlayer().getInventory().getWeapon().getName() + " Kazandiniz ");
            }
            if (gunDrop > 50) {
                getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(1));
                System.out.println("Sanslisiniz bir " + getPlayer().getInventory().getWeapon().getName() + " Kazandiniz ");
            } else if (getDrop > 15 && getDrop <= 30) {
                Random randArmor = new Random();
                int armorDrop = randArmor.nextInt(101);

                if (armorDrop < 20) {
                    getPlayer().getInventory().setArmor(Armor.getArmorObjById(3));
                    System.out.println("Sanslisiniz bir " + getPlayer().getInventory().getArmor().getName() + " Kazandinz");
                }
                if (armorDrop > 20 && armorDrop <= 50) {
                    getPlayer().getInventory().setArmor(Armor.getArmorObjById(2));
                    System.out.println("Sanslisiniz bir " + getPlayer().getInventory().getArmor().getName() + " Kazandinz");
                }
                if (armorDrop > 50) {
                    getPlayer().getInventory().setArmor(Armor.getArmorObjById(1));
                    System.out.println("Sanslisiniz bir " + getPlayer().getInventory().getArmor().getName() + " Kazandinz");
                }
            } else if (getDrop > 30 && getDrop <= 55) {
                Random randCoin = new Random();
                int getCoin = randCoin.nextInt(101);

                if (getCoin <= 20) {
                    getPlayer().setMoney(getPlayer().getMoney() + 10);
                    System.out.println("Tebrikler 10 altin kazandiniz !");
                }
                if (getCoin > 20 && getCoin <= 50) {
                    getPlayer().setMoney(getPlayer().getMoney() + 10);
                    System.out.println("Tebrikler 5 altin kazandiniz !");
                }
                if (getCoin > 50) {
                    getPlayer().setMoney(getPlayer().getMoney() + 10);
                    System.out.println("Tebrikler 1 altin kazandiniz !");
                }
            }
        } else {
            System.out.println("Hic bir sey kazanamadiniz !");
        }
    }



    public void afterHit() {
        System.out.println("Caniniz : " + this.getPlayer().getHealth());
        System.out.println(this.getMonster().getName() + "Cani : " + this.getMonster().getHealth());
        System.out.println("----------------------");
    }

    public void playerStats() {
        System.out.println("Oyuncu Degerleri");
        System.out.println("---------------------");
        System.out.println("Saglik : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Zirh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println();
    }

    public void monsterStats(int i) {
        System.out.println(i + "." + this.getMonster().getName() + " Degerleri");
        System.out.println("----------------------");
        System.out.println("Saglik : " + this.getMonster().getHealth());
        System.out.println("Hasar : " + this.getMonster().getDamage());
        System.out.println("Odul : " + this.getMonster().getAward());
    }

    public int randomMonsterNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxMonster()) + 1;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }
}
