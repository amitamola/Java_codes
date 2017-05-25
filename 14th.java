/*Prac 14
Name- Amit Amola
College- Ramjas College
Section B Group B
*/

import java.util.Scanner;
import java.io.*;
import static java.lang.Math.*;

class relsp
{ int n;
  double p=1,s=1;
  Scanner in=new Scanner(System.in);
  
  void series()

  {
  System.out.print("Enter number of components:");
  n=in.nextInt();
  System.out.println();

  double A[]=new double[n];
 
  for(int i=0;i<n;i++)
  {
   System.out.print("Enter the reliability of unit "+(1+i)+":");
   
    A[i]=in.nextDouble();
   
    System.out.println();	 
  
    s*=A[i];
  }
  System.out.println("\nReliability of  series system="+s);
  }
  
  
  void parallel()
  {
  System.out.print("Enter number of components:");
  n=in.nextInt();
  System.out.println();

  double A[]=new double[n];
  
  for(int i=0;i<n;i++)
  {
   System.out.print("Enter the reliability of unit "+(i+1)+":");
    
    A[i]=in.nextDouble();
    
     System.out.println();
	 
    p*=(1-A[i]);
	  
  }
  System.out.println("\nReliability of system "+(1-p));
  }
}  
public class rel
{
 public static void main(String[]args) 
 { 
  relsp o=new relsp();
  Scanner in2=new Scanner(System.in);
  Scanner sput=new Scanner(System.in); 
  String ch;
  int r;
 
 do
 {
  System.out.println("\nReliabilty Systems\n\nSelect a command");
  System.out.println("1.Series System");
  System.out.println("2.Parallel System");
  System.out.println();

  r=in2.nextInt();

  switch(r)
  { 
    case 1:  o.series();
              break;
    case 2:  o.parallel();
              break;	
    default:  System.out.println("Invalid command!");
              break;			  
  }

  System.out.println("\nType /rst to restart the program.");
    ch=sput.nextLine();

   }while(ch.equals("/rst"));
 
 }

}


/*Output

Reliabilty Systems

Select a command
1.Series System
2.Parallel System

1
Enter number of components:3

Enter the reliability of unit 1:0.5

Enter the reliability of unit 2:0.2

Enter the reliability of unit 3:0.6


Reliability of  series system=0.06

Type /rst to restart the program.
/rst

Reliabilty Systems

Select a command
1.Series System
2.Parallel System

2
Enter number of components:4

Enter the reliability of unit 1:0.5

Enter the reliability of unit 2:0.6

Enter the reliability of unit 3:0.2

Enter the reliability of unit 4:0.04


Reliability of system 0.8464

Type /rst to restart the program.
No

*/   