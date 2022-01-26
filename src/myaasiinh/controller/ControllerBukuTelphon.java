package myaasiinh.controller;


import myaasiinh.dao.BukuDao;
import myaasiinh.dao.BukuImplements;
import myaasiinh.model.BukuTelephon;
import myaasiinh.model.TableBukuTelephone;
import myaasiinh.view.BukuTelpon;

import javax.swing.table.TableModel;
import java.util.List;

public class ControllerBukuTelphon {


    BukuTelpon bukuTelpon;
    BukuImplements bukuImplements;
    List<BukuTelephon> lb;

    public void ControllerBukuTelphon(BukuTelpon bukuTelpon) {
        this.bukuTelpon = bukuTelpon;
        bukuImplements = (BukuImplements) new BukuDao();
        lb = bukuImplements.getALL();

    }

    //fungsi controller reset
    public void reset() {
        bukuTelpon.masukanIdTextField().setText("");
        bukuTelpon.masukanNoTextField().setText("");
        bukuTelpon.masukanNamaTextField().setText("");
        bukuTelpon.masukanAlamatTextField().setText("");
    }

    //fungsi controller isi table
    public void isiTable() {

        lb = bukuImplements.getALL();
        TableBukuTelephone tbm = new TableBukuTelephone(lb);
        bukuTelpon.table1().setModel((TableModel) tbm);

    }

    //fungsi controller menampilkan data yang dipilih dari tabel
    public void isiField(int row) {
        bukuTelpon.masukanIdTextField().setText(lb.get(row).getId());
        bukuTelpon.masukanNoTextField().setText(lb.get(row).getNotelp());
        bukuTelpon.masukanNamaTextField().setText(lb.get(row).getNama());
        bukuTelpon.masukanAlamatTextField().setText(lb.get(row).getAlamat());
    }

    //fungsi insert data berdasarkan user dari textfield di frame
    public void insert() {


    }



}
