import java.io.FileOutputStream;
public class FileOutputStreamExample {
public static void main(String[] args) {
try {
FileOutputStream f = new FileOutputStream("C:\\test.txt");
String s = "Weclome to Anudip Foundation";
byte b[] = s.getBytes();
f.write(b);
f.close();
System.out.println("done");
} catch (Exception e) {
System.out.println(e);
}
}
}