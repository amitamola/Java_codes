import java.lang.Math.*;

class sq
{ 

 int k,l,m;
 double p,q,r;

 sq(int a)
 {
  k=a;
  l=k*k;
  m=4*k;
  System.out.println("The area of square is "+l);
  System.out.println("The perimeter of square is "+m);
 }

 sq(double c)
 {
  p=c;
  q=p*p;
  r=4*p;
  System.out.println("The area of square is "+q);
  System.out.println("The perimeter of square is "+r);
 }
}

class tri
{ 

 double k,l,m,n,o,p,q,r,s,t;

 tri(int a,int b)
 {
  k=a;
  l=b;
  m=0.5*k*l;
  n=Math.sqrt((k*k)+(l*l));
  o=k+l+n;
  System.out.println("The area of triangle is "+m);
  System.out.println("The perimeter of triangle is "+o);
 }

 tri(double c,double d)
 {
  p=c;
  q=d;
  r=0.5*p*q;
  s=Math.sqrt((p*p)+(q*q));
  t=p+q+n;
  System.out.println("The area of triangle is "+r);
  System.out.println("The perimeter of triangle is "+t);
 }
}


class cir
{ 

 double k,l,m,p,q,r;

 cir(int a)
 {
  k=a;
  l=3.15*k*k;
  m=2*3.15*k;
  System.out.println("The area of circle is "+l);
  System.out.println("The circumference of circle is "+m);
 }

 cir(double c)
 {
  p=c;
  q=3.15*p*p;
  r=2*3.15*p;
  System.out.println("The area of circle is "+q);
  System.out.println("The circumference of circle is "+r);
 }
}

class rect
{ 

 int k,l,m,n;
 double p,q,r,s;

 rect(int a,int b)
 {
  k=a;
  l=b;
  m=k*l;
  n=2*(k+l);
  System.out.println("The area of rectangle is "+m);
  System.out.println("The perimeter of rectangle is "+n);
 }

 rect(double c,double d)
 {
  p=c;
  q=d;
  r=p*q;
  s=2*(p+q);
  System.out.println("The area of rectangle is "+r);
  System.out.println("The perimeter of rectangle is "+s);
 }
}

class consgeo
{
 public static void main(String a[])
 { 
  sq ob1= new sq(5);
  sq ob2= new sq(3.1);
  tri ob3= new tri(5,6);
  tri ob4= new tri(3.1,7.5);
  cir ob5= new cir(5);
  cir ob6= new cir(3.1);
  rect ob7= new rect(4,8);
  rect ob8= new rect(5.7,3.7);
 }
} 

/*The area of square is 25
The perimeter of square is 20
The area of square is 9.610000000000001
The perimeter of square is 12.4
The area of triangle is 15.0
The perimeter of triangle is 18.810249675906654
The area of triangle is 11.625
The perimeter of triangle is 10.6
The area of circle is 78.75
The circumference of circle is 31.5
The area of circle is 30.271500000000003
The circumference of circle is 19.53
The area of rectangle is 32
The perimeter of rectangle is 24
The area of rectangle is 21.090000000000003
The perimeter of rectangle is 18.8
*/