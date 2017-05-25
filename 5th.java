/*
Prac 5
Name- Amit Amola
College- Ramjas College
Section B Group B
*/

import java.util.Scanner;
import java.io.*;
import java.lang.Math.*;

class Fib
{  
 static int n1=0,n2=1,n3=0;    
 static void printFibonacci(int count)
 {    
    if(count>0)
    {    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
    }
 } 
         
 
 public static void main(String args[])throws IOException
 {    
  Scanner iput=new Scanner(System.in);

  System.out.println("How many terms you want?");
  int count= iput.nextInt();
   
  System.out.print(n1+" "+n2);    
  printFibonacci(count-2);  
 }  
}  

/* Output:
How many terms you want?
15
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
*/