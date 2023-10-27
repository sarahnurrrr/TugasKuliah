package BillGUI2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fujitsu extends JFrame{
    String nama = "Fujitsu Lifebook LH531V";
    double harga = 6397600;
    double diskon = 0;
    double total = 0;
    GregorianCalendar date = new GregorianCalendar();

    JLabel lHalo;
    JLabel lTanggal;
    JLabel lItem;
    JLabel lHarga;
    JLabel lPotongan;
    JLabel lTotal;
    JLabel lThx;
    JButton klos;

    public Fujitsu() {
//      INI UNTUK ATURAN WAKTU - START
        int detik, menit, jam, hari, bulan, tahun;
        String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        detik = date.get(Calendar.SECOND);
        menit = date.get(Calendar.MINUTE);
        jam = date.get(Calendar.HOUR_OF_DAY);
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        //RUMUS BUAT DISKON
        if (jam >= 13 && jam <= 14){
            diskon = harga * 0.05;
            total = (harga-diskon);
        }
        else {
            diskon = 0;
            total = harga;
        }
        //
//      END ATURAN WAKTU
        //SETTING FRAME
        this.setTitle(" "+nama);
        this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        this.setSize(400, 350);
        this.show();
        this.setLayout(null);
        this.dispose();

        //DEKLARASI KOMPONEN
        lHalo = new JLabel("Pembelian anda Hari ini : ");
        lTanggal = new JLabel("Tanggal        : "+hari+" "+namabulan[bulan]+" "+tahun+" "+jam+":"+menit+" WIB");
        lItem = new JLabel("Items            : "+nama);
        lHarga = new JLabel("Harga           : Rp. "+(int)harga);
        lPotongan = new JLabel("Potongan    : Rp. "+diskon);
        lTotal = new JLabel("Total             : Rp. "+(int)total);
        lThx = new JLabel("Terimakasih");
        klos = new JButton("Exit");

        //SETTING KOMPONEN
        lHalo.setBounds(20,10,10,10);
        lHalo.setSize(250,50);
        lTanggal.setBounds(20,25,10,10);
        lTanggal.setSize(250,50);
        lItem.setBounds(20,40,10,10);
        lItem.setSize(250,50);
        lHarga.setBounds(20,55,10,10);
        lHarga.setSize(450,50);
        lPotongan.setBounds(20,70,10,10);
        lPotongan.setSize(450,50);
        lTotal.setBounds(20,85,10,10);
        lTotal.setSize(450,50);
        lThx.setBounds(20,100,10,10);
        lThx.setSize(450,50);
        klos.setBounds(20, 150, 10,10);
        klos.setSize(75,30);

        //ADD KE FRAME
        this.add(lHalo);
        this.add(lTanggal);
        this.add(lItem);
        this.add(lHarga);
        this.add(lPotongan);
        this.add(lTotal);
        this.add(lThx);
        this.add(klos);

        klos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



    }
}
