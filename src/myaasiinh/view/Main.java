package myaasiinh.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public JPanel panel1;
    public JTextField inputIdTextField;
    public JTextField inputNoTelphonTextField;
    public JTextField inputNamaTextField;
    public JTextField inputAlamatTextField;
    public JButton INSERTButton;
    public JButton UPDATEButton;
    public JButton DELETEButton;
    public JButton RESETButton;
    public JTextField searchWithNameTextField;
    public JButton SEARCHButton;
    public JTable table;


    public Main() {
        INSERTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        UPDATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        RESETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        SEARCHButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("myaasiinh");
        frame.setContentPane(new Main().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


