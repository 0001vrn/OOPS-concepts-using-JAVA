package AreaOOPS;

/**
 * Created by Varun on 4/17/2017.
 */
public class Test4 {
    public static void main(String[] args){
        Point p1 = new Point(0,0);
        Point p2 = new Point(10,25);
        Point p3 = new Point(50,25);
        Point p4 = new Point(1,1);

        Triangle t = new Triangle(p1,p2,p3);
        Quadrilateral q = new Quadrilateral(p1,p2,p3,p4);
        System.out.print(q.getArea());
    }
}
