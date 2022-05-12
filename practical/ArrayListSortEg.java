import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArrayListSortEg {
public static void main(String[] args) {
List<String> al = new ArrayList<String>();
al.add("Rose");
al.add("Sunflower");
al.add("Lily");
al.add("Daisy");
al.add("MariGold");
al.add("Tulip");
al.add("Jasmine");
al.add("Orchid");
al.add("Lotus");
al.add("Lavender");	
System.out.println("String sorted list :");
Collections.sort(al);
for (String a : al) {
System.out.println(a);
}
List<Integer> al1 = new ArrayList<Integer>();
al1.add(20);
al1.add(60);
al1.add(20);
al1.add(10);
al1.add(67);
al1.add(98);
al1.add(5);
al1.add(3);
al1.add(11);
al1.add(22);
System.out.println("Integer sorted list :");
Collections.sort(al1);
for (Integer i : al1) {
System.out.println(i);
}
Collections.reverse(al1);
System.out.println(al1);
}
}