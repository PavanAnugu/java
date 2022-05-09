interface Shape {
void getArea();
void getSides(); 
}
class Rectangle implements Shape {
@Override
public void getArea() {
int width = 4;
int height = 10;
int area_rectangle = width*height;
System.out.println("Area of Rectangle :"+area_rectangle);	
}
@Override
public void getSides() {
System.out.println("Rectangle has 4 sides");		
}
}
class Triangle implements Shape {
@Override
public void getArea() {
float b = 5,h=13,area_triangle;
area_triangle = (b*h)/2;
System.out.println("Area of Triangle :" +area_triangle);
}
@Override
public void getSides() {
System.out.println("Triangle has 3 sides");
}
}
class Square implements Shape {
@Override
public void getArea() {
int k = 6;
int area_square = k*k;
System.out.println("Area of Square :" +area_square);	
}
@Override
public void getSides() {
System.out.println("Square has 4 sides");
}
public static void main(String[] args) {
Rectangle r = new Rectangle();
r.getArea();
r.getSides();
Triangle t = new Triangle();
t.getArea();
t.getSides();
Square s = new Square();
s.getArea();
s.getSides();
}
}