package TD_classes;

public class Exercice2 {
    public static class Rectangle{
        private double width;
        private double height;
        public double getWidth(){return this.width;}
        public double getHeight(){return this.height;}
        //IllegalArgumentException
        public void setWidth(double w){
            if(w>0)
                this.width=w;
            else
                throw new IllegalArgumentException("Nombre doit etre positif!");
        }
        public void setHeight(double h){
            if(h>0)
                this.height=h;
            else
                throw new IllegalArgumentException("Nombre doit etre positif!");
        }

        public double area(){
            return this.height * this.width ;
        }
    }
    public static void main(String args[]){
        Rectangle R1=new Rectangle();
        R1.setHeight(12);
        R1.setWidth(20);
        System.out.println("AREA: "+R1.area());
    }
}
