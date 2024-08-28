import java.util.Scanner;

public class function {
    public static int CalculateSum(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void PrintMYname(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String name=sc.nextLine ();
        //PrintMYname(name);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(" sum of 2 number is :"+ CalculateSum(a, b));
    }
}
