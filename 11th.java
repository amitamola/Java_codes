/*
Prac 11
Name- Amit Amola
College- Ramjas College
Section B Group B
*/

import javax.swing.JOptionPane;
import java.lang.Math;
class Compute
{
  double q,TC,q2,TC2;
  public void eoq(double A,double dr,double I,double q1,double c1,double c2)
  {
    q=Math.sqrt((2*A*dr)/(I*c2));                       // Calculating the order quantity corresponding to minimum per unit cost
    if(q>q1)
    {
     JOptionPane.showMessageDialog(null,"The optimum order quantity is"+q);
     TC=(dr*c2)+((A*dr)/q)+(0.5*(I*c2)*q);
     JOptionPane.showMessageDialog(null,"The corresponding minimum cost function is"+TC);
    }
    else 
    {
     TC=(dr*c2)+((A*dr)/q1)+(0.5*(I*c2)*q1);       // cost function corresponding to price break quantity  
     q2=Math.sqrt((2*A*dr)/(I*c1));                // quantity corresponding to the first price range cost
     TC2=(dr*c1)+((A*dr)/q2)+(0.5*(I*c1)*q2);     // Total corresponding to the first price range cost
      if(TC2>TC)
      {
       JOptionPane.showMessageDialog(null,"The optimum order quantity is"+q1);
       JOptionPane.showMessageDialog(null,"The corresponding minimum cost function is"+TC);
      }
      else
      {
       JOptionPane.showMessageDialog(null,"The optimum order quantity is"+q2);
       JOptionPane.showMessageDialog(null,"The corresponding minimum cost function is"+TC2);
      }
 
    } 
    
  } 
}

class PriceBreak
{
 
 public static void main(String args[])
 {  
    double q1,c1,c2,A,I,dr;
    String str;
    Compute obj= new Compute();
    JOptionPane.showMessageDialog(null,"The Assumptions of the model are:");
    JOptionPane.showMessageDialog(null,"1.Demand is known and uniform \n 2. Shortages are not allowed ");
    JOptionPane.showMessageDialog(null,"3. Supply is instantaneous\n 4. lead time is zero");   
    str=JOptionPane.showInputDialog(null,"Enter the ordering cost");
    A=Double.parseDouble(str);
    str=JOptionPane.showInputDialog(null,"Enter the demand rate(units per year");
    dr=Double.parseDouble(str);
    str=JOptionPane.showInputDialog(null,"Enter Inventory carrying charge(0<I<1)");
    I=Double.parseDouble(str);
    str=JOptionPane.showInputDialog(null,"Enter the price break quantity ");
    q1=Double.parseDouble(str);
    str=JOptionPane.showInputDialog(null,"Enter the cost per unit for first price range");
    c1=Double.parseDouble(str);
    str=JOptionPane.showInputDialog(null,"Enter The cost per unit for second price range");
    c2=Double.parseDouble(str);
    obj.eoq(A,dr,I,q1,c1,c2);
 }
}
