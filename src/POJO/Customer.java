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
public class Customer extends OnlineShop {
   
     //deklarasi variabel
    private String  noTelepon="unknown";
    
     //constructor
     public Customer (Integer id,String nama)
    {
        super();    
    }
     public Customer (Integer id,String nama, String noTelepon)
     {
     this.noTelepon = noTelepon;
     
     super.setId(id);
     super.setNama(nama);
     }
     
    //getter
    public String getNoTelepon()
    {
        return noTelepon;
    }
    public Integer getId()
    {
        return super.getId();
    }
    public String getNama()
    {
        return super.getNama();
    } 
}


