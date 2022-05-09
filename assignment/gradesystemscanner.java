import java.util.Scanner;

class GradeSystem {
public void Grade() {
Scanner s = new Scanner(System.in);
System.out.println("Enter marks :");
int marks = s.nextInt();

if (marks>=35 && marks<=45) {
System.out.println("D Grade");
}
else if (marks>=45 && marks<55) {
System.out.println("C Grade");
}
else if (marks>=60 && marks<75) {
System.out.println("B Grade");
}
else if (marks>=75 && marks<85) {
System.out.println("A Grade");
}
else if (marks>=85 && marks<100) {
System.out.println("O Grade");
}
else {
System.out.println("Fail/Absent");
}
}
public static void main(String args[]) {
GradeSystem o = new GradeSystem();
o.Grade();
}
}