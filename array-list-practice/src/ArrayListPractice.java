import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) throws Exception {
        List<String> myList = new ArrayList <String>();
        myList.add("One, two, three, four, five.");
        myList.add("Sunday, Monday, Tuesday, Wednesday, Thursday.");
        myList.add("You say you're right, but I think I'm right.");

        //removeEvenLength(myList);
        myList.add("Exploding Whales are not a good idea");
        myList.add("Exploding Birthday Cakes are alson not a Good Idea");
        myList.add(1, "Road runner are immune to being Exploded");
        myList.add(2, "Apples are good for you");
        myList.add("Considered crime in some countries is to carry concealed birthday cakes!");
        System.out.println(myList);
        myList.remove(2);
        System.out.println(myList);
        System.out.println(myList.get(3));
        String One = myList.get(0);
        System.out.println(One);
        System.out.print(myList.size());
        
        }
        //public static void removeEvenLength(List myList){
            //System.out.println(myList.get(3));

        }
        /*public static return averageVowels(){
        }
        public static void removeDuplicates(){
        }
        public static void doubleList(){
        }
        public static void minToFront(){
        }
        */

