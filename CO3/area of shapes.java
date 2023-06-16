class shape {
static int area(int a,int b){return a*b;}
static int area(int a,int b,int c){return a*b*c;}
static double area(double a){return a*a*3.14;}
}
class overloading{
public static void main(String[] args){
System.out.println("area of rectangle:"+shape.area(11,11));
System.out.println("area of qube:"+shape.area(11,11,11));
System.out.println("area of circle:"+shape.area(2));
}
}
