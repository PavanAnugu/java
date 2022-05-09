import java.util.Scanner;

class AbstractClass {
public void array() {
int size;
Scanner s = new Scanner(System.in);
System.out.println("Enter the size");
size = s.nextInt();
int[] arr = new int[size];
System.out.println("Enter "+size+" Numbers");
for (int i = 0; i < size; i++) {
arr[i] = s.nextInt();	
}
for (int i = 0; i < size; i++) {
System.out.println(arr[i]);	
}
}
public static void main(String[] args) {
ClassTwo c = new ClassTwo();
c.armstrong();
c.sum();
AbstractClass a = new AbstractClass();
a.array();
}
}
abstract class ClassOne {
abstract void sum();

}
class ClassTwo extends ClassOne {
public void armstrong() {
int num=153;
int temp=num;
int arm=0;
while (num>0) {
int n=num%10;
num/=10;
}
if (arm==temp) {
System.out.println("Armstrong number");	
} else {
System.out.println("Not a Armstrong number ");
}
}
@Override
void sum() {
int x,y,sum;
Scanner p = new Scanner(System.in);
System.out.println("Enter first number");
x=p.nextInt();
System.out.println("Enter second number");
y=p.nextInt();
sum=x+y;
System.out.println("Addition of two numbers is " + sum);
}		
}