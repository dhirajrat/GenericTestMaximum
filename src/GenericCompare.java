import java.util.Scanner;

/**
 *  Generic Max Entity checking Program
 */
public class GenericCompare {
    public static void main(String[] args){

        //For Integer
        System.out.println("Enter 3 Integer numbers to compare");
        Scanner sc = new Scanner(System.in);
        Integer x= new Integer(sc.nextInt());
        Integer y= new Integer(sc.nextInt());
        Integer z= new Integer(sc.nextInt());
        Integer IMAX = GenericCompareOperation.testMax(x,y,z);

        //For Float
        System.out.println("Enter 3 Float numbers to compare");
        Float a= new Float(sc.nextFloat());
        Float b= new Float(sc.nextFloat());
        Float c= new Float(sc.nextFloat());
        Float FMAX = GenericCompareOperation.testMax(a,b,c);

        //For String
        System.out.println("Checking MAX between Apple, Banana, Peach");
        String p = new String("Apple");
        String q = new String("Banana");
        String r = new String("Peach");
        String SMAX = GenericCompareOperation.testMax(p,q,r);

        //Refactor for more Integer
        System.out.println("Enter 6 Integer numbers to compare");
        Scanner sc1 = new Scanner(System.in);
        Integer x1= new Integer(sc.nextInt());
        Integer y1= new Integer(sc.nextInt());
        Integer z1= new Integer(sc.nextInt());
        Integer x2= new Integer(sc.nextInt());
        Integer y2= new Integer(sc.nextInt());
        Integer z2= new Integer(sc.nextInt());
        Integer IMAX1 = GenericCompareOperation.testMaxArray(x1,y1,z1,x2,y2,z2);
        System.out.println(IMAX1+ " is the Maximum Integer number");
    }
}
