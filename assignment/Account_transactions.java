import java.util.Scanner;
class Account_details {
private String Account_name;
private int Account_number;
public String getac_name() {
	return Account_name;
}
public void setac_name(String account_name) {
	Account_name = account_name;
}
public int getac_number() {
	return Account_number;
}
public void setac_number(int account_number) {
	Account_number = account_number;
}
}

class Account_transactions {
public static void main(String[] args) {
Scanner s =new Scanner(System.in);
int i, ch, bal=50000,amount;
char ans;
String acname;
int acnum;
System.out.println("Enter your AC Name :");
acname = s.nextLine();
System.out.println("Enter your AC number:");
acnum = s.nextInt();
do
{
System.out.println("Enter Choice:\n 1:Deposit \n 2:Withdraw");
ch=s.nextInt();
System.out.println("Enter Amount");
amount=s.nextInt();
switch(ch)
{
case 1:
bal=bal+amount;
break;
case 2:
bal=bal-amount;
break;
}
System.out.println("Do you want to do the process again");
ans=s.next().charAt(0);
}while(ans=='y'|| ans=='Y');
System.out.println("Final bal = "+bal);

Account_details a = new Account_details();
a.setac_name(acname);
a.setac_number(acnum);
System.out.println("Your Name : " + a.getac_name());
System.out.println("Account no : " + a.getac_number());
}
}