/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;
import java.*;
import java.io.*;


/**
 *
 * @author muham
 */

    abstract class Karyawan
    {
        String nama,jabatan;
        double gajibersih,gajikotor,gajipokok,uangmakan;
    
 
    public Karyawan()
    {
        gajipokok=1500000.0;
    }
 
    public void setNama (String name)
    {
        this.nama=name;
    }
 
    public String getNama()
    {
        System.out.println ("Nama Karyawan : " +nama);
        return nama;
    }
 
    public String jabatan()
    {
        System.out.println ("Posisi Jabatan : " +jabatan);
        return jabatan;
    }
 
    public abstract double perhitungangaji();
 
    }
    class Karyawantetap extends Karyawan
    {
       double uangmakan,tunjangankinerja;
 
       public Karyawantetap()
    {
        jabatan="Karyawan Tetap";
        uangmakan=500000;
        tunjangankinerja=500000;
    }
 
    public double perhitungangaji()
    {
        double potongan;
        gajikotor=gajipokok+uangmakan+tunjangankinerja;
        potongan=(10.0/100.0)*gajikotor;
        gajibersih=gajikotor-potongan;
     
        System.out.println ("Gaji Pokok : " +gajipokok);
        System.out.println ("Uang Makan : " +uangmakan);
        System.out.println ("Tunjangan Kinerja : " +tunjangankinerja);
        System.out.println ("Gaji Kotor : " +gajikotor);
        System.out.println ("Potongan : " +potongan);
        System.out.println ("Gaji Bersih : " +gajibersih);
     
        return gajibersih;
    }
}

    class Karyawankontrak extends Karyawan
    {
        double uangmakan;
 
    public Karyawankontrak()
    {
        jabatan="Karyawan Kontrak";
        uangmakan=500000;
    }
 
    public double perhitungangaji()
    {
        double potongan;
        gajikotor=gajipokok+uangmakan;
        potongan=(5.0/100.0)*gajikotor;
        gajibersih=gajikotor-potongan;
     
        System.out.println ("Gaji Pokok : " +gajipokok);
        System.out.println ("Uang Makan : " +uangmakan);
        System.out.println ("Gaji Kotor : " +gajikotor);
        System.out.println ("Potongan : " +potongan);
        System.out.println ("Gaji Bersih : " +gajibersih);
     
        return gajibersih;
    }
}

    class Manajer extends Karyawan
    {
        double uangmakan,tunjangankinerja,tunjanganjabatan;
 
    public Manajer()
    {
        jabatan="Manajer";
        uangmakan=500000.0;
        tunjangankinerja=500000.0;
        tunjanganjabatan=1000000.0;
    }
 
    public double perhitungangaji()
    {
        double potongan;
        gajikotor=gajipokok+uangmakan+tunjangankinerja+tunjanganjabatan;
        potongan=(15.0/100.0)*gajikotor;
        gajibersih=gajikotor-potongan;
     
        System.out.println ("Gaji Pokok : " +gajipokok);
        System.out.println ("Uang Makan : " +uangmakan);
        System.out.println ("Tunjangan Kinerja : " +tunjangankinerja);
        System.out.println ("Tunjangan Jabatan : " +tunjanganjabatan);      
        System.out.println ("Gaji Kotor : " +gajikotor);
        System.out.println ("Potongan : " +potongan);
        System.out.println ("Gaji Bersih : " +gajibersih);
     
        return gajibersih;
    }
}
    class Gaji
    {
    public static void main (String [] args)
    {
        Karyawan ref;
        Karyawantetap pekerja=new Karyawantetap();
        Karyawankontrak pegawai=new Karyawankontrak();
        Manajer atasan=new Manajer();
     
        System.out.println ("DAFTAR GAJI KARYAWAN");
        System.out.println ("\n");
     
        ref=pekerja;      
        ref.setNama ("Iqbal");
        ref.getNama();
        ref.jabatan();
        ref.perhitungangaji();
        System.out.println ("\n");
     
        ref=pegawai;
        ref.setNama ("Kenzi");
        ref.getNama();
        ref.jabatan();
        ref.perhitungangaji();
        System.out.println ("\n");
        ref=atasan;
        ref.setNama ("Muhammad Hilmi");
        ref.getNama();
        ref.jabatan();
        ref.perhitungangaji();
    }
}
   

