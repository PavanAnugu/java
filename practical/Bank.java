class Account {
private double bal;
private int accnum;
public Account(int a) {  
bal=0.0;
accnum=a;
}
public void deposit(double sum) {
if (sum>0)
bal+=sum;  
else
System.err.println("Account.deposit(...): " +"cannot deposit negative amount.");
}
public void withdraw(double sum) {
if (sum>0)
bal-=sum;  
else
System.err.println("Account.withdraw(...): " +"cannot withdraw negative amount.");   
}
public double getBalance() {
return bal;
}
public int getAccountNumber() {
return accnum;
}
public String toString() {
return "Acc " + accnum + ": " + "balance = " + bal;
}
public final void print() {
System.out.println(toString());  
}
}
class SavingsAccount extends Account {
private double interest;
public SavingsAccount(int accnum,double interest) {
super(accnum);
this.interest = interest;
}
public double getInterest(){
double x=super.getBalance()*interest;
return x;
}
public void setInterest(double interest){
this.interest=interest;
}
public void  AddInterest (double interest){
double x = getBalance() + getBalance()*interest;
super.deposit(x);
}
public String toString(){
return super.toString()+" Interest : "+interest;
}
}
class CurrentAccount extends Account{
private double limit;
public CurrentAccount(int accnum,double limit) {
super(accnum);
this.limit=limit;
}
public double getLimit(){
return this.limit;
}
public void setLimit(double limit){
this.limit=limit;
}
public void withdraw( double limit){
if(limit<=this.limit)
super.withdraw(limit);
else{
System.out.println(" Sorry, Limit Exceeded" );
}
}
public String toString() {
return super.toString()+" Limit : "+limit;
}
}
class Bank {	
public static void main (String[] args) {
Account[] acc=new Account[2];
acc[0]=new SavingsAccount(263010,0.25);
acc[1]=new CurrentAccount(253010,5000);
for(int i=0; i<acc.length;i++) {
System.out.println(acc[0]);
System.out.println(acc[1]);
}
}
}