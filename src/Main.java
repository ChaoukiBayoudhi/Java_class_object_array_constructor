import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //get the maximum number of points in the space from the keyboard

        System.out.println("Enter the maximum number of points : ");
        Scanner sc=new Scanner(System.in);
        int nbMax=sc.nextInt();

        //create a space with the maximum number of points (instantiation)
        Space2D space=new Space2D(nbMax);
        space.setTabPoints();
        System.out.println("The space is : ");
        space.printSpace();
        //find a point in the space
        Point p=new Point();
        p.getCoordinates();
        int index=space.findPoint(p);
        if(index==-1)
            System.out.println("The point is not in the space");
        else
            System.out.println("The point is on the index : "+index);

    }
}