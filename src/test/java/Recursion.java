import static java.lang.Integer.sum;

public class Recursion {

    public static void main(String[] args) {
        int Result = Sum(10);
        System.out.println(Result);
    }

    public static int Sum(int k) {
        if (k >=0) {
            return k + Sum(k-1);
        }
        else return 0;
    }
}