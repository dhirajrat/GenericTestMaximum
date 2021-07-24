import java.util.Scanner;

public class GenericCompare {
    public static void main(String[] args){
        System.out.println("Enter 3 numbers to compare");
        Scanner sc = new Scanner(System.in);
        Integer x= new Integer(sc.nextInt());
        Integer y= new Integer(sc.nextInt());
        Integer z= new Integer(sc.nextInt());

        Integer m =new Integer ( x.compareTo(y) == 1 ? x : y);
        Integer MAX = new Integer ( m.compareTo(z) == 1 ? m : z);

        System.out.println(MAX+ " is the Maximum number");
    }
}
