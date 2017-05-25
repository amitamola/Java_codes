/*
Prac 6
Name- Amit Amola
College- Ramjas College
Section B Group B
*/

import java.util.Scanner;
public class Rev
{
    public static void main(String[] args)
    {
        String k; 
	long a,sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        k = s.nextLine();
        long n=Long.parseLong(k);
        do
        {
            a = n % 10;
            sum = sum + a;
            n = n / 10;
        }
        while( n > 0);
	int m=(k.length())-1;
	do
        {
	    System.out.print(k.charAt(m));
            m--;
        }
        while( m > -1);
	
	System.out.println();
	System.out.println("Sum of digits:"+sum);
    }
}

/*Output:
Enter any number:319591314952
259413195913
Sum of digits:52
*/