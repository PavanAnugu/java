import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class HashSetEg {

public static void main(String[] args) {
Set<String> s4 = new HashSet<String>();
s4.add("Pen");
s4.add("Pencil");
s4.add("Mouse");
s4.add("Phone");
s4.add(null);
s4.add("AC");
s4.add("Bottle");
s4.add("Earphone");
s4.add("Pen");
Iterator<String> itr = s4.iterator();
while (itr.hasNext()) {
System.out.println(itr.next());
}
}
}