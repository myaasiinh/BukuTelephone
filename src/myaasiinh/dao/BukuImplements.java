package myaasiinh.dao;

import myaasiinh.model.BukuTelephon;

import java.util.List;

public interface BukuImplements {

    public void insert(BukuTelephon b);

    public void update(BukuTelephon b);

    public void delete(BukuTelephon id);

    public BukuTelephon getId(int id);

    public List<BukuTelephon> getALL();

    public void getCariNama(String nama);

    List<BukuTelephon> search(BukuTelephon buku);
}
