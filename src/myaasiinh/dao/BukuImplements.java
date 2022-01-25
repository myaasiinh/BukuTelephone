package myaasiinh.dao;

import myaasiinh.model.BukuTelephon;

import java.util.List;

public interface BukuImplements {

    public void insert(BukuTelephon b);

    public void update(BukuTelephon b);

    public void delete(int id);

    public List<BukuTelephon> getALL();

    public List<BukuTelephon> getCariNama(String nama);
}
