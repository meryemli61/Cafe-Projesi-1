package org.example;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.text.DateFormat;

public class Program
{
    public static void main( String[] args )
    {

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());

        customerManager.Save(new Customer(6789, "Meryem", "Alibeyoglu", 1804, 123456789));





        //version2 icin yapilan degisiklik//


        customerManager.Save(new Customer(1234, "Ayse","Kaya" , 1990, 987654321));

        customerManager.Save(new Customer(5678, "Fatma", "Yilmaz", 1995, 918273645));



    }
}
