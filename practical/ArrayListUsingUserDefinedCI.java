class Bank {
long accountNo;
String customerName;
double balance;
int customerAge;
public Bank(long accountNo, String customerName, double balance, int customerAge) {
super();
this.accountNo = accountNo;
this.customerName = customerName;
this.balance = balance;
this.customerAge = customerAge;
}
}
import java.util.ArrayList;
import java.util.Iterator;
class ArrayListUsingUserDefinedCl {
public static void main(String[] args) {

Bank b = new Bank(12345, "Mamta", 5000.67, 20);
Bank b1 = new Bank(12354, "Ram", 7000.67, 21);
Bank b2 = new Bank(12344, "Sam", 5400.67, 30);
Bank b3 = new Bank(12333, "Karan", 4000.67, 22);
Bank b4 = new Bank(12322, "Priya", 8000.67, 55);
Bank b5 = new Bank(12355, "Pooja", 9000.67, 38);

ArrayList<Bank> al = new ArrayList<Bank>();
al.add(b);
al.add(b1);
al.add(b5);
al.add(b3);
al.add(b2);
al.add(b4);

Iterator itr = al.iterator();
while (itr.hasNext()) {
Bank obj = (Bank) itr.next();
System.out.println(obj.accountNo+" "+obj.customerName+" "+obj.balance+" "+obj.customerAge);
}
}
}