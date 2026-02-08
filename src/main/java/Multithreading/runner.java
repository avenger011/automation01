package Multithreading;

import org.openqa.selenium.By;

 class runner extends P1 {
     runner(String s)
     {
         if(s.equalsIgnoreCase("chrome"))
         {System.out.println("crome");}
     }



     public static void main(String[] args){
         // P1 p=new P1();
         P1 r1 = new P1("CHROME");
         P1 r2 = new P1("firefox");

     }
}
