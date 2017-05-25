/*Prac 10
Name- Amit Amola
College- Ramjas College
Section B Group B
*/

import java.io.*;
import java.lang.Math.*;

public class poiss
{
        public static void main(String args[])throws IOException
	{
         BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
 	 
	 int ch1;
	 System.out.println("Input data, number of cases?");
	 int n=Integer.parseInt(rd.readLine());
	 float x[]=new float[n];
	 float f[]=new float[n];
	 float p[]=new float[n];
	 float ef[]=new float[n];
	 float l,err=0,sumf=0,sumxf=0;
	 int i;
         System.out.println("Input data (xi)");
	  for(i=0;i<n;i++)
		x[i]=Float.parseFloat(rd.readLine());
	System.out.println("Input data (fi)");
	for(i=0;i<n;i++)
		f[i]=Float.parseFloat(rd.readLine());
	for(i=0;i<n;i++)
		sumf+=f[i];
	for(i=0;i<n;i++)
		sumxf+=x[i]*f[i];
	l=sumxf/sumf;
	System.out.println("lambda= "+l);
	p[0]=(float)Math.exp(-l);
	for(i=1;i<n;i++)
		p[i]=l*p[i-1]/x[i];
	for(i=0;i<n;i++)
		ef[i]=p[i]*sumf;
	for(i=0;i<n;i++)
		err+=(f[i]-ef[i])*(f[i]-ef[i])*p[i];
	System.out.println("The Poisson Fit is as follows");	  
	System.out.println("X	f[i]	ef[i]");
	for(i=0;i<n;i++)
		System.out.println(x[i]+"	"+f[i]+"	"+(int)ef[i]);
	System.out.println("Mean Square Error of fit is "+err);
}	

}
/* OUTPUT:

Input data, number of cases?
4
Input data (xi)
2
4
6
9
Input data (fi)
68
87
98
104
lambda= 5.62465
The Poisson Fit is as follows
X       f[i]    ef[i]
2.0     68.0    1
4.0     87.0    1
6.0     98.0    1
9.0     104.0   1
Mean Square Error of fit is 128.47414

*/	
         
