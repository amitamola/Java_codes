class sum
{ 
 int a,b,c;
 double d,e,f;

 void summ(int a,int b)
 {
  c=a+b;
  System.out.println("The sum of integers is= "+c);
 }
 
 void summ(double d, double e)
 { 
  f=d+e;
  System.out.println("The sum of numbers with decimal value is= "+f);
 }

 void summ(double d, int a)
 {
  f=d+a;
  System.out.println("The sum of numbers is= "+f);
 }
}

class sub
{ 
 int a,b,c;
 double d,e,f;

 void subb(int a,int b)
 {
  c=a-b;
  System.out.println("The difference of integers is= "+c);
 }
 
 void subb(double d, double e)
 { 
  f=d-e;
  System.out.println("The difference of numbers with decimal value is= "+f);
 }

 void sub(double d, int a)
 {
  f=d-a;
  System.out.println("The difference of numbers is= "+f);
 }
}

class m
{ 
 int a,b,c;
 double d,e,f;

 void mul(int a,int b)
 {
  c=a*b;
  System.out.println("The multiple of integers is= "+c);
 }
 
 void mul(double d, double e)
 { 
  f=d*e;
  System.out.println("The multiple of numbers with decimal value is= "+f);
 }

 void mul(double d, int a)
 {
  f=d*a;
  System.out.println("The multiple of numbers is= "+f);
 }
}

class d
{ 
 int a,b,c;
 double d,e,f;

 void div(int a,int b)
 {
  if(b!=0)
  {
  c=a/b;
  System.out.println("The division of integers is= "+c);
  }
 
  else
  {
   System.out.println("Division not possible");
  }
 }
 
 void div(double d, double e)
 { 
  if(e!=0)
  {
  f=d/e;
  System.out.println("The division of integers is= "+f);
  }
 
  else
  {
   System.out.println("Division not possible");
  }
 }
  
 void div(double d, int a)
 { 
  if(a!=0)
  {
  f=d/a;
  System.out.println("The division of integers is= "+f);
  }
 
  else
  {
   System.out.println("Division not possible");
  }
 }
}



class calc
{
 public static void main(String ar[])
 {
  sum ob1= new sum();
  ob1.summ(4,6);
  ob1.summ(6.5,2.5);
  ob1.summ(5.8,4);

  sub ob2=new sub();
  ob2.subb(4,6);
  ob2.subb(6.5,2.5);
  ob2.subb(5.8,4);

  m ob3=new m();
  ob3.mul(4,6);
  ob3.mul(6.5,2.5);
  ob3.mul(5.8,4);

  d ob4=new d();
  ob4.div(4,6);
  ob4.div(6.5,5.5);
  ob4.div(5.8,4);
  ob4.div(4,0);
 }
}


/*Output:
The sum of integers is= 10
The sum of numbers with decimal value is= 9.0
The sum of numbers is= 9.8
The difference of integers is= -2
The difference of numbers with decimal value is= 4.0
The difference of numbers with decimal value is= 1.7999999999999998
The multiple of integers is= 24
The multiple of numbers with decimal value is= 16.25
The multiple of numbers is= 23.2
The division of integers is= 0
The division of integers is= 1.1818181818181819
The division of integers is= 1.45
Division not possible
*/