package myaasiinh.view;

import myaasiinh.controller.ControllerBukuTelphon;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    JButton INSERTButton;
    JButton UPDATEButton;
    JButton DELETEButton;
    JButton RESETButton;
    JButton SEARCHButton;
    JTextField IdTextField;
    JTextField NamaTextField;
    JTextField AlamatTextField;
    JTextField NoTelphonTextField;
    JTextField SearchWithNameTextField;
    JLabel IdLabel;
    JLabel NamaLabel;
    JLabel AlamatLabel;
    JLabel NoTelpLabel;
    JPanel Panel;
    JTable Table;



    public JPanel getPanel1() {
        return Panel;
    }

    public JTextField getIdTextField() {
        return IdTextField;
    }

    public JTextField getNoTelphonTextField() {
        return  NoTelphonTextField;
    }
    public JTextField getNamaTextField() {
        return NamaTextField;
    }
    public JTextField getAlamatTextField() {
        return AlamatTextField;
    }

    public JButton getINSERTButton() {
        return INSERTButton;
    }

    public JButton getUPDATEButton() {
        return UPDATEButton;
    }
    public JButton getDELETEButton() {
        return DELETEButton;
    }
    public JButton getRESETButton() {
        return RESETButton;
    }
    public JTextField getSearchWithNameTextField() {
        return SearchWithNameTextField;
    }
    public JButton getSEARCHButton() {
        return SEARCHButton;
    }
    public JTable getTable(){
        return Table;
    }

    ControllerBukuTelphon cbt;


    public Main() {
        initComponents();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("myaasiinh");
        frame.setContentPane(
                new Main().getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void initComponents() {
        cbt = new ControllerBukuTelphon(this);
        getINSERTButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbt.insert();
                cbt.isiTable();
                cbt.reset();
            }
        });
        getUPDATEButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbt.update();
                cbt.isiTable();
                cbt.reset();
            }
        });
        getDELETEButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbt.delete();
                cbt.isiTable();
                cbt.reset();
            }
        });
        getRESETButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbt.reset();
            }
        });
        getSEARCHButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbt.search();
            }
        });

    }
}


