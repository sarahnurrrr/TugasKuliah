package Tabungan;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabungan extends JFrame {
    int saldo = 0;
    int tarik = 0;
    int akhir;
    JLabel lJudul = new JLabel("PROGRAM AMBIL UANG");
    JLabel lSaldo = new JLabel("Saldo Awal          : ");
    JLabel lTarik = new JLabel("Jumlah yang diambil : ");
    JLabel lAkhir = new JLabel();
    JTextField tfAwal = new JTextField();
    JTextField tfTarik = new JTextField();
    JButton btn = new JButton("OK");
    public void ambilUang(){
        if (tarik >= 500000 && tarik <=1000000) {
            akhir = saldo - tarik - 2500;
        } else if(tarik > 1000000){
            akhir = saldo - tarik - 5000;
        } else {
            akhir = saldo - tarik;
        }
    }

    public Tabungan() {
        this.getContentPane().setLayout(null);
        //JUDUL
        lJudul.setBounds(70, 5, 10, 10);
        lJudul.setSize(250,20);
        this.getContentPane().add(lJudul);
        //SALDO
        lSaldo.setBounds(10, 30, 10, 10);
        lSaldo.setSize(250,20);
        this.getContentPane().add(lSaldo);
        //TARIK
        lTarik.setBounds(10, 65, 10,10);
        lTarik.setSize(150,20);
        this.getContentPane().add(lTarik);
        //AKHIR
        lAkhir.setBounds(10,70,10,10);
        lAkhir.setSize(250,20);
        this.getContentPane().add(lAkhir);
        //BUTTON
        btn.setBounds(90, 100,10,10);
        btn.setSize(60,30);
        this.getContentPane().add(btn);
        //TextField
        tfAwal.setBounds(150,30,10,10);
        tfAwal.setSize(100,25);
        this.getContentPane().add(tfAwal);
        //TextField
        tfTarik.setBounds(150,65,10,10);
        tfTarik.setSize(100,25);
        this.getContentPane().add(tfTarik);
    }

    public void aksi (){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wal = Integer.parseInt(tfAwal.getText());
                int rik = Integer.parseInt(tfTarik.getText());
                saldo = wal;
                tarik = rik;
                ambilUang();
                dispose();
                JFrame frm = new JFrame("Bukti Transaksi");
                JLabel l1 = new JLabel("Bukit Transaksi");
                JLabel l2 = new JLabel("Saldo Awal : "+saldo);
                JLabel l3 = new JLabel("Jumlah yang diambil : "+tarik);
                JLabel l4 = new JLabel("Saldo Akhir : "+akhir);
                JLabel l5 = new JLabel("Terimakasih banyak");

                frm.setSize(500, 200);
                frm.setLayout(null);
                frm.setVisible(true);
                frm.add(l1); frm.add(l2); frm.add(l3); frm.add(l4); frm.add(l5);

                l1.setBounds(175, 5, 10, 10);
                l1.setSize(250,20);

                l2.setBounds(25, 30, 10, 10);
                l2.setSize(250,20);

                l3.setBounds(25, 50, 10,10);
                l3.setSize(300,20);

                l4.setBounds(25,70,10,10);
                l4.setSize(250,20);

                l5.setBounds(165,90,10,10);
                l5.setSize(250,20);
                JButton klos = new JButton("EXIT");
                frm.add(klos);
                klos.setBounds(190, 120, 10,10);
                klos.setSize(75,30);
                klos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
            }
        });
    }

    public static void main(String[] args) {
        Tabungan tFrame = new Tabungan();
        tFrame.aksi();
        tFrame.setSize(300,250);
        tFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tFrame.show();
    }
}
