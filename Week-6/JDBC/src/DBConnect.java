import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost/test?user=root&password=mysql";
        Connection connect = null;
        String sql = "SELECT * FROM employee"; // Veritabanindaki kayitlari sorgulama
        String prSql = "INSERT INTO employee (name,position,salary) VALUES (?,?,?)"; // Veritabanina eklenecek kayit
        try {
            //Veritabani ile baglanti olusturma
            connect = DriverManager.getConnection(url);

            //Veritabanina kayit ekleme ornegi
            PreparedStatement prSt= connect.prepareStatement(prSql);
            prSt.setString(1,"Berk");
            prSt.setString(2,"Developer");
            prSt.setInt(3,10000);
            prSt.executeUpdate();
            prSt.close();

            //Statement olusturma ve sonuclari resultset nesnesinde saklama
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);
            while(data.next()){
                System.out.println("ID : " + data.getInt("id")+
                        " Name : " + data.getString("name")+
                        " Position : " + data.getString("position")+
                        " Salary : " + data.getInt("salary"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
