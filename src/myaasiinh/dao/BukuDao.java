package myaasiinh.dao;

import myaasiinh.model.BukuTelephon;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import myaasiinh.koneksi.Koneksi;


public class   BukuDao {

    Connection connection;

    final String insert = "INSERT into bukutelephon (nomor, nama, alamat) VALUES (?, ?, ?):";
    final String update = "UPDATE bukutelephon set nomer=?, nama=?, alamat=? where id=? ;";
    final String delete = "DELETE From bukutelephon where id=? ;";
    final String select = "SELECT * FROM bukutelephon;";
    final String carinama = "SELECT * FROM bukutelephon where nama like ?";

    public BukuDao () {
        connection = Koneksi.connection();
    }


    //fungsi masukan data ke database
    public void insert(BukuTelephon b ) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, b.getNotelp());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getAlamat());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                b.setId(rs.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert statement != null;
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    //fungsi update data ke database
    public void update(BukuTelephon b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, b.getNotelp());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getAlamat());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert statement != null;
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    //fungsi delete data dari database
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert statement != null;
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    //fungsi menampilkan data ke tabel
    public List<BukuTelephon> getALL() {
        List<BukuTelephon> lb = null;
        try {
            lb = new ArrayList<BukuTelephon>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                BukuTelephon b = new BukuTelephon();
                b.setId(rs.getInt("id"));
                b.setNotelp(rs.getString("nomor"));
                b.setNama(rs.getString("nama"));
                b.setAlamat(rs.getString("alamat"));
                lb.add(b);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lb;
    }

    //fungsi menampillkan data ke tabel berdasarkan pencarian
    public List<BukuTelephon> getCariNama() {
        List<BukuTelephon> lb = null;
        try {
            lb = new ArrayList<BukuTelephon>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + getCariNama() + "%");
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                BukuTelephon b = new BukuTelephon();
                b.setId(rs.getInt("id"));
                b.setNotelp(rs.getString("nomor"));
                b.setNama(rs.getString("nama"));
                b.setAlamat(rs.getString("alamat"));
                lb.add(b);
            }

        } catch (SQLException e) {
            Logger.getLogger(BukuDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return lb;
    }




}
