import java.io.FileReader;
import java.io.FileWriter;
class FileWriterExample {
public static void main(String[] args) {

try{
FileWriter fw = new FileWriter("E://test.txt");
fw.write("welcome to anudip foundatio skill developement center");
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