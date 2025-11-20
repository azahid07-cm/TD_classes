package TD_classes;

public class Exercice4 {
    public static class Point{
        private int x;
        private int y;
        public Point(){
            this(0,0);
        }
        public Point(int a,int b){
            this.x=a;
            this.y=b;
        }
        public void translate(int dx,int dy){
            this.x=dx;
            this.y=dy;
        }
        public String toString(){
            return "X= "+x+" ,Y= "+y;
        }
    }
    public static void main(String args[]){
        Point P1=new Point();
        System.out.println("P1: "+P1.toString());
        Point P2=new Point(5,3);
        System.out.println("P2: "+P2.toString());
        P2.translate(7,2);
        System.out.println("P2(apres changement): "+P2.toString());
    }
}
