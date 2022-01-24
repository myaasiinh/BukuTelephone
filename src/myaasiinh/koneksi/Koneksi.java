package myaasiinh.koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Koneksi {

    static Connection cont;

    public static Connection connection() {

        if (cont==null) {

            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("buku_telepon");
            data.setUser("root");
            data.setPassword("");
            try{
                cont = data.getConnection();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        return cont;

    }
}
