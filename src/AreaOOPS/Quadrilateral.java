package AreaOOPS;

/**
 * Created by Varun on 4/17/2017.
 */
public class Quadrilateral extends Triangle {
    Point p4;
    public Quadrilateral(Point p1,Point p2,Point p3,Point p4){
        super(p1,p2,p3);
        this.p4 = p4;
    }

    double getArea(){
        int x1=p1.getX();
        int y1=p1.getY();
        int x2=p2.getX();
        int y2=p2.getY();
        int x3=p3.getX();
        int y3=p3.getY();

        int x4=p4.getX();
        int y4=p4.getY();

        return Math.abs(((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2));
    }
}
