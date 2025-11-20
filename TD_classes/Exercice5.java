package TD_classes;

public class Exercice5 {
    public static class Temperature{
        private double value;
        public Temperature(double v){
            if(v>-273.15)
                this.value=v;
            else
                throw new IllegalArgumentException("V>-273.15 !");
        }
        public double getValue(){return this.value;}
        public void setValue(double v){
            if(v>-273.15)
                this.value=v;
            else
                throw new IllegalArgumentException("V>-273.15 !");
        }
    }

        public static void main(String args[]){
        Temperature T1=new Temperature(37);
        Temperature T2=new Temperature(-280);
        System.out.println(T1.getValue());
        System.out.println(T2.getValue());
    }
}
