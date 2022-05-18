import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class TreeSetEg {
public static void main(String[] args) {
Set<String> s = new TreeSet<String>();
s.add("Pen");
s.add("Pencil");
s.add("Mouse");
s.add("Phone");
//s.add(null);
s.add("AC");
s.add("Bottle");
s.add("Earphone");
s.add("Pen");
Iterator<String> itr = s.iterator();
while (itr.hasNext()) {
System.out.println(itr.next());
}
Set<Integer> s1 = new TreeSet<Integer>();
s1.add(39);
s1.add(40);
s1.add(22);
s1.add(13);
s1.add(19);
s1.add(78);
//Iterator<Integer> itrr = ((TreeSet<Integer>) s1).descendingIterator();
Iterator<Integer> itrr = s1.iterator();
while (itrr.hasNext()) {
System.out.println(itrr.next());
}
System.out.println("Lowest :" + ((TreeSet<Integer>) s1).pollFirst());
System.out.println("Highest :" + ((TreeSet<Integer>) s1).pollLast() );
}
}