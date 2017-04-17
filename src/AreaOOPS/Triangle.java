package AreaOOPS;

/**
 * Created by Varun on 4/17/2017.
 */
public class Triangle {
    Point p1;
    Point p2;
    Point p3;

    public Triangle(int x1,int y1,int x2,int y2,int x3,int y3){
        p1 = new Point(x1,y1);
        p2 = new Point(x2,y2);
        p3 = new Point(x3,y3);
    }
    public Triangle(Point p1,Point p2,Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    double getArea(){
        int x1=p1.getX();
        int y1=p1.getY();
        int x2=p2.getX();
        int y2=p2.getY();
        int x3=p3.getX();
        int y3=p3.getY();

        return Math.abs(((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2));

    }
}
