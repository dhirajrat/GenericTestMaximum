import java.util.Arrays;

public class GenericCompareOperation {
    /**
        Method Comparable Max defined
     */
    public static <T extends Comparable> T testMax(T a, T b, T c){
        T mf;
        mf = ( a.compareTo(b) == 1 ? a : b);
        T FMAX;
        FMAX = ( mf.compareTo(c) == 1 ? mf : c);
        printMax(FMAX);             // To print the maximum Entity
        return FMAX;
    }

    private static <T extends Comparable> void printMax(T fmax) {
        System.out.println(" Maximum is : " + fmax);
    }

    public static <T extends Comparable> T testMaxArray(T ... a){
        Arrays.sort(a); //Sorting Array method
        int i = a.length-1;
        return a[i];
    }
}