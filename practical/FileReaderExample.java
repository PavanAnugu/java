import java.io.FileReader;
import java.io.FileWriter;
class FileReaderExample {
public static void main(String[] args) {

try{
FileReader fr = new FileReader("E://test.txt");
int i;
while((i = fr.read())!=-1) {
System.out.println((char)i);
}
fr.close();
System.out.println("done");
}catch(Exception e) {
System.out.println(e);
}
}