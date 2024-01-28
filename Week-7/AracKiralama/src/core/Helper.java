package core;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static void setTheme() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals((info.getName()))) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
        }
    }

    public static void showMsg(String str) {
        optionPaneTR();
        String msg;
        String title;
        switch (str) {
            case "fill" -> {
                msg = "Lutfen tum alanlari doldurunuz !";
                title = "Hata!";
            }
            case "done" -> {
                msg = "Islem Basarili !";
                title = "Sonuc";
            }
            case "notFound" -> {
                msg = "Kayit bulunamadi !";
                title = "Bulunamadi";
            }
            case "error" -> {
                msg = "Hatali islem yaptiniz !";
                title = "Hata!";
            }
            default -> {
                msg = str;
                title = "Mesaj";
            }
        };

        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirm(String str){
        optionPaneTR();
        String msg;
        if(str.equals("sure")){
            msg = " Bu islemi yapmak istedigine emin misin?";
        }else{
            msg = str;
        }
        return JOptionPane.showConfirmDialog(null,msg,"Emin misin ?", JOptionPane.YES_NO_OPTION) == 0;
    }

    public static boolean isFieldEmpty(JTextField field) {
        return field.getText().trim().isEmpty();
    }

    public static boolean isFiledListEmpty(JTextField[] fieldList) {
        for (JTextField field : fieldList) {
            if (isFieldEmpty(field)) return true;
        }
        return false;
    }

    public static int getLocationPoint(String type, Dimension size) {
        return switch (type) {
            case "x" -> (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
            case "y" -> (Toolkit.getDefaultToolkit().getScreenSize().height - size.width) / 2;
            default -> 0;
        };
    }

    public static void optionPaneTR(){
        UIManager.put("OptionPane.okButtonText", "Tamam");
        UIManager.put("OptionPane.yesButtonText", "Evet");
        UIManager.put("OptionPane.noButtonText", "Hayir");
    }
}
