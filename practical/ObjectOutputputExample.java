import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class ObjectOutputExamnple {

public static void main(String[] args) {
try {
Student s = new Student(101,"mamta");
FileOutputStream fout = new FileOutputStream("E://ab.txt");
ObjectOutputStream obj = new ObjectOutputStream(fout);
obj.writeObject(s);
obj.close();
System.out.println("done");
}
catch(Exception e) {
System.out.println(e);
}
}
}