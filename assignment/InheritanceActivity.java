class Employee {
long employeeId;
String employeeName,employeeAddress;
long employeePhone;
double basicSalary;
double specialAllowance = 250.80;
double Hra = 1000.50;
Employee(long Id,String Name,String Address,long phone,double basicSalary) {
this.employeeId = Id;
this.employeeName = Name;
this.employeeAddress = Address;
this.employeePhone = phone;
this.basicSalary = basicSalary;
}
}
class Manager extends Employee {
Manager(long Id, String Name, String Address, long phone, double basicSalary) {
super(Id, Name, Address, phone, basicSalary);

}
@Override
public void calculateTransportAllowance() {
double transportAllowance = 15*basicSalary/100;
System.out.println("Transport Allowance for Manager :" +transportAllowance);
}
}
class Trainee extends Employee {
Trainee(long Id, String Name, String Address, long phone, double basicSalary) {
super(Id, Name, Address, phone, basicSalary);
}
@Override
public void calculateTransportAllowance() {
double transportAllowance = 15*basicSalary/100;
System.out.println("Transport Allowance for Trainee :" +transportAllowance);
}
}
class InheritanceActivity {
public static void main(String[] args) {
Manager m = new Manager(126534,"Peter","Chennai,india",237844,65000);
m.CalculateSalary();
m.calculateTransportAllowance();
Trainee t = new Trainee(124543,"Surya","Chennai,india",232000,40000);
t.calculateTransportAllowance();
}
}