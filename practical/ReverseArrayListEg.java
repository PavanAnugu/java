import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ReverseArrayListEg {
public static void main(String[] args) {
List<String> al = new ArrayList<String>();
al.add("Rose");
al.add("Sunflower");
al.add("Rose");
al.add("Lily");
al.add("Daisy");
al.add("Marigold");
al.add("Tulip");
al.add("Jasmine");

System.out.println("Before reversing");
System.out.println(al.toString());
Collections.reverse(al);
System.out.println("After reversing");
System.out.println(al);
}
}