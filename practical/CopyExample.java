import java.io.FileInputStream;
import java.io.FileOutputStream;
class CopyExample {
public static void main(String[] args) {
try{
FileInputStream fin = new FileInputStream("E://test.txt");
FileOutputStream fout = new FileOutputStream("D://test1.txt");
byte [] arr = new byte[1024];
int l;
while((l=fin.read(arr)) > 0) {
fout.write(arr);
}
fin.close();
fout.close();
System.out.println("done");
}
catch(Exception e) {
System.out.println(e);
}
}