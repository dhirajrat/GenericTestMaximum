import java.util.Scanner;

public class GenericCompare {
    public static void main(String[] args){
        System.out.println("Enter 3 Integer numbers to compare");
        Scanner sc = new Scanner(System.in);
        Integer x= new Integer(sc.nextInt());
        Integer y= new Integer(sc.nextInt());
        Integer z= new Integer(sc.nextInt());

        Integer m =new Integer ( x.compareTo(y) == 1 ? x : y);
        Integer IMAX = new Integer ( m.compareTo(z) == 1 ? m : z);

        System.out.println(IMAX+ " is the Maximum Integer number");

        System.out.println("Enter 3 Float numbers to compare");
        Float a= new Float(sc.nextFloat());
        Float b= new Float(sc.nextFloat());
        Float c= new Float(sc.nextFloat());

        Float mf =new Float ( a.compareTo(b) == 1 ? a : b);
        Float FMAX = new Float ( mf.compareTo(c) == 1 ? mf : c);

        System.out.println(FMAX+ " is the Maximum Float number");

        System.out.println("Checking MAX between Apple, Banana, Peach");

        String p = new String("Apple");
        String q = new String("Banana");
        String r = new String("Peach");

        String ms =new String ( p.compareTo(q) == 1 ? p : q);
        String SMAX = new String ( ms.compareTo(r) == 1 ? ms : r);

        System.out.println(SMAX+ " is the Maximum String");
    }
}
