import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

class BookUserDefinedCl {
public static void main(String[] args) {
Book m = new Book("India 2020", 1, 262.59, "Analysis and Strategy", "Abdul Kalam", 1998);
Book m1 = new Book("Wings of Fire", 2, 495.00, "Biography", "Abdul Kalam", 1999);
Book m2 = new Book("Ignited minds", 3, 162.21, "Society and Culture", "Abdul Kalam", 2002);
Book m3 = new Book("The Luminous Sparks", 4, 265.00, "Poetry", "Abdul Kalam", 2004);
Book m4 = new Book("Guiding Solus", 5, 135.00, "Reference", "Abdul Kalam", 2005);
Book m5 = new Book("Mission India", 6, 170.00, "Literature", "Abdul Kalam", 2005);

LinkedList<Book> b = new LinkedList<Book>();
b.add(m);
b.add(m1);
b.add(m2);
b.add(m3);
b.add(m4);
b.add(m5);
System.out.println("Linked List Example");
Iterator itr = b.iterator();
while (itr.hasNext()) {
Book a = (Book) itr.next();
System.out.println(a.bookName +"-"+a.authorName+"-"+a.bookPrice+"-"+a.category+"-"+a.publishingYear+"-"+a.serialNo);
}
HashSet<Book> set=new HashSet<Book>();
set.add(m);
set.add(m1);
set.add(m2);
set.add(m3);
set.add(m4);
set.add(m5);
System.out.println("Hash Set Example");
Iterator itrr = b.iterator();
while (itrr.hasNext()) {
Book a1 = (Book) itrr.next();
System.out.println(a1.bookName +"-"+a1.authorName+"-"+a1.bookPrice+"-"+a1.category+"-"+a1.publishingYear+"-"+a1.serialNo);
}
}
}
class Book {
String bookName;
long serialNo;
double bookPrice;
String category;
String authorName;
long publishingYear;
public Book(String bookName, long serialNo, double d, String category,String authorName, long publishingYear) {
this.bookName = bookName;
this.serialNo = serialNo;
this.bookPrice = d;
this.category = category;
this.authorName = authorName;
this.publishingYear = publishingYear;
}
}