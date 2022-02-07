package myaasiinh.view;

import myaasiinh.controller.ControllerBukuTelphon;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public JPanel getPanel1() {
        return Panel;
    }

    public JTextField getIdTextField() {
        return IdTextField();
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
        cbt.isiTable();
        getINSERTButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbt.insert();
            }
        });
        getUPDATEButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbt.update();
            }
        });
        getDELETEButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbt.delete();
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


