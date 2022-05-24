import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
class ComparatorExample {
public static void main(String[] args) {
ArrayList<BookCom> al = new ArrayList<BookCom>();
al.add(new BookCom("Java","Games josling",2300));
al.add(new BookCom("PHP","Games",300));
al.add(new BookCom("DotNet","XYZ",5000));
al.add(new BookCom("HTML","ABC",3200));
al.add(new BookCom("BootStrap","DEF",2000));
al.add(new BookCom("Angular","HJK",4000));

System.out.println("Sorting by BookPrice");
Collections.sort(al,new BookPriceCompare());
Iterator itr = al.iterator();
while (itr.hasNext()) {
BookCom b = (BookCom) itr.next();
System.out.println(b.bookName+" "+b.bookAuthor+" "+b.bookPrice);
}
System.out.println("----------------------------");
System.out.println("Sorting by BookName");
Collections.sort(al, new BookNameCompare());
Iterator itr1 = al.iterator();
while (itr1.hasNext()) {
BookCom b = (BookCom) itr1.next();
System.out.println(b.bookName+" "+b.bookAuthor+" "+b.bookPrice);
}
System.out.println("----------------------------");
//Sorting on basis of BookName
Comparator<BookCom> c = Comparator.comparing(BookCom::getBookName);
Collections.sort(al,c);
System.out.println("Sorting by BookName");
for(BookCom b : al) {
System.out.println(b.bookName+" "+b.bookAuthor+" "+b.bookPrice);
}
System.out.println("----------------------------");
//Sorting on basis of Book Price
Comparator<BookCom> c1 = Comparator.comparing(BookCom::getBookName);
Collections.sort(al,c1);
System.out.println("Sorting by BookName");
for(BookCom b : al) {
System.out.println(b.bookName+" "+b.bookAuthor+" "+b.bookPrice);
}
}
}
import java.util.Comparator;
class BookPriceCompare implements Comparator {
@Override
public int compare(Object o1, Object o2) {
BookCom b1 = (BookCom)o1;
BookCom b2 = (BookCom)o2;
if (b1.bookPrice==b2.bookPrice) {
return 0;
}
else if (b1.bookPrice>b2.bookPrice) {
return 1;
}
else {
return -1;
}
}
}
import java.util.Comparator;
class BookNameCompare implements Comparator {
@Override
public int compare(Object o1, Object o2) {
BookCom b1 = (BookCom)o1;
BookCom b2 = (BookCom)o2;
return b1.bookName.compareTo(b2.bookName);
}
}
class BookCom {
String bookName;
String bookAuthor;
int bookPrice;
public BookCom(String bookName, String bookAuthor, int bookPrice) {
super();
this.bookName = bookName;
this.bookAuthor = bookAuthor;
this.bookPrice = bookPrice;
}
public String getBookName() {
return bookName;
}
public void setBookName(String bookName) {
this.bookName = bookName;
}
public String getBookAuthor() {
return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
this.bookAuthor = bookAuthor;
}
public int getBookPrice() {
return bookPrice;
}
public void setBookPrice(int bookPrice) {
this.bookPrice = bookPrice;
}
}