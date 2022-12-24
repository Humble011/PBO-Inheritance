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
public class Item extends OnlineShop {
    
      //deklarasi variabel
    private Integer kode_barang, jumlah ;
    private String nama_barang,jenis;
    
     //constructor
    public Item (Integer id)
    {
        super();
    }
    public Item (Integer id, Integer kode_barang, String nama_barang, Integer jumlah, String jenis)
    {
        this.kode_barang= kode_barang;
        this.nama_barang= nama_barang;
        this.jumlah= jumlah;
        this.jenis =jenis;
          
        super.setId(id);    
    }
    
    //getter
     public Integer getKode_barang()
    {
        return kode_barang;
    }
    public String getNama_barang()
    {
        return nama_barang;
    }
    public Integer getJumlah()
    {
        return jumlah;
    }
     public String getJenis()
    {
        return jenis;
        
    }
    public Integer getId()
    {
        return super.getId();
    }        
}



    
