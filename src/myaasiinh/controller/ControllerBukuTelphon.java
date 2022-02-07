package myaasiinh.controller;


import myaasiinh.dao.BukuDao;
import myaasiinh.dao.BukuImplements;
import myaasiinh.model.BukuTelephon;
import myaasiinh.model.TableBukuTelephone;
import myaasiinh.view.Main;
import javax.swing.table.TableModel;
import java.util.List;

public class ControllerBukuTelphon {


    Main mainform;
    BukuImplements bukuImplements;
    List<BukuTelephon> lb;

    public ControllerBukuTelphon(Main main) {
    }

    public void ControllerBukuTelphon(Main mainform) {
        this.mainform = mainform;
        bukuImplements = (BukuImplements) new BukuDao();
        lb = bukuImplements.getALL();

    }

    public void insert(BukuTelephon bukuTelephon) {
        bukuImplements.insert(bukuTelephon);
    }

    public void update(BukuTelephon bukuTelephon) {
        bukuImplements.update(bukuTelephon);
    }

    public void delete(BukuTelephon bukuTelephon) {
        bukuImplements.delete(bukuTelephon);
    }

    public void search(BukuTelephon bukuTelephon) {
        bukuImplements.search(bukuTelephon);
    }

    public TableModel getAll() {
        return (TableModel) new TableBukuTelephone(lb);
    }

    //fungsi controller reset
    public void reset() {
        mainform.getIdTextField().setText("");
        mainform.getNoTelphonTextField().setText("");
        mainform.getNamaTextField().setText("");
        mainform.getAlamatTextField().setText("");
    }

    //fungsi controller isi table
    public void isiTable() {

        lb = bukuImplements.getALL();
        TableBukuTelephone tbm = new TableBukuTelephone(lb);
        mainform.getTable().setModel((TableModel) tbm);

    }


    //fungsi insert data berdasarkan user dari textfield di frame
    public void insert() {
        BukuTelephon buku = new BukuTelephon();
        buku.setId(Integer.parseInt(mainform.getIdTextField().getText()));
        buku.setNotelp(mainform.getNoTelphonTextField().getText());
        buku.setNama(mainform.getNamaTextField().getText());
        buku.setAlamat(mainform.getAlamatTextField().getText());
        bukuImplements.insert(buku);
        isiTable();
    }

    //fungsi update data berdasarkan user dari textfield di frame
    public void update() {
        BukuTelephon buku = new BukuTelephon();
        buku.setId(Integer.parseInt(mainform.getIdTextField().getText()));
        buku.setNotelp(mainform.getNoTelphonTextField().getText());
        buku.setNama(mainform.getNamaTextField().getText());
        buku.setAlamat(mainform.getAlamatTextField().getText());
        bukuImplements.update(buku);
        reset();
        isiTable();
    }

    //fungsi delete data berdasarkan user dari textfield di frame
    public void delete() {
        BukuTelephon buku = new BukuTelephon();
        buku.setId(Integer.parseInt(mainform.getIdTextField().getText()));
        buku.setNotelp(mainform.getNoTelphonTextField().getText());
        buku.setNama(mainform.getNamaTextField().getText());
        buku.setAlamat(mainform.getAlamatTextField().getText());
        bukuImplements.delete(buku);
        reset();
        isiTable();
    }



    //fungsi search data berdasarkan user dari textfield di frame
    public void search() {
        BukuTelephon buku = new BukuTelephon();
        buku.setId(Integer.parseInt(mainform.getIdTextField().getText()));
        buku.setNotelp(mainform.getNoTelphonTextField().getText());
        buku.setNama(mainform.getNamaTextField().getText());
        buku.setAlamat(mainform.getAlamatTextField().getText());
        lb = bukuImplements.search(buku);
        TableBukuTelephone tbm = new TableBukuTelephone(lb);
        mainform.getTable().setModel((TableModel) tbm);

    }

    //fungsi untuk menampilkan data di textfield
    public void getData(int row){
        BukuTelephon buku = lb.get(row);
        mainform.getIdTextField().setText(String.valueOf(buku.getId()));
        mainform.getNoTelphonTextField().setText(buku.getNotelp());
        mainform.getNamaTextField().setText(buku.getNama());
        mainform.getAlamatTextField().setText(buku.getAlamat());
    }



}
