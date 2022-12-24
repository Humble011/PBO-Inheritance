/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;



/**
 *
 * @author muham
 */
public class Order extends OnlineShop{
    
     //deklarasi variabel
    private Integer jumlahBeli,harga,total;
    private String date,barang;
    
     //constructor 
    public Order (Integer id)
    {
        super();
    }
    public Order (Integer id, String date, String barang, Integer jumlahBeli , Integer harga, Integer total)
    {
        this.date = date;    
        this.barang = barang;
        this.jumlahBeli = jumlahBeli;
        this.harga = harga;
        this.total = total;
          
        super.setId(id);   
    }

    //getter
     public String getDate()
    {
        return date;
    }
     public String getBarang()
    {
        return barang;
    }
     public Integer getJumlahBeli()
    {
        return jumlahBeli;
    }
     public Integer getHarga()
    {
        return harga;
    }
     public Integer getTotal()
    {
        return total;
    }  
    public Integer getId()
    {
        return super.getId();
    } 
}
