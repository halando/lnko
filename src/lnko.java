import java.io.File;
import java.util.Scanner;

public class lnko {

    public static void main(String[] args) throws Exception {

        // int a = 121;
        // int b = 121;

        // if (a > b) {
        // System.out.println("A nem egyenlő b");
        // }
        // if (a < b) {
        // System.out.println("B nem egyenlő A");
        // }
        // else {
        // System.out.println(" Egyenlő");
        // }

        // // System.out.println(lnko(80,56));
        // // }
        // // static int lnko(int a, int b){
        // // while (a!=b)
        // // if(a>b) a= a-b; else b =b-a;
        // // return a;
        // }
        // }

        try {
            File file = new File("adta.txt");
            Scanner scanner = new Scanner(file);

        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}