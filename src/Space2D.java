import java.util.Scanner;

public class Space2D {
    private Point[] tabPoints;
    private int nbPoints=0;
    //100 is a default value for the maximum number of points in the space
    //constructor without parameters
    public Space2D()
    {
        tabPoints=new Point[100];
    }
    //constructor with parameters
    public Space2D(int maxSpace)
    {
        tabPoints=new Point[maxSpace];
    }

    //print all points in the space (array) to the screen
    public void printSpace()
    {
        for(int i=0;i<nbPoints;i++)
        {
            tabPoints[i].showCoordinates();
        }
    }
    //get some points information from the keyboard and add them to the space(to the array)
    public void setTabPoints()
    {
        System.out.println("Enter the number of points: ");
        Scanner sc=new Scanner(System.in);
        nbPoints=sc.nextInt();
        //or
        //this.nbPoints=sc.nextInt();
        for (int i = 0; i < nbPoints; i++) {
            tabPoints[i]=new Point();
            tabPoints[i].getCoordinates();
        }
    }
    //find a given point in the space (array)
    //return the index of the point in the array
    //return -1 if the point is not in the space
    public int findPoint(Point p)
    {
        int i=0;
        while(i<nbPoints && !tabPoints[i].compare(p))
        {
            i++;
        }
        if(i==nbPoints)
            return -1;
        return i;
    }

}
