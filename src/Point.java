import java.util.Scanner;

public class Point {
    //Attributes
    private double x;
    private double y;

    //Constructors
//constructor with parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //constructor without parameters
    //surcharged constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    //methods
    //getCoordinates(): get the coordinates of the point from the keyboard
    public void getCoordinates() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        this.x = sc.nextDouble();
        System.out.print("Enter y: ");
        this.y = sc.nextDouble();
    }
    //print the coordinates of the point on the screen
    public void showCoordinates() {
        System.out.println("x = " + this.x + ", y = " + this.y);
    }
    //move a point by dx and dy
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    //create a copy of the point "this"
    public Point copy(){
//        Point pc = new Point();
//        pc.x = this.x;
//        pc.y = this.y;
        //or using the parametrized constructor
//        Point pc = new Point(this.x, this.y);
//        return pc;
        //or
        return new Point(this.x, this.y);
    }

    //compare two points : "this"  and "p"
    public boolean compare(Point p){
//        if(this.x == p.x && this.y == p.y)
//            return true;
//        return false;
        return this.x == p.x && this.y == p.y;
    }

}
