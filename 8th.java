/*
Prac 8
Name- Amit Amola
College- Ramjas College
Section B Group B
*/

import java.io.*;

class lin
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("/********************************************************/");
System.out.println("Welcome to this Line Fitting Systen! ");
System.out.println();
System.out.println("Enter the number of observations " );

int n=Integer.parseInt(br.readLine());
double a[]=new double[2*n];

System.out.println("start entering the values ");
for(int i=0;i<2*n;i+=2)
{
System.out.println ("enter the value of x");
a[i]=Double.parseDouble(br.readLine());
System.out.println ("enter the value of y");
a[i+1]=Double.parseDouble(br.readLine());
}
double ox=0.0,soy=0.0,sox2=0.0,soxy=0.0;
for(int i=0;i<2*n;i=i+2)
ox+=a[i];
for(int i=1;i<2*n;i=i+2)
soy+=a[i];
for(int i=0;i<2*n;i=i+2)
sox2+=a[i]*a[i];
for(int i=0;i<2*n;i=i+2)
soxy+=a[i]*a[i+1];

System.out.println(ox+" "+soy+"  "+soxy+" "+sox2);

double slope=0.0,intc=0.0;
slope=(((n*soxy)-(ox)*(soy))/((n*sox2)-(ox*ox)));

intc=(soy-(slope*ox))/n;

System.out.println("y= "+slope+"x +"+intc);

double mse=0.0;
for (int i=1;i<2*n;i+=2)
{
mse+= (((soy/n)-a[i])*((soy/n)-a[i]));
}
mse=mse/n;

System.out.println ("the mse is "+mse );

}
}

/*Output:

/********************************************************/
Welcome to this Line Fitting Systen!

Enter the number of observations
5
start entering the values
enter the value of x
6
enter the value of y
7
enter the value of x
7
enter the value of y
8
enter the value of x
6
enter the value of y
5
enter the value of x
8
enter the value of y
9
enter the value of x
5
enter the value of y
3
32.0 32.0  215.0 210.0
y= 1.9615384615384615x +-6.153846153846153
the mse is 4.64

*/

