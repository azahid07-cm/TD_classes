package TD_classes;

public class Exercice10 {
    public static final class MathUtil{
        private MathUtil(){}
        public static int clamp(int value,int min,int max){
            if(value<min)
                return min;
            else if(value>max)
                return max;
            else
                return value;
        }
    }
    public static void main(String args[]){
        System.out.println(MathUtil.clamp(12,3 , 5));
        System.out.println(MathUtil.clamp(2,4 , 5));
        System.out.println(MathUtil.clamp(7,6 , 9));
    }
}
