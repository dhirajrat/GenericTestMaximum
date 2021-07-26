import java.util.Scanner;

class GenericCompareOperation {
    /*
        Method Comparable Max defined
     */
    public static <T extends Comparable> T compareMax(T a,T b,T c){
        T mf;
        mf = ( a.compareTo(b) == 1 ? a : b);
        T FMAX;
        FMAX = ( mf.compareTo(c) == 1 ? mf : c);
        return FMAX;
    }
}

public class GenericCompare {
    public static void main(String[] args){

        //For Integer
        System.out.println("Enter 3 Integer numbers to compare");
        Scanner sc = new Scanner(System.in);
        Integer x= new Integer(sc.nextInt());
        Integer y= new Integer(sc.nextInt());
        Integer z= new Integer(sc.nextInt());
        Integer IMAX = GenericCompareOperation.compareMax(x,y,z);
        System.out.println(IMAX+ " is the Maximum Integer number");

        //For Float
        System.out.println("Enter 3 Float numbers to compare");
        Float a= new Float(sc.nextFloat());
        Float b= new Float(sc.nextFloat());
        Float c= new Float(sc.nextFloat());
        Float FMAX = GenericCompareOperation.compareMax(a,b,c);
        System.out.println(FMAX+ " is the Maximum Float number");

        //For String
        System.out.println("Checking MAX between Apple, Banana, Peach");
        String p = new String("Apple");
        String q = new String("Banana");
        String r = new String("Peach");
        String SMAX = GenericCompareOperation.compareMax(p,q,r);
        System.out.println(SMAX+ " is the Maximum String");

    }
}
