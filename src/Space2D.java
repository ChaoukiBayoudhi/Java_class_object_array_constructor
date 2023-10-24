public class Space2D {
    //attributes
    private Point[] tabPoints;
    private int nbPoints=0;//number of points in the space
    //constructors
    public Space2D(){
        tabPoints=new Point[100];
    }
    //surcharged constructor
    public Space2D(int maxSize){
        tabPoints=new Point[maxSize];
    }
    //methods
    //this method gets nbPoints points from the keyboard
    // and stores them in the tabPoints array
    public void setTabPoints(int nbPoints){
    }
    //this method prints the points of the tabPoints array
    //on the screen
    public void showTabPoints(){
    }
    //this method returns the index of the point p in the tabPoints array
    //if p is not found, it returns -1
    public int find(Point p){
        return -1;
    }

}
