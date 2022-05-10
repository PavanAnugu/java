import java.io.Serializable;
class Student implements Serializable {
int id;
String sname;
transient int fees;
public Student(int id,String sname,int fees) {
this.id = id;
this.sname = sname;
this.fees = fees;
}
}