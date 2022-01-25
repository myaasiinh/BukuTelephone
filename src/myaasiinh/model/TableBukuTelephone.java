package myaasiinh.model;

import java.util.List;

public class TableBukuTelephone {

    List<BukuTelephon> bukuTelephonList;


    public TableBukuTelephone(List<BukuTelephon> bukuTelephonList) {
        this.bukuTelephonList = bukuTelephonList;
    }

    public int getColumnCount() {
        return 4;
    }

    public int getRowCount() {
        return bukuTelephonList.size();
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";

            case 1:
                return "No";

            case 2:
                return "Nama";

            case 3:
                return "Alamat";

            default:
                return null;
        }

    }

    public Object getValueAt(int row, int column) {
        switch (column) {
            case 1:
                return bukuTelephonList.get(row).getId();

            case 2:
                return bukuTelephonList.get(row).getNotelp();

            case 3:
                return bukuTelephonList.get(row).getNama();

            case 4:
                return bukuTelephonList.get(row).getAlamat();

            default:
                return null;
        }
    }


}
