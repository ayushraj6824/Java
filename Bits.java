public class Bits {

    public static void main(String[] args) {
        int n=5;
        int pos=3;
        int bitask=1<<pos;
        if ((bitask & n)==0) {
            System.out.println("bit was Zero");
        } else {
            System.out.println("bit was one");
        }
    }
}