import java.util.ArrayList;
import java.util.List;
class ArrayListEg {
public static void main(String[] args) {
List<String> al = new ArrayList<String>();
al.add("Rose");
al.add("Sunflower");
al.add("Rose");
al.add(0,"Lily");
al.add(2,"Daisy");
al.add("MariGold");
al.add(6,"Tulip");
al.add("Jasmine");
al.add("Orchid");
al.add("Lotus");
al.add(5,"Lavender");

System.out.println(al);
System.err.println("Size of Array List :" + al.size());

al.remove(6);
System.out.println(al);
System.err.println("Size of Array List :" + al.size());

al.add("Lavender");
al.add("Lotus");
System.out.println(al);
System.err.println("Size of Array List :" + al.size());
System.out.println("Element of index value is :" + al.get(6));
}
}