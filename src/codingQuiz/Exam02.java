package codingQuiz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exam02 {
    //create a program which will
    // - take a specific number of family members name from the console. (has to be dynamic)
    // - take one specific name out of the list that user provided from console of whose secret santa to create
    // - your code should be able to create a secret santa for the choosen member of the family
    // - one can not be his own secret santa

    // if you want to take it to the next level, create the secret santa for all the family members in one go
    // one can not be secret santa for 2 people
    // one can not be secret santa for the same person for next 2 years

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Numbers of family member:");
//        int memberCount=scanner.nextInt();
//        ArrayList<String> arrayList= new ArrayList<>();
//
//        for(int a=0;a<memberCount;a++){
//            System.out.println("Enter names of the family members:");
//            String names=scanner.next();
//            arrayList.add(names);
//        }
//        System.out.println(arrayList);
//        Random random = new Random();
//        int size=random.nextInt(arrayList.size());
//        String santa=arrayList.get(size);
//        System.out.println("secret santa is "+santa);
        ArrayList<String> list= new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many people are in your family?");
        int cout = scanner.nextInt();
        for (int i=0;i<cout;i++){
            System.out.println("insert names:");
            list.add(scanner.next());
        }
        System.out.println("insert name whose secret santa to create");
        String secretsantaof=scanner.next();
        list.remove(secretsantaof);
        Random random = new Random();
        int index = random.nextInt(list.size());
        String secret = list.get(index);
        System.out.println(secretsantaof+ "secret santa is:"+ secret);



    }
}
