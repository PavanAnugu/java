import java.util.Map;
import java.util.TreeMap;
class TreeMapEg {	
public static void main(String[] args) {
TreeMap<Integer,String> map2 = new TreeMap<Integer,String>();	
map2.put(101, "Mango");
map2.put(108, "Orange");
map2.put(105, "Banana");
map2.put(103, "Grapes");
map2.put(105, "Banana");
map2.putIfAbsent(102,"CustardApple");
map2.putIfAbsent(101, "Watermelon");
for (Map.Entry m : map2.entrySet()) {
System.out.println(m.getKey()+" "+m.getValue());	
}
map2.remove(103);
System.out.println("After Removal");
for (Map.Entry m : map2.entrySet()) {
System.out.println(m.getKey()+" "+m.getValue());
}
}
}