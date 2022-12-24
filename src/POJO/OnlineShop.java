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
public class OnlineShop {
    
    //deklarasi variabel
    private Integer id;
    private String nama,namaToko;
   
     
    
    //constructor
    public OnlineShop()
    {
    }
    
    public OnlineShop(Integer id,String nama, String namaToko)
    {
       this.id = id;
       this.nama= nama;
       this.namaToko= namaToko;
        
    }
    
    //setter
      public void setId(Integer i)
    {
        id = i;
    } 
     public void setNama(String n)
    {
        nama = n;
    } 
     public void setNamaToko(String nt)
    {
        namaToko = nt;
    }
    
    //getter
     public Integer getId()
    {
        return id;
    }
    public String getNama()
    {
        return nama;
    }
    public String getNamaToko()
    {
        return namaToko;
    }

   
   
  
}
