class StringExample {
public void show() {
char [] arr = {'j','a','v','a'};
String s = new String(arr);
System.out.println("Value is :" +s);
System.out.println(arr);
}
public void myFunction() {
String m = "Mamta";
String m1 = "Mamta";
String m2 = new String("Mamta");
}
public static void main(String[] args) {
StringExample s = new StringExample();
s.show();
s.myFunction();
}
}
