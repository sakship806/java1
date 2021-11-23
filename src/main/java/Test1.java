import java.io.IOException;
import java.util.*;


public class Test1 {
    public static void main(String... args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter some number : ");
//        int num = sc.nextInt();
//        printNumbers();

//        Set<Integer> set1 = new HashSet<>();
//        set1.add(1);
//        set1.add(1);
//        set1.add(2);
//        set1.add(1);
//        for (Integer itr: set1) {
//            System.out.println(itr);
//        }
//
//        Set<Integer> set2 = new LinkedHashSet<>();
//        set2.add(1);
//        set2.add(1);
//        set2.add(2);
//        set2.add(1);
//        for (Integer itr: set2) {
//            System.out.println(itr);
//        }

//        String input = "abcbad";
//        int[] input = {1,2,3,4,5,6};
//        System.out.println(tt(input));
//        comboPrint();
        // 2:30 customer obsession (rakes)
        // humaun (divya manager , 9:30 pm )  developer platomrm
        // divya darshni - cloud platform

        String[] input = {"act", "tac", "abhi", "bhai"};
//        printPyramid();
//       printPrimes(2, 25);
        // System.out.println(isPrime(4));
//        System.out.println(fact(50l));
        factorial(1000);
        }

    static void factorial(int n)
    {
        int res[] = new int[5000000];

        // Initialize result
        res[0] = 1;
        int res_size = 1;

        // Apply simple factorial formula
        // n! = 1 * 2 * 3 * 4...*n
        for (int x = 2; x <= n; x++)
            res_size = multiply(x, res, res_size);

        System.out.println("Factorial of given number is ");
        for (int i = res_size - 1; i >= 0; i--)
            System.out.print(res[i]);
    }

    static int multiply(int x, int res[], int res_size)
    {
        int carry = 0; // Initialize carry

        // One by one multiply n with individual
        // digits of res[]
        for (int i = 0; i < res_size; i++)
        {
            int prod = res[i] * x + carry;
            res[i] = prod % 10; // Store last digit of
            // 'prod' in res[]
            carry = prod/10; // Put rest in carry
        }

        // Put carry in res and increase result size
        while (carry!=0)
        {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }



        public static long fact(long i){
           if(i==0 || i==1)
               return 1;
           return i*fact(i-1);
        }

        public static void printPrimes(int start, int count) throws Exception {
            if (start<2)
                throw  new Exception("Not valid Input");

            for(int i= start;; i++){
                if(isPrime(i)) {
                    count--;
                    System.out.println(i);
                }
                if (count ==0)
                    break;
            }
        }

        public static boolean isPrime(int input){
          for(int i=2; i<= Math.sqrt(input); i++)
              if(input %i ==0)
                  return  false;

          return true;
        }


        public static void printPyramid(){
            for (int i =5;i>=0;i--){
                for (int j=i; j<5; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

     public static void comboPrint(){
        for (int i=0; i< 6 ; i++){
            for (int j=0 ; j< 6; j++){
                System.out.println(i+ "   "+ j);
            }
        }
     }

     public static int tt(int[] input){
        int count=0;
        for (int i=0; i<input.length;i++){
            if (input[i]%2==0)
                count++;
        }
        return count;
     }

    public static void findCharOccurence(String input){
        Map<Character,Integer> map= new HashMap<>();
        for (Character ch: input.toCharArray()){
            if (map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch,1);
        }

        for (Character key : map.keySet())
            System.out.println(key + "   " + map.get(key));
    }

    public static boolean findDuplicate(String givenString){
        Set<Character> set = new HashSet<>();
//        for (Character ch : givenString.toCharArray())
//            set.add(ch);
//        return set.size() != givenString.length()? true : false;

        for (int i=0; i< givenString.length(); i++) {
//            set.add(givenString.charAt(i));
            Character ch = givenString.charAt(i);
            if (set.contains(ch))
                return true;
            else
                set.add(ch);
        }
        return false;
    }

    /**
     * @author sakshi
     * @param
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
