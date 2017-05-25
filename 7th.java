/*
Prac 7
Name- Amit Amola
College- Ramjas College
Section B Group B
*/

import java.util.Scanner;
import java.io.*;
import java.lang.Math.*;

class Sort 
{  
 static void sortt(int[] arr, String [] name, int[] age) 
 {  
  int n = arr.length;  
  int temp = 0; 
  String a="";
  int atemp=0; 
 
  for(int i=0; i < n; i++)
  {  
   for(int j=1; j < (n-i); j++)
   {  
    if(arr[j-1] > arr[j])
    {
     temp = arr[j-1];  
     arr[j-1] = arr[j];  
     arr[j] = temp;  

     a= name[j-1];
     name[j-1] = name[j];  
     name[j] = a;

     atemp = age[j-1];
     age[j-1] = age[j];  
     age[j] = atemp;  
    }  
   }  
  }   
 } 
    
 public static void main(String [] args)throws IOException 
 {  

  Scanner iput=new Scanner(System.in);
  Scanner sput=new Scanner(System.in);

  System.out.println("How many employees are there?");
  int k=iput.nextInt();

  String name[]=new String[k];
  int arr[] =new int[k];  
  int age[]= new int[k]; 
  
  for(int i=0; i < k; i++)
  {  
   System.out.print("Name, Code and Age of employee no. "+ (i+1)+"\n");
   name[i]=sput.nextLine();
   arr[i]=iput.nextInt();
   age[i]=iput.nextInt();
  }  

  System.out.println();  
                  
  sortt(arr,name,age); 
                 
  System.out.println("After Sorting");  
  
  for(int i=0; i < arr.length; i++)
  {  
   System.out.println("Name, Code and Age of employee no. "+ (i+1));
   System.out.println(name[i]);
   System.out.println(arr[i]);
   System.out.println(age[i]); 
  }  
 }  
}
  
/* Output:

How many employees are there?
4
Name, Code and Age of employee no. 1
Amit Amola
45
22
Name, Code and Age of employee no. 2
Pooja
32
21
Name, Code and Age of employee no. 3
Eden
64
34
Name, Code and Age of employee no. 4
Keerti
43
32

After Sorting
Name, Code and Age of employee no. 1
Pooja
32
21
Name, Code and Age of employee no. 2
Keerti
43
32
Name, Code and Age of employee no. 3
Amit Amola
45
22
Name, Code and Age of employee no. 4
Eden
64
34
*/