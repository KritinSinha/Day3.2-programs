/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchadd;

import java.util.Scanner;
public class SwitchAdd {

   
    public static void main(String[] args) 
    {
      int x,y,z;
      System.out.println("1.Add");
      System.out.println("2.Subtract");
      System.out.println("3.Exit");
      System.out.println("Enter your choice");
      
      Scanner sc=new Scanner(System.in);
      int choice;
      choice=sc.nextInt();
      
      switch(choice)
      {
          case 1:
              System.out.println("Enter first number");
              x=sc.nextInt();
              System.out.println("Enter second number");
              y=sc.nextInt();
              z=x+y;
              System.out.println("The sum is"+z);
              break;
              
          case 2:
              System.out.println("Enter first number");
              x=sc.nextInt();
              System.out.println("Enter second number");
              y=sc.nextInt();
              z=x-y;
              System.out.println("The difference is"+z);
              break;
              
          case 3:
              System.exit(0);
              break;
              
          default:
              System.out.println("PLease Enter tThe Correct Information");
              break;
      }
      
    }
    
}
