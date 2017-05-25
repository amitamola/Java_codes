/*
Prac 18
Name- Amit Amola
College- Ramjas College
Section B Group B
*/

class Bisect
   {
      public static void main(String[] args)
      {
   	 final double epsilon = 0.00001;
   	 double a, b, m, y_m, y_a;
    
   	 a = 0;  b = 4;
    
   	 while ( (b-a) > epsilon )
   	 {
   	    m = (a+b)/2;          
    
   	    y_m = m*m + m - 3.0;      
   	    y_a = a*a + a - 3.0;          
   	    if ( (y_m > 0 && y_a < 0) || (y_m < 0 && y_a > 0) )
   	    {
   	       b = m;
   	    }
   	    else
   	    {
   	       a = m;
   	    }
   	    System.out.println("New interval: [" + a + " .. " + b + "]");
   	 }
    
   	 System.out.println("Approximate solution = " + (a+b)/2 );
     }
   }

/* Output:

New interval: [0.0 .. 2.0]
New interval: [1.0 .. 2.0]
New interval: [1.0 .. 1.5]
New interval: [1.25 .. 1.5]
New interval: [1.25 .. 1.375]
New interval: [1.25 .. 1.3125]
New interval: [1.28125 .. 1.3125]
New interval: [1.296875 .. 1.3125]
New interval: [1.296875 .. 1.3046875]
New interval: [1.30078125 .. 1.3046875]
New interval: [1.302734375 .. 1.3046875]
New interval: [1.302734375 .. 1.3037109375]
New interval: [1.302734375 .. 1.30322265625]
New interval: [1.302734375 .. 1.302978515625]
New interval: [1.302734375 .. 1.3028564453125]
New interval: [1.302734375 .. 1.30279541015625]
New interval: [1.302764892578125 .. 1.30279541015625]
New interval: [1.302764892578125 .. 1.3027801513671875]
New interval: [1.3027725219726562 .. 1.3027801513671875]
Approximate solution = 1.3027763366699219

*/
