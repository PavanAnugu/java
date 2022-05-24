import java.util.Optional;
class OptionalClassEg {
public static void main(String[] args) {
String [] str = new String [5];
str[3] = "anudip";
Optional<String> c = Optional.ofNullable(str[3]);
//if (c.isPresent()) {
//String L = str[3].toUpperCase();
//System.out.println(L);
//} else {
//System.out.println("Value not there");
//}
System.out.println(c.isPresent());
System.out.println(c.orElse("value is not present "));
}
}