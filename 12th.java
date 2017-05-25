/*
Prac 12
Name- Amit Amola
College- Ramjas College
Section B Group B
*/

import java.util.Scanner;
import java.io.*;
import java.lang.Math.*;
public class matrix
{ 
  public static void main(String args[])throws IOException
   {  
     Scanner iput=new Scanner(System.in);
     Scanner sput=new Scanner(System.in);
   
     int m1,m2,n1,n2,response;
     double a[][]=new double[30][30];
     double b[][]=new double[30][30];
     String ch;
  
   do
  {
   System.out.println("\n\t\t\tMATRIX OPERATIONS\n");
   System.out.println("Select a command:\n1.Addition\n2.Subtraction\n3.Multiplication");
   System.out.println("4.Transpose\n5.Symmetric\n6.Skew Symmetric\n");

   response=iput.nextInt();

   switch(response)
   {
    case 1:
   
      System.out.println("\n\t\t\tADDITION\n");
      
      System.out.print("Enter order of first matrix:");
         m1=iput.nextInt();
         n1=iput.nextInt();

      System.out.println();     

      System.out.print("Enter order of second matrix:");
         m2=iput.nextInt();
         n2=iput.nextInt();

     
     
      if(m1==m2&&n1==n2)
       {
        System.out.println("\nEnter the first matrix row wise:");
          inputMatrix(a,m1,n1);
        
        System.out.println("\nEnter the second matrix row wise:");
          inputMatrix(b,m2,n2);

        System.out.println("\nSum of Two matrices=");
	  sum(a,b,m1,n1);
        }
    
      else triggerError();

      break;

    case 2:
   
     System.out.println("\n\t\t\tSUBTRACTION\n");
     
     System.out.print("Enter order of first matrix:");
       m1=iput.nextInt();
       n1=iput.nextInt();
   
     System.out.println();
    
     System.out.print("Enter order of second matrix:");
       m2=iput.nextInt();
       n2=iput.nextInt();
    
     if(m1==m2&&n1==n2)
      {
        System.out.println("\nEnter the first matrix row wise:");
          inputMatrix(a,m1,n1);
   
        System.out.println("\nEnter the second matrix row wise:");
          inputMatrix(b,m2,n2);
      
        System.out.println("\nDifference of Two matrices=");
	   sub(a,b,m1,n1);
       }

     else triggerError();

     break;

    case 3:

     System.out.println("\n\t\t\tMULTIPLICATION\n");
     
     System.out.print("Enter order of first matrix:");
       m1=iput.nextInt();
       n1=iput.nextInt();
  
     System.out.println();
    
     System.out.print("Enter order of second matrix:");
       m2=iput.nextInt();
       n2=iput.nextInt();
     
     if(n1==m2)
      {
        System.out.println("\nEnter the first matrix row wise:");
          inputMatrix(a,m1,n1);
        
        System.out.println("\nEnter the second matrix row wise:");
          inputMatrix(b,m2,n2);

        System.out.println("\nProduct of Two matrices=");
	  prod(a,b,m1,n2,n1);
       }

    else triggerError();
 
    break;

   case 4:
   
    System.out.println("\n\t\t\tTRANSPOSE\n");

    System.out.print("Enter order of matrix:");
      m1=iput.nextInt();
      n1=iput.nextInt();
    
    System.out.println();  
  
    System.out.println("\nEnter Matrix row wise:");
      inputMatrix(a,m1,n1);
    
    System.out.println("\nTranspose of above matrix is:");
     transpose(a,m1,n1);
    
    break;


   case 5:
    System.out.println("\n\t\t\tSYMMETRIC\n");
    
    System.out.print("Enter order of square matrix:");
      m1=iput.nextInt();

    System.out.println();    

    System.out.println("\nEnter matrix row wise:");
     inputMatrix(a,m1,m1);
     
    checks(a,m1);

    break;

   case 6:
    
    System.out.println("\n\t\t\tSKEW SYMMETRIC\n");
   
    System.out.print("Enter order of square matrix:");
      m1=iput.nextInt();
    
    System.out.println();
 
    System.out.println("\nEnter matrix row wise:");
      inputMatrix(a,m1,m1);
     
    checkss(a,m1);
    
    break;

   default:
    System.out.println("Press valid key\n");
 
     }//Switch Ends

  System.out.println("\nType YES to restart the program.");
    ch=sput.nextLine();

   }while(ch.equals("YES"));
    
  }

//METHODS

static void triggerError()
{
System.out.println("\n\t\t\tError\n\tSomething wrong with order of matrices.");
 }


static void inputMatrix(double[][] x,int m,int n)
{ 
 Scanner iiput=new Scanner(System.in);
 
  for(int i=0;i<m;i++)
  { 
    for(int j=0;j<n;j++)
      x[i][j]=iiput.nextDouble();

   }
 }


static void displayResult(double[][] x,int m,int n)
{
 for(int i=0;i<m;i++)
 {
   for(int j=0;j<n;j++)
     System.out.print(x[i][j]+"\t");

  System.out.println();	  
   }
 }


static void sum(double[][] a,double[][] b,int m,int n)
{
  double c[][]= new double[30][30];

  for(int i=0;i<m;i++)
   for(int j=0;j<n;j++)
    c[i][j]=a[i][j]+b[i][j];

 
   displayResult(c,m,n);
 }


static void sub(double[][] a,double[][] b,int m,int n)
{
  double c[][]= new double[30][30];

  for(int i=0;i<m;i++)
   for(int j=0;j<n;j++)
    c[i][j]=a[i][j]-b[i][j];

   displayResult(c,m,n);
 }


static void prod(double[][] a,double[][] b,int m,int n,int l)
{
  double c[][]=new double[30][30];

  for(int i=0;i<m;i++)
   for(int j=0;j<n;j++)
     {
       c[i][j]=0;

        for(int k=0;k<l;k++)
          c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
      }
   
   displayResult(c,m,n);

 }


static void transpose(double[][] x,int m,int n)
{
  double c[][]=new double[30][30];
  
   for(int i=0;i<n;i++)
     for(int j=0;j<m;j++)
        c[i][j]=x[j][i];

   displayResult(c,n,m);
 }


static void trace(double[][] x,int m)
{
 double tr=0;
  
 for(int i=0;i<m;i++)
    tr=tr+x[i][i];
  
 System.out.println("Trace of given square matrix="+tr);
 }


static void checks(double[][] x,int m)
{ int i,j,code=0;
  double c[][]=new double[30][30];

   for(i=0;i<m;i++)
     for(j=0;j<m;j++)
        c[i][j]=x[j][i];


     for(i=0;i<m;i++)
       {
        for(j=0;j<m;j++)
         {
          if(c[i][j]!=x[i][j])
          { 
             code=1;
             break;
            }
            else continue;
           }
         if(code==1)
             break;
        
         else continue;
          }

    if(i==m)
      System.out.println("Matrix is Symmetric.");
    
    else
      System.out.println("Matrix is not Symmetric.");

 }


static void checkss(double[][] x,int m)
{

 int i,j,code=0;
 double c[][]=new double[30][30];

   for(i=0;i<m;i++)
     for(j=0;j<m;j++)
        c[i][j]=x[j][i];


     for(i=0;i<m;i++)
       {
         for(j=0;j<m;j++)
         {
          if(c[i][j]!=(-x[i][j]))
          { 
             code=1;
             break;
           }
            else continue;
          }
         
         if(code==1)
             break;
         else continue;
       }
    if(i==m)
      System.out.println("Matrix is Skew Symmetric.");
    
    else
      System.out.println("Matrix is not Skew Symmetric.");
 }


}	


/*

                        MATRIX OPERATIONS

Select a command:
1.Addition
2.Subtraction
3.Multiplication
4.Transpose
5.Symmetric
6.Skew Symmetric

1

                        ADDITION

Enter order of first matrix:2
2

Enter order of second matrix:2
2

Enter the first matrix row wise:
4
14
5
15

Enter the second matrix row wise:
1
4
5
2

Sum of Two matrices=
5.0     18.0
10.0    17.0

Type YES to restart the program.
YES

                        MATRIX OPERATIONS

Select a command:
1.Addition
2.Subtraction
3.Multiplication
4.Transpose
5.Symmetric
6.Skew Symmetric

2

                        SUBTRACTION

Enter order of first matrix:2
2

Enter order of second matrix:2
2

Enter the first matrix row wise:
4
5
62
2

Enter the second matrix row wise:
5
6
2
5

Difference of Two matrices=
-1.0    -1.0
60.0    -3.0

Type YES to restart the program.
YES

                        MATRIX OPERATIONS

Select a command:
1.Addition
2.Subtraction
3.Multiplication
4.Transpose
5.Symmetric
6.Skew Symmetric

3

                        MULTIPLICATION

Enter order of first matrix:2
2

Enter order of second matrix:2
2

Enter the first matrix row wise:
4
21
4
5

Enter the second matrix row wise:
14
51
5
1

Product of Two matrices=
161.0   225.0
81.0    209.0

Type YES to restart the program.
YES

                        MATRIX OPERATIONS

Select a command:
1.Addition
2.Subtraction
3.Multiplication
4.Transpose
5.Symmetric
6.Skew Symmetric

4

                        TRANSPOSE

Enter order of matrix:2
2


Enter Matrix row wise:
5
1
5
14

Transpose of above matrix is:
5.0     5.0
1.0     14.0

Type YES to restart the program.
YES

                        MATRIX OPERATIONS

Select a command:
1.Addition
2.Subtraction
3.Multiplication
4.Transpose
5.Symmetric
6.Skew Symmetric

5

                        SYMMETRIC

Enter order of square matrix:2


Enter matrix row wise:
2
5
7
4
Matrix is not Symmetric.

Type YES to restart the program.
YES

                        MATRIX OPERATIONS

Select a command:
1.Addition
2.Subtraction
3.Multiplication
4.Transpose
5.Symmetric
6.Skew Symmetric

6

                        SKEW SYMMETRIC

Enter order of square matrix:2


Enter matrix row wise:
4
-4
4
1
Matrix is not Skew Symmetric.

Type YES to restart the program.
NO


*/