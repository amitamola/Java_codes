/*
Prac 16
Name- Amit Amola
College- Ramjas College
Section B Group B
*/


import java.util.Scanner;
import java.io.*;
import java.lang.Math.*;
import java.util.Random;

public class banksys
{
 public static void main(String[] args)throws IOException

 {
 Scanner in=new Scanner(System.in);
 Scanner sput=new Scanner(System.in);
 Random rand = new Random();
  account[] A=new account[20];
  int[] id=new int[20];
  int r,r2,id2,temp=14001,count=0,i,max=200000,min=100000,brk=0;
  double c;
 String ch;

 do{ 
  System.out.println("/**************************************************************************/");
  System.out.println("\n\t\t\tWelcome to the Banking System (aap ka apna bank)\n");
   System.out.println("Select a command:\n1.Open an account\n2.Login to an existing account");

  r = in.nextInt();
  
 switch(r)
{
 case 1:
 A[count]=new account(temp);
 id[count]=rand.nextInt((max-min)+1)+min;
 for(i=0;i<count;i++)
 { 
  if(id[i]==id[count])
  {
    brk=1;
    break;
   }
  }
 if(brk==1)
System.out.println("\nSomething wrong with the application.Please try again.");
 
 if(brk!=1)
 {
 A[count].new_acc();
 System.out.println("\n\nUnique Id generated:"+id[count]+"\nRemember this id for all future transactions.\n");
 temp++;
 A[count].view();
 count++; 
  }
 break;
 
 case 2:
 System.out.print("\nEnter account id:");
 id2=in.nextInt();

 for(i=0;i<count;i++)
 {
  if(id2==id[i])
   break;
  }

if(i==count)
System.out.println("\nERROR\nAccount doesn't exist or Invalid id\n");
else
{
System.out.println("Select a command:\n1.Balance Check    2.Withdraw Money     3.Deposit Money");
r2=in.nextInt();
switch(r2)
{
 case 1:
 A[i].view();
 break;
 
 case 2:
 System.out.println("\nWithdraw Money");
 System.out.print("\nEnter amount:");
 c=in.nextDouble();
 A[i].withdraw(c);
 A[i].view();
 break;
 

 case 3:
 System.out.println("\nDeposit Money");
 System.out.print("\nEnter amount:");
 c=in.nextDouble();
 A[i].deposit(c);
 A[i].view();
 break;
 
 default:System.out.println("Invalid Command!");
 
 }//r2 switch ends

}
break;

default:System.out.println("Invalid Command!");
  
 }//switch ends
System.out.println("______________________________________________________________________________");
System.out.println("\nEnter 1 to continue.");
 ch=sput.nextLine();

   }while(ch.equals("1"));
 
 
  } //main ends

}//banksys ends

class account
{
 Scanner in=new Scanner(System.in);
 Scanner in2=new Scanner(System.in);
 String acc_type,add,name;
 double balance,acc_sa=10001,acc_ca=10001;
 int acc_no,code,acc_code;

 public account(int a)
{
 acc_no=a;
 }

void new_acc()
{ 
 
 System.out.print("\nEnter Name:");
 name=in.nextLine();
 
 System.out.print("\nEnter address:");
 add=in.nextLine();

 System.out.print("\nEnter account type:");
 code=in2.nextInt();
 if(code==1)
{
  acc_type="Savings";
  balance=acc_sa;
  acc_code=1;
}
 if(code==2)
  {
   acc_type="Current";
   balance =acc_ca;
   acc_code=2;
    }


System.out.print("\nAccount successfully created.Account Number:"+acc_no);


 }

void deposit(double cash)
{
 balance=balance+cash;
 System.out.println("\nAmount of "+cash+" successfully credited to the account\n");
 }

void withdraw(double cash)
{
if(acc_code==1)
 {
  if((balance-cash)>=10000)
 {
  balance=balance-cash;
  System.out.println("\nAmount of "+cash+" successfully debited from the account\n");
  }
 else
 System.out.println("\nERROR\nInsufficient Balance!\n");
   
  }
else
{
  
  System.out.println("\nERROR\n");
 }
}

 void view()
{
  System.out.println("Name\t\tAddress\t\tAccount Type\tAccount No.\tBalance");
  System.out.println("______________________________________________________________________________"); 
  System.out.println(name+"\t"+add+"\t"+acc_type+"\t\t"+acc_no+"\t\t"+balance);
 }
 

}//account ends
/*
OUTPUT : 

  C:\Program Files\Java\jdk1.7.0_80\bin>javac banksys.java
 
  C:\Program Files\Java\jdk1.7.0_80\bin>java banksys
______________________________________________________________________________

                        BankSys v1.0.0

Select a command:
1.Open an account
2.Login to an existing account
1

Enter Name:VIRAT Kohli

Enter address:Rohini,Delhi

Enter account type:1

Account successfully created.Account Number:14001

Unique Id generated:171506
Remember this id for all future transactions.

Name            Address         Account Type    Account No.     Balance
______________________________________________________________________________
Kartik Kohli    Rohini,Delhi    Savings         14001           10001.0
______________________________________________________________________________

Enter 1 to continue.
1
______________________________________________________________________________

                        BankSys v1.0.0

Select a command:
1.Open an account
2.Login to an existing account
1

Enter Name:Dexter Morgan

Enter address:Miami,Florida

Enter account type:2

Account successfully created.Account Number:14002

Unique Id generated:121777
Remember this id for all future transactions.

Name            Address         Account Type    Account No.     Balance
______________________________________________________________________________
Dexter Morgan   Miami,Florida   Current         14002           10001.0
______________________________________________________________________________

Enter 1 to continue.
1
______________________________________________________________________________

                        BankSys v1.0.0

Select a command:
1.Open an account
2.Login to an existing account
1

Enter Name:Walter White

Enter address:New Mexico

Enter account type:2

Account successfully created.Account Number:14003

Unique Id generated:190283
Remember this id for all future transactions.

Name            Address         Account Type    Account No.     Balance
______________________________________________________________________________
Walter White    New Mexico      Current         14003           10001.0
______________________________________________________________________________

Enter 1 to continue.
1
______________________________________________________________________________

                        BankSys v1.0.0

Select a command:
1.Open an account
2.Login to an existing account
1

Enter Name:Jesse Pinkman

Enter address:New Mexico

Enter account type:1

Account successfully created.Account Number:14004

Unique Id generated:110588
Remember this id for all future transactions.

Name            Address         Account Type    Account No.     Balance
______________________________________________________________________________
Jesse Pinkman   New Mexico      Savings         14004           10001.0
______________________________________________________________________________

Enter 1 to continue.
1
______________________________________________________________________________

                        BankSys v1.0.0

Select a command:
1.Open an account
2.Login to an existing account
2

Enter account id:121777
Select a command:
1.Balance Check    2.Withdraw Money     3.Deposit Money
3

Deposit Money

Enter amount:19999

Amount of 19999.0 successfully credited to the account

Name            Address         Account Type    Account No.     Balance
______________________________________________________________________________
Dexter Morgan   Miami,Florida   Current         14002           30000.0
______________________________________________________________________________

Enter 1 to continue.
1
______________________________________________________________________________

                        BankSys v1.0.0

Select a command:
1.Open an account
2.Login to an existing account
2

Enter account id:110588
Select a command:
1.Balance Check    2.Withdraw Money     3.Deposit Money
3

Deposit Money

Enter amount:5000

Amount of 5000.0 successfully credited to the account

Name            Address         Account Type    Account No.     Balance
______________________________________________________________________________
Jesse Pinkman   New Mexico      Savings         14004           15001.0
______________________________________________________________________________

Enter 1 to continue.
1
______________________________________________________________________________

                        BankSys v1.0.0

Select a command:
1.Open an account
2.Login to an existing account
2

Enter account id:110588
Select a command:
1.Balance Check    2.Withdraw Money     3.Deposit Money
2

Withdraw Money

Enter amount:1000

Amount of 1000.0 successfully debited from the account

Name            Address         Account Type    Account No.     Balance
______________________________________________________________________________
Jesse Pinkman   New Mexico      Savings         14004           14001.0
______________________________________________________________________________

Enter 1 to continue.
1
______________________________________________________________________________

                        BankSys v1.0.0

Select a command:
1.Open an account
2.Login to an existing account
2

Enter account id:171506
Select a command:
1.Balance Check    2.Withdraw Money     3.Deposit Money
2

Withdraw Money

Enter amount:2000

ERROR
Insufficient Balance!

Name            Address         Account Type    Account No.     Balance
______________________________________________________________________________
VIRAT Kohli    Rohini,Delhi    Savings         14001           10001.0
______________________________________________________________________________

Enter 1 to continue.
1
______________________________________________________________________________

                        BankSys v1.0.0

Select a command:
1.Open an account
2.Login to an existing account
2

Enter account id:190283
Select a command:
1.Balance Check    2.Withdraw Money     3.Deposit Money
1
Name            Address         Account Type    Account No.     Balance
______________________________________________________________________________
Walter White    New Mexico      Current         14003           10001.0
______________________________________________________________________________

Enter 1 to continue.
1
______________________________________________________________________________

                        BankSys v1.0.0

Select a command:
1.Open an account
2.Login to an existing account
2

Enter account id:121777
Select a command:
1.Balance Check    2.Withdraw Money     3.Deposit Money
1
Name            Address         Account Type    Account No.     Balance
______________________________________________________________________________
Dexter Morgan   Miami,Florida   Current         14002           30000.0
______________________________________________________________________________

Enter 1 to continue.
*/

 