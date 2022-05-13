import java.util.Iterator;
import java.util.LinkedList;
class LinkedListEg {
public static void main(String[] args) {
LinkedList<String> al = new LinkedList<String>();
al.add("Ram");
al.add("Sam");
al.add("Ravi");
al.add("Ram");
al.add("Rahul");
al.add(0,"Arjun");
al.addFirst("Mamta");
al.add("Priya");
al.addLast("Geeta");

Iterator<String> itr = al.iterator();
while (itr.hasNext()) {
System.out.println(itr.next());
}

al.removeLast();
al.removeFirst();
al.remove(2);
System.out.println("List after removal");
Iterator<String> itr1 = al.iterator();
while (itr1.hasNext()) {
System.out.println(itr1.next());
}
System.out.println("List in reverse order");
Iterator<String> itrr = al.descendingIterator();
while (itrr.hasNext()) {
System.out.println(itrr.next());
}
}
}