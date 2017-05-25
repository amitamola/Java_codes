/*Prac 13
Name- Amit Amola
College- Ramjas College
Section B Group B
*/

import java.util.Scanner;
import java.io.*;
import java.lang.Math.*;

public class eoqi
{
public static void main(String[] args)throws IOException 
{
 
Scanner iput = new Scanner(System.in);
Scanner sput = new Scanner(System.in);
int r;
String ch;
 eoq  o1=new eoq();
 epq  o2=new epq();
 eoqs o3=new eoqs();
 epqs o4=new epqs();

  do{
   System.out.println("\n\t\t\tInventory System\n");
   System.out.println("Select a command:\n1.EOQ\n2.EPQ\n3.EOQ with shortages allowed");
   System.out.println("4.Generalised Lot size model\n");

r=iput.nextInt();

switch(r)

{
case 1:

 o1.input();
 o1.calq();
 o1.display();
break;

case 2:

 o2.input();
 o2.input2();
 o2.calepq();
 o2.display();
break;

case 3: 
 o3.input();
 o3.input3();
 o3.caleoqs();
 o3.display();
break;

case 4:
 o4.input();
 o4.input4();
 o4.calepqs();
 o4.display();
break;

default: System.out.println("Enter valid key!");
 }


  System.out.println("\nType YES to restart the program.");
    ch=sput.nextLine();

   }while(ch.equals("YES"));

 }

}

class eoq
{
 Scanner in = new Scanner(System.in);
 protected double a,ic,l,q;
 
 public void input()
 {
  System.out.print("\nEnter Ordering cost per order:");
  a=in.nextDouble();
 System.out.print("\nEnter inventory carrying charge per unit per unit time:");
  ic=in.nextDouble();
 System.out.print("\nEnter annual demand:");
  l=in.nextDouble();
  
  }

 public void calq()
{
 q=(2*a*l)/(ic);
 q=Math.sqrt(q);
 }

 public void display() 
 {
  System.out.println("\nOptimum order/production quantity="+q);
  }

 }

class epq extends eoq
{
 Scanner in2 = new Scanner(System.in);
 double s;
 
 public void input2()
{
 System.out.print("\nEnter annual supply:");
 s=in2.nextDouble();
 
 }
 
public void calepq()
{
 q=((2*a*l/ic)*(s/(s-l)));
 q=Math.sqrt(q);
 }
}

class eoqs extends eoq
{
 Scanner in3 = new Scanner(System.in);
 double sc;
 
 public void input3()
{
 System.out.print("\nEnter stock cost per unit per unit time:");
 sc=in3.nextDouble();
 
 }
 
public void caleoqs()
{
 q=((2*a*l/ic)*((ic+sc)/sc));
 q=Math.sqrt(q);
 }
 
 } 

class epqs extends eoq
{
 Scanner in4 = new Scanner(System.in);
 double sc,s;
 
 public void input4()
{
 System.out.print("\nEnter annual supply:");
 s=in4.nextDouble();
 System.out.print("\nEnter stock cost per unit per unit time:");
 sc=in4.nextDouble();
 
 }
 
public void calepqs()
{
 q=((2*a*l/ic)*(s/(s-l))*((ic+sc)/sc));
 q=Math.sqrt(q);
 }
 
 }
 
/* Output:

                        Inventory System

Select a command:
1.EOQ
2.EPQ
3.EOQ with shortages allowed
4.Generalised Lot size model

1

Enter Ordering cost per order:300

Enter inventory carrying charge per unit per unit time:30

Enter annual demand:10000

Optimum order/production quantity=447.21359549995793

Type YES to restart the program.
YES

                        Inventory System

Select a command:
1.EOQ
2.EPQ
3.EOQ with shortages allowed
4.Generalised Lot size model

2

Enter Ordering cost per order:20

Enter inventory carrying charge per unit per unit time:32

Enter annual demand:4000

Enter annual supply:5000

Optimum order/production quantity=158.11388300841898

Type YES to restart the program.
YES

                        Inventory System

Select a command:
1.EOQ
2.EPQ
3.EOQ with shortages allowed
4.Generalised Lot size model

3

Enter Ordering cost per order:30

Enter inventory carrying charge per unit per unit time:22

Enter annual demand:5000

Enter stock cost per unit per unit time:24

Optimum order/production quantity=161.6674476707158

Type YES to restart the program.
YES

                        Inventory System

Select a command:
1.EOQ
2.EPQ
3.EOQ with shortages allowed
4.Generalised Lot size model

4

Enter Ordering cost per order:50

Enter inventory carrying charge per unit per unit time:4

Enter annual demand:1200

Enter annual supply:1500

Enter stock cost per unit per unit time:4

Optimum order/production quantity=547.7225575051662

Type YES to restart the program.
No
*/