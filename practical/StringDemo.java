import java.util.Scanner;
class StringDemo {
public void show() {
Scanner s = new Scanner(System.in);
System.out.println("Enter String");
String A = s.next();
String B = s.next();

System.out.println(A.length()+B.length());
System.out.println((A.compareTo(B)>0) ? "Yes" : "No");
System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "
+B.substring(0,1).toUpperCase()+B.substring(1));
}
public void palindrome() {
Scanner s = new Scanner(System.in);
System.out.println("Enter String :");
String A = s.next();
String R = new StringBuilder(A).reverse().toString();
if (A.equals(R)) {
System.out.println(A + "is a palindrome");	
} else {
System.out.println(A + "not a palindrome");
}
}
public static void main(String[] args) {
StringDemo a = new StringDemo();
a.show();
a.palindrome();
}
}