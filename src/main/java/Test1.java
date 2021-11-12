import java.io.IOException;
import java.util.*;


public class Test1 {
    public static void main(String... args) throws IOException {
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

        String input = "abcbad";
        findCharOccurence(input);

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
