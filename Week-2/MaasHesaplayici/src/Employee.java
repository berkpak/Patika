public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    //Constructor
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary > 1000) { // girilen salary degeri 1000 den buyukse
            return salary * 0.03; // %3 u vergi
        } else {
            return 0; // 1000 den kucukse vergi yok
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40; // Calisma saati 40 dan fazla ise extraHours degiskinene atiyoruz
            return extraHours * 30; // saat basina 30 ile carpiyoruz
        } else {
            return 0; // 40 saatten az ise bonus yok
        }
    }

    public double raiseSalary() {
        int year = 2021;
        int yearsWorked = year - hireYear; // calisma yilini hesapliyoruz

        if (yearsWorked < 10) { // calisma yili 10 yildan az ise
            return salary * 0.5;
        } else if (yearsWorked > 9 && yearsWorked < 20) { // 10 ile 19 arasindaysa
            return salary * 0.10;
        } else  {
            return salary * 0.15;  // 20 den fazlaysa
        }
    }
    public String toString() {

        // metotlari degiskenlere atayip yazdir
        double tax = tax();
        double bonus = bonus();
        double raisedSalary = raiseSalary();
        double totalSalary = salary + bonus + raisedSalary - tax;

        return  "======================"+"\n"+
                "Adı : " + name + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireYear + "\n" +
                "Vergi : " + tax + "\n" +
                "Bonus : " + bonus + "\n" +
                "Maaş Artışı : " + raisedSalary + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (totalSalary - raisedSalary) + "\n" +
                "Toplam Maaş : " + totalSalary + "\n" +
                "=======================";
    }
}


