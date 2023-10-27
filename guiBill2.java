package BillGUI2;
import java.awt.event.*;
import javax.swing.*;

public class guiBill2 extends JFrame {
    Apple apple = new Apple();
    Lenovo lenovo = new Lenovo();
    HP hp = new HP();
    Asus asus = new Asus();
    Fujitsu fujitsu = new Fujitsu();
    JLabel judul = new JLabel("TOKO XYZ : TEAM 4");
    JLabel ln = new JLabel("Pilih Laptop : ");
    JLabel l1 = new JLabel("1. "+apple.nama);
    JLabel l2 = new JLabel("2. "+lenovo.nama);
    JLabel l3 = new JLabel("3. "+hp.nama);
    JLabel l4 = new JLabel("4. "+asus.nama);
    JLabel l5 = new JLabel("5. "+fujitsu.nama);
    JLabel lx = new JLabel("Input Pilihan 1-5");
    JTextField tf = new JTextField();
    JButton btn = new JButton("PILIH");

    public guiBill2() {
        this.getContentPane().setLayout(null);
        //Judul
        judul.setBounds(185, 20, 10, 10);
        judul.setSize(250,20);
        this.getContentPane().add(judul);
        //Pilih
        ln.setBounds(20, 40,10,10);
        ln.setSize(300,20);
        this.getContentPane().add(ln);
        //Pilih 1
        l1.setBounds(20, 60,10,10);
        l1.setSize(300,20);
        this.getContentPane().add(l1);
        //Pilih 2
        l2.setBounds(20, 80,10,10);
        l2.setSize(300,20);
        this.getContentPane().add(l2);
        //Pilih 3
        l3.setBounds(20, 100,10,10);
        l3.setSize(300,20);
        this.getContentPane().add(l3);
        //Pilih 4
        l4.setBounds(20, 120,10,10);
        l4.setSize(300,20);
        this.getContentPane().add(l4);
        //Pilih 5
        l5.setBounds(20, 140,10,10);
        l5.setSize(300,20);
        this.getContentPane().add(l5);
        //Pilih x
        lx.setBounds(20, 180,10,10);
        lx.setSize(100,20);
        this.getContentPane().add(lx);
        //Text Field
        tf.setBounds(120, 180,10,10);
        tf.setSize(25,25);
        this.getContentPane().add(tf);
        //BUTTON
        btn.setBounds(155,180,10,10);
        btn.setSize(75,25);
        this.getContentPane().add(btn);
    }
    public void aksi(){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pilih = Integer.parseInt(tf.getText());
                switch (pilih) {
                    case 1 :
                        JOptionPane.showMessageDialog(null, "Anda Memilih Laptop "+apple.nama);
                        new Apple().setVisible(true);
                        dispose();
                        break;
                    case 2 :
                        JOptionPane.showMessageDialog(null, "Anda Memilih Laptop "+lenovo.nama);
                        new Lenovo().setVisible(true);
                        dispose();
                        break;
                    case 3 :
                        JOptionPane.showMessageDialog(null, "Anda Memilih Laptop "+hp.nama);
                        new HP().setVisible(true);
                        dispose();
                        break;
                    case 4 :
                        JOptionPane.showMessageDialog(null, "Anda Memilih Laptop "+asus.nama);
                        new Asus().setVisible(true);
                        dispose();
                        break;
                    case 5 :
                        JOptionPane.showMessageDialog(null, "Anda Memilih Laptop "+fujitsu.nama);
                        new Fujitsu().setVisible(true);
                        dispose();
                        break;
                }
            }
        });
    }
    public static void main(String[] args) {
        guiBill2 uFrame = new guiBill2();
        uFrame.aksi();
        uFrame.setSize(500,400);
        uFrame.setTitle("TOKO XYZ");
        uFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uFrame.show();
    }
}
