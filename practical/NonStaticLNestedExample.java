class NonStaticLNestedClassExample {
static int a = 25;
private static int b = 45;
void display() {
class Inner {
static int res;
static void show( ) {
System.out.println("value of res : " + (a+b));		
}
}
}
public static void main(String[] args) {
StaticNestedClassExample.Inner.show();
}
}