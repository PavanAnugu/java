public interface Sample {
void display(String a);
default void display1() {
System.out.println("I am default method");
}
static void my() {
System.out.println("I am static method");
}
// void abc();
}
class MethodReferenceEg {
public void display(String a) {
System.out.println("Hello...I am" + a);
}
public static void main(String[] args) {
MethodReferenceEg m = new MethodReferenceEg();
Sample s = m::display; //referring method using reference
s.display("Mamta"); //calling interface method
}
}