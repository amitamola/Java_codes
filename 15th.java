/*
Prac 15
Name- Amit Amola
College- Ramjas College
Section B Group B
*/

import java.io.*;
import java.lang.*;

class queu
{
	public BufferedReader o=new BufferedReader(new InputStreamReader(System.in));
	public String str;
	void m1() throws IOException
	{
		System.out.println("We have 1 server\n arrival rate should be less then service rate");
		System.out.println("Enter value of arrival rate:");
		str=o.readLine();
		float l=Float.parseFloat(str);
		System.out.println("Enter value of service rate:");
		str=o.readLine();
		float u=Float.parseFloat(str);
		float r,h;
		r=l/u;
		h=(r/(1-r))*r;
		System.out.println("Traffic intensity(rho):"+r);
		System.out.println("probability that there is no customer in the system(P(0)):"+(1-r));
		System.out.println("		MEASURE OF EFFECTIVNESS");
		System.out.println("1.avgerage no. of customers in the system="+r/(1-r));
		System.out.println("2.avgerage no. of customers in the queue="+h);
		System.out.println("3.Expected waiting time of customers in the system="+1/(u-l));
		System.out.println("4.Expected waiting time of customers in the system="+l/((u-l)*u));
	}
 
  void m2() throws IOException
  {
	System.out.println("Now we have '2' servers\narrival rate should be less then twice of service rate");
	System.out.println("Enter value of arrival rate:");
	str=o.readLine();
	float l=Float.parseFloat(str);
	System.out.println("enter value of service rate:");
	str=o.readLine();
	float u=Float.parseFloat(str);
	float r,s,z;
	r=l/u;
	System.out.println("traffic intensity(rho):"+r);
	s=1/(1+r+(r*r*(u/(2*u-l))));
	z=(r*r*l*u*s)/((2*u-l)*(2*u-l));
	System.out.println("probability that there is no customer in the system(P(0)):"+s);
	System.out.println("          MEASURE OF EFFECTIVNESS ");
	System.out.println("1.avgerage no. of customers in the system="+(z+r));
	System.out.println("2.avgerage no. of customers in the queue="+z);
	System.out.println("3.Expected waiting time of customers in the queue="+(z/l));
	System.out.println("4.Expected waiting time of customers in the system="+((z/l)+(1/u)));
  }
	void m3() throws IOException
    {
	System.out.println("now we have 'unlimited' servers i.e self service process/model");
	System.out.println("enter value of arrival rate:");
	str=o.readLine();
	float l=Float.parseFloat(str);
	System.out.println("enter value of service rate:");
	str=o.readLine();
	float u=Float.parseFloat(str);
	float r;
	double s;
	r=l/u;
	System.out.println("traffic intensity(rho):"+r);
	s=Math.exp(-l/u);
	System.out.println("probability that there is no customer in the system(P(0)):"+s);
	System.out.println("          MEASURE OF EFFECTIVNESS ");
	System.out.println("1.avgerage no. of customers in the system="+r);
	System.out.println("4.Expected waiting time of customers in the system="+(1/u));
    }

}



public class queumodels
{
  public static void main(String[]args) throws IOException
 {
	String a,c;
	queu q1=new queu();
	BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("QUEUING MODELS");
	System.out.println("1.m|m|1");
	System.out.println("2.m|m|2");
	System.out.println("3.m|m|inf");
	do
{

	System.out.print("enter choice:");
	a=rd.readLine();
	int d=Integer.parseInt(a);

	switch(d)
 {
  case 1:

   System.out.println("\nFIRST MODEL");
   System.out.println("\tM|M|1");
   q1.m1();
   break;

  case 2:
   System.out.println("\nSECOND MODEL ");
   System.out.println("\tM|M|2");
   q1.m2();
   break;

  case 3:
   System.out.println("\nTHIRD MODEL ");
   System.out.println("\tM|M|infinity");
   q1.m3();
   break;

  default:
   System.out.println("wrong choice");
   break;
 }
 System.out.println("wanna try more(y/n)");
 c=rd.readLine();
}

while(c.equals("Y")||c.equals("y"));

System.out.println("\nTHE END");
}

}
/*
Output:
QUEUING MODELS
1.m|m|1
2.m|m|2
3.m|m|inf
enter choice:1

FIRST MODEL
        M|M|1
We have 1 server
 arrival rate should be less then service rate
Enter value of arrival rate:
3
Enter value of service rate:
4
Traffic intensity(rho):0.75
probability that there is no customer in the system(P(0)):0.25
                MEASURE OF EFFECTIVNESS
1.avgerage no. of customers in the system=3.0
2.avgerage no. of customers in the queue=2.25
3.Expected waiting time of customers in the system=1.0
4.Expected waiting time of customers in the system=0.75
wanna try more(y/n)
y
enter choice:2

SECOND MODEL
        M|M|2
Now we have '2' servers
arrival rate should be less then twice of service rate
Enter value of arrival rate:
5
enter value of service rate:
6
traffic intensity(rho):0.8333333
probability that there is no customer in the system(P(0)):0.41176474
          MEASURE OF EFFECTIVNESS
1.avgerage no. of customers in the system=1.0084033
2.avgerage no. of customers in the queue=0.17507002
3.Expected waiting time of customers in the queue=0.035014004
4.Expected waiting time of customers in the system=0.20168068
wanna try more(y/n)
y
enter choice:3

THIRD MODEL
        M|M|infinity
now we have 'unlimited' servers i.e self service process/model
enter value of arrival rate:
6
enter value of service rate:
7
traffic intensity(rho):0.85714287
probability that there is no customer in the system(P(0)):0.42437284206343673
          MEASURE OF EFFECTIVNESS
1.avgerage no. of customers in the system=0.85714287
4.Expected waiting time of customers in the system=0.14285715
wanna try more(y/n)
n

THE END


*/