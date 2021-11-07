import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test1 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String aStr = br.readLine();

        Scanner sc = new Scanner(System.in);
        int a =  Integer.parseInt(aStr);   //sc.nextInt();
        int b = sc.nextInt();
        int result = sumOfTwo(a,b);
        System.out.println(result);
        }

    public static int sumOfTwo(int a, int b){
        return a+b;
    }
}
