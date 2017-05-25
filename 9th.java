/*
Prac 9
Name- Amit Amola
College- Ramjas College
Section B Group B
*/

import java.util.Scanner;
import java.io.*;
import static java.lang.Math.*;

public class statistica
{
 public static void main(String args[])throws IOException
{

 Scanner iput=new Scanner(System.in);
 Scanner sput=new Scanner(System.in);
  
 int r;
 double[] x= new double[20];
 double[] y= new double[20];
 String ch;
 double n,hmx,amx,gmx,amy,gmy,hmy,vary,varx,cov,rxy,ryx;
 do{
 
 System.out.print("_________________________________________________________________\n");
 System.out.println("\n\t\tStatistical Calculator\nSelect a command:\n");
 System.out.println("1-Univariate Data\n2-Bivariate Data");
 
 r=iput.nextInt();
 
 switch(r)
{
 case 1:
 System.out.println("\n\t\tUnivariate Data\n");
 
 dsize();
 
 n=iput.nextInt();
 
 System.out.println();
 System.out.println("\nEnter Data:");

 inputData(n,x);
  
 amx=amean(n,x);
 gmx=gmean(n,x);  
 hmx=hmean(n,x);
 varx=variance(n,x,amx);

 System.out.println("\nResults:\n\nAM: "+amx+"\nGM: "+gmx+"\nHM: "+hmx+"\nVaraince: "+varx);
 
 break; 


 case 2:
 System.out.println("\n\t\tBivariate Data\n");
 
 dsize();
 
 n=iput.nextInt();
 
 System.out.println();
 System.out.println("\nEnter Data for X:");
 
 inputData(n,x);
  
 System.out.println("\nEnter Data for Y:");
 inputData(n,y);

 amx=amean(n,x);
 gmx=gmean(n,x);  
 hmx=hmean(n,x);
 varx=variance(n,x,amx);

 amy=amean(n,y);
 gmy=gmean(n,y);  
 hmy=hmean(n,y);
 vary=variance(n,y,amy);

 cov=covariance(x,y,amx,amy,n);
 rxy=cov/vary;
 ryx=cov/varx;



 System.out.println("\nResults:\n\nCovariance between X and Y: "+cov+"\nRegression Cofficient of X on Y: "+rxy);
 System.out.println("Regression Cofficient of Y on X: "+ryx);

 System.out.println("\nDATA X:\n\nAM: "+amx+"\nGM: "+gmx+"\nHM: "+hmx+"\nVaraince: "+varx);

 System.out.println("\nDATA Y:\n\nAM: "+amy+"\nGM: "+gmy+"\nHM: "+hmy+"\nVaraince: "+vary);
 
 break;

 default:
 System.out.println("Press valid key\n");
 
 }//Switch Ends


System.out.print("_________________________________________________________________\n");

 System.out.println();
 System.out.println("To restart type YES");
  ch=sput.nextLine();

  }while(ch.equals("YES"));


}//main ends

//METHODS

static void dsize()
{
 System.out.print("Enter data size:");
 }


static void inputData(double a,double[] z)
{
 Scanner xput=new Scanner(System.in);
  
  for(int i=0;i<a;i++)
   z[i]=xput.nextDouble();
 
 }


static double amean(double a,double[] z)
{
 double am=0;
  for(int i=0;i<a;i++)
   am=am+z[i];

 am=am/a;
 
 return am;
 }

static double gmean(double a,double[] z)
{
 double g; 
 double gm=1;
  
  for(int i=0;i<a;i++)
   gm=(gm*z[i]);
 
 g=1/a;
 
 gm=Math.pow(gm,g);
 
 return gm;

 }

static double hmean(double a,double[] z)
{
 double hm=0;
  for(int i=0;i<a;i++)
   hm=(hm+(1/z[i]));

 hm=hm/a;
 hm=1/hm;
 
 return hm;
 }



static double variance(double a,double[] z,double b)
{
 double var=0;
  for(int i=0;i<a;i++)
   var=var+(z[i]*z[i]);
 
 var=var/a;
 
 var=var-(b*b);

 return var;
 }


static double covariance(double[] w,double[] z,double a,double b,double c)
{
 double cov=0;
 
 for(int i=0;i<c;i++)
   cov=cov+(w[i]*z[i]);

 cov=cov/c;
 
 cov=cov-(a*b);
 
 return cov;
  
 }
}

/*OUTPUT

_________________________________________________________________

                Statistical Calculator
Select a command:

1-Univariate Data
2-Bivariate Data
1

                Univariate Data

Enter data size:5


Enter Data:
5
9
11
9
7

Results:

AM: 8.2
GM: 7.9211666382845385
HM: 7.622085349758031
Varaince: 4.160000000000011
_________________________________________________________________

To restart type YES
YES
_________________________________________________________________

                Statistical Calculator
Select a command:

1-Univariate Data
2-Bivariate Data
2

                Bivariate Data

Enter data size:4


Enter Data for X:
2
5
7
3

Enter Data for Y:
2
6
3
6

Results:

Covariance between X and Y: 0.1875
Regression Cofficient of X on Y: 0.058823529411764705
Regression Cofficient of Y on X: 0.05084745762711865

DATA X:

AM: 4.25
GM: 3.80675409583932
HM: 3.400809716599191
Varaince: 3.6875

DATA Y:

AM: 4.25
GM: 3.833658625477635
HM: 3.4285714285714284
Varaince: 3.1875
_________________________________________________________________

To restart type YES
No

*/