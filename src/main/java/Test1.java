import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String... args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some number : ");
        int num = sc.nextInt();
        printNumbers(num);

        }

    /**
     * @author sakshi
     * @param num
     * Good coding practice
     */
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
