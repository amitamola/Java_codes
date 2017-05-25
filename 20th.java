/*Prac 20
Name- Amit Amola
College- Ramjas College
Section B Group B
*/

class Excep 
{
 public static void main(String args[]) 
 {
  
  try 
  {
   int k=15/0;
   System.out.println("This will never print");
  }
 
  catch(ArithmeticException e) 
  {
   double m=10;
   double j=15/m;
   System.out.println("The value is= " + j);
  }

  finally 
  {
   System.out.println("We see that in first try block there was a mathematical error.");
   System.out.println("So we had catch block to improve that error and then this finally statement is executed");
  }
 }
}

/* Output:
The value is= 1.5
We see that in first try block there was a mathematical error.
So we had catch block to improve that error and then this finally statement is executed
*/