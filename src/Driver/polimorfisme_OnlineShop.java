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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    class OnlineShop {
        public String respons()
        {
            return ("Sistem Belanja Online");
        } 
    }

    class Customer extends OnlineShop {
        public String respons()
        {
            return ("Orang yang membeli suatu produk barang atau jasa");
        } 
    }

    class Item extends OnlineShop{
        public String respons()
        {
            return ("Produk fisik yang bisa dibeli oleh customer");
        }
    }

    class Order extends OnlineShop{
        public String respons()
        {
            return ("Pesanan atau pembelian barang kepada penjual");
        }
    }

    public class polimorfisme_OnlineShop
    {
        public static void main(String [] args)
        {
            OnlineShop objOS = new OnlineShop();
            Customer objCustomer = new Customer();
            Item objItem = new Item();
            Order objOrder = new Order();

            OnlineShop[] OS = new OnlineShop[4];
            OS[0] = objOS;
            OS[1] = objCustomer;
            OS[2] = objItem;
            OS[3] = objOrder;
            
            System.out.println("==============================================================");
            System.out.println("                  POLIMORFISME ONLINE SHOP                    ");
            System.out.println("==============================================================");

            System.out.println("Online Shop  :"+OS[0].respons());
            System.out.println("Customer     :"+OS[1].respons());
            System.out.println("Item         :"+OS[2].respons());
            System.out.println("Order        :"+OS[3].respons());
            System.out.println("==============================================================");


            
        }
    }
