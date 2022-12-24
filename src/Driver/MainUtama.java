/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import POJO.Customer;
import POJO.Item;
import POJO.OnlineShop;
import POJO.Order;
import java.util.Scanner;

/**
 *
 * @author muham
 */
public class MainUtama {
    public static void main (String [] args) throws Exception
   {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
        
        //instance of class
        OnlineShop os = new OnlineShop();
        Customer c = new Customer(Integer.SIZE,"","");
        Item i = new Item(Integer.SIZE, Integer.MIN_VALUE,"", Integer.SIZE,"");
        Order o = new Order(Integer.SIZE,"","", Integer.MIN_VALUE, Integer.SIZE, Integer.BYTES);
        //menu
        while(true)
            {
                System.out.println("=======================================");
                System.out.println("            MENU ONLINE SHOP           ");
                System.out.println("=======================================");
                System.out.println("1. Data Penjual ");
                System.out.println("2. Data Customer");
                System.out.println("3. Jenis Barang");
                System.out.println("4. Order");
                System.out.println("5. Lihat Data");
                System.out.println("6. Keluar");
                System.out.println("=======================================");
        
         //input
                System.out.print("Masukan Pilihan= ");
                int pilih = in.nextInt();
         
                System.out.println();
                
        //proses + output
        switch(pilih)
        {
            //jika pilih= 1
            case 1:
                //isi pilihan bernilai 1 ketika dijalankan
                System.out.println("=======================================");
                System.out.println("           INPUT DATA PENJUAL          ");
                System.out.println("=======================================");
                System.out.print("Masukan Nama ID Penjual      : ");
                Integer id = in.nextInt();
                System.out.print("Masukan Nama Penjual         : ");
                String nama = in.next();
                System.out.print("Masukan Nama Toko            : ");
                String namaToko = in.next();
                
                os = new OnlineShop (id,nama,namaToko);
                System.out.println();
                System.out.println("### Data Penjual Telah disimpan ###"); 
                break;
             //jika pilih= 2
            case 2:
                //isi pilihan bernilai 2 ketika dijalankan
                System.out.println("=======================================");
                System.out.println("          INPUT DATA CUSTOMER          ");
                System.out.println("=======================================");
                System.out.print("Masukan ID Customer           : ");
                id = in.nextInt();
                System.out.print("Masukan Nama Customer         : ");
                nama = in.next();
                System.out.print("Masukan No Telepon Customer   : ");
                String noTelepon = in.next();
             
                c= new Customer (id,nama,noTelepon);
                System.out.println();
                System.out.println("### Data Customer Telah disimpan ###"); 
                break;
             //jika pilih= 3
             case 3:
                //isi pilihan bernilai 3 ketika dijalankan
                System.out.println("=======================================");
                System.out.println("            INPUT DATA ITEM            ");
                System.out.println("=======================================");
                System.out.print("Masukan ID Penjual            : ");
                id = in.nextInt();
                System.out.print("Masukan Kode Barang           : ");
                Integer kode_barang = in.nextInt();
                System.out.print("Masukan Nama Barang           : ");
                String nama_barang = in.next();
                System.out.print("Masukan Jumlah Barang         : ");
                Integer jumlah = in.nextInt();
                System.out.print("Masukan Jenis Barang          : ");
                String jenis = in.next();
                
                i = new Item (id,kode_barang,nama_barang,jumlah,jenis);
                System.out.println();
                System.out.println("### Data Item Telah disimpan ###"); 
                break;
                //jika pilih= 4
             case 4:
                //isi pilihan bernilai 4 ketika dijalankan
                System.out.println("=======================================");
                System.out.println("            INPUT DATA ORDER           ");
                System.out.println("=======================================");
                System.out.print("Masukan ID Customer           : ");
                id = in.nextInt();
                System.out.print("Masukan Tanggal Order         : ");
                String date = in.next();
                System.out.print("Masukan Nama Barang           : ");
                String barang = in.next();
                System.out.print("Masukan Jumlah Order          : ");
                Integer jumlahBeli = in.nextInt();
                System.out.print("Masukan Harga                 : Rp.");
                Integer harga = in.nextInt();
                
                Integer total = harga * jumlahBeli;
                System.out.println("Total Harga: Rp." +Math.round(total));
               
                o = new Order (id,date,barang,jumlahBeli,harga,total);
                System.out.println();
                System.out.println("### Data Order Telah disimpan ###"); 
                break;
                //jika pilih= 5
             case 5:
                //isi pilihan bernilai 5 ketika dijalankan
                 System.out.println("=======================================");
                 System.out.println("             DATA INPUTAN              ");
                 System.out.println("=======================================");
                 
                 System.out.println();
                 
                 System.out.println("Penjual");
                 System.out.println("ID Penjual           : "+os.getId());
                 System.out.println("Nama Penjual         : "+os.getNama());
                 System.out.println("Nama Toko            : "+os.getNamaToko());
                 System.out.println();
                 
                 System.out.println("Customer");
                 System.out.println("ID Customer          : "+c.getId());
                 System.out.println("Nama Customer        : "+c.getNama());
                 System.out.println("Nomor Telepon        : "+c.getNoTelepon());
                 System.out.println();
                 
                 System.out.println("Item");
                 System.out.println("ID Penjual           : "+i.getId());
                 System.out.println("Kode Barang          : "+i.getKode_barang());
                 System.out.println("Nama Barang          : "+i.getNama_barang());
                 System.out.println("Jumlah Barang        : "+i.getJumlah());
                 System.out.println("Jenis Barang         : "+i.getJenis());
                 System.out.println();
                 
                 System.out.println("=======================================");
                 System.out.println("             DATA TRANSAKSI            ");
                 System.out.println("=======================================");
                 System.out.println("Id Customer          : "+o.getId());
                 System.out.println("Tanggal Order        : "+o.getDate());
                 System.out.println("Nama Barang          : "+o.getBarang());
                 System.out.println("Jumlah Order         : "+o.getJumlahBeli());
                 System.out.println("Harga                : Rp."+o.getHarga());
                 System.out.println("Total Harga          : Rp."+o.getTotal());
                 System.out.println("=======================================");
                 break;

             //jika nilai pilih yang dimasukkan 1,2,3,4 atau 5.Maka program akan keluar secara otomatis
             default:
             System.exit(0);    
        }
     }
   }
}
    

