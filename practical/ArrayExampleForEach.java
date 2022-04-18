class ArrayExample {
public static void main (String args[]) {
String [] names = {"Mamta","Ram","Karan","Ajay","Ajith","Tushar"};
for (int i=0;i<names.length;i++) {
System.out.println(names[i]);
}
System.out.println();
int [] phone = {123,456,567,789,955,333,555,111,2345,7890};
for(int n : phone) {
System.out.println(n);
}
}
}