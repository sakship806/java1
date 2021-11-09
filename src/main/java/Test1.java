import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Test1 {
    public static void main(String... args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some number : ");
        int num = sc.nextInt();
        printNumbers(num);

        }

    public static void printNumbers(int num){
//        while(num >= 0){
//            System.out.println(num);
//            num--;
//        }
//
//        for(int i=0; i<= num ; i++){
//            System.out.println(i);
//        }

//        do{
//            System.out.println(num);
//        }while (num-- > 4);

//       int result = 0;
//       result+= --num;
//       result+= num--;
//       result+= --num;
//        System.out.println(result);
    }
}
