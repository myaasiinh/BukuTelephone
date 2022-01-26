package myaasiinh.view;

import javax.swing.*;

public class BukuTelpon extends JFrame {


    public BukuTelpon() {
        frameInit();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new BukuTelpon().setVisible(true));

    }



    public JButton insertButton() {
        return buttonInsert();
    }
    public JButton updateButton() {
        return buttonUpdate();
    }
    public JButton deleteButton() {
        return buttonDelete();
    }
    public JButton resetButton() {
        return buttonReset();
    }
    public JTextField masukanIdTextField() {
        return txtId();
    }
    public JTextField masukanNoTextField() {
        return txtNo();
    }
    public JTextField masukanNamaTextField() {
        return txtNama();
    }
    public JTextField masukanAlamatTextField() {
        return txtAlamat();
    }
    public JTextField masukanBerdasarkanNamaTextField() {
        return txtBerdasarkanNama();
    }
    public JButton cariButton() {
        return buttonCari();
    }
    public JTable table1() {
        return table1();
    }
    private JLabel idTv() {
        return labelId();
    }
    private JLabel noTv() {
        return labelNo();
    }
    private JLabel namaTv() {
        return labelNama();
    }
    private JLabel alamatTv() {
        return labelAlamat();
    }




}
