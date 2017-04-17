package CabinOOPS;

/**
 * Created by Varun on 4/17/2017.
 */
//Please write your code here
class Cabin {
    int length;
    int breadth;
    int height;
    public Cabin(int lbh){
        length=lbh;
        breadth=lbh;
        height=lbh;
    }
    public Cabin(int lb,int h){
        length=lb;
        breadth=lb;
        height=h;
    }

    public Cabin(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }

    int volume(){
        return length*breadth*height;
    }
}
