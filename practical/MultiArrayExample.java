class MultiarrayExample {
public void display() {
int arr[][] = {{1,2,3},{4,5,5},{7,6,8}};

for(int i=0;i<3;i++) {
for(int j=0;j<3;j++) {
System.out.print(arr[i][j] + " ");
}
System.out.println();
}
}
public static void main(String args[]) {
MultiarrayExample m = new MultiarrayExample();
m.display();
}
}