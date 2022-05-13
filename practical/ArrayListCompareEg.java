import java.util.ArrayList;
import java.util.List;
class ArrayListCompareEg {
public static void main(String[] args) {
List<String> al = new ArrayList<String>();
al.add("Rose");
al.add("Sunflower");
al.add("Lily");
al.add("Daisy");
al.add("MariGold");
al.add("Tulip");
al.add("Jasmine");
System.out.println(al);
List<String> al1 = new ArrayList<String>();
al1.add("Rose");
al1.add("Sunflower");
al1.add("Lily");
al1.add("Daisy");
al1.add("MariGold");
al1.add("Tulip");
al1.add("Jasmine");
System.out.println(al1);

boolean b = al.equals(al1);
System.out.println(b);
al1.add("Red Rose");
boolean b1 = al.equals(al1);
System.out.println(b1);
}
}