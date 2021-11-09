import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String... args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some number : ");
       // int num = sc.nextInt();
        printNumbers();

        }

    /**
     * @author sakshi
     * @param num
     * Good coding practice
     */
    public static void printNumbers(){
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

        String[] arr = {"Sakshi", "Abhishek", "Shashank", "Veena"};
        System.out.println(arr.length);
        for (int i=0; i< arr.length; i++)
            if (i%2 ==0) {
                System.out.println(arr[i]);
            }

        List<String> list = new ArrayList<>();
        list.add("Sakshi");
        list.add("Abhishek");
        list.add("Shashank");
        list.add("Veena");

        System.out.println("-------------------------\n");
        for (String str: list)
            System.out.println(str);

        System.out.println(list.size());

        for (int i=0; i< list.size(); i++)
            System.out.println(list.get(i));

    }
}
