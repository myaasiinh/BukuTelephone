package myaasiinh.koneksi;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {

    private static Connection connection;

    public static void getConnection(){

        if (connection == null){

            try {
                Class.forName("com.mysql.jdbc.Driver");

                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbtelphon","root","");
                System.out.println("Koneksi Berhasil");

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public static void setConnection(Connection connection) {
        Koneksi.connection = connection;
    }
}
