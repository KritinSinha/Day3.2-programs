/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseladder;

import java.util.Scanner;
public class Ifelseladder 
{
    public static void main(String[] args) 
    {
     int x,y,z;
     Scanner sc=new Scanner(System.in);// Scanner is class and sc is its object
     System.out.println("Enter the first number");
     x=sc.nextInt();
     System.out.println("Enter the second number");
     y=sc.nextInt();
     System.out.println("Enter the third number");
     z=sc.nextInt();
     
     if(x>y&&x>z)
     {
         System.out.println("The largest number is x"+x);
     }
     else if(y>z)
     {
         System.out.println("The largest number is y"+y);
     }
     else
     {
         System.out.println("The largest number is z"+z);
     }
    }
    
}
