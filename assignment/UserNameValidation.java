import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class UserNameValidation {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter UserName :");
String k = s.next();
boolean b1 = Pattern.matches("^[A-Za-z_][A-Za-z0-9_]{8,30}$",k);
if (b1==true) {
System.out.println("Valid");
} else {
System.out.println("Invalid");
}
}
}