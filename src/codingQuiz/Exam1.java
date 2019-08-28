package codingQuiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Exam1 {

    //    //create a program which will
    //    // - take a specific number of student name from the console
    //    // - for each student, it should ask for 4 subjects name and marks for them all
    //    // - your code should get the avg marks & total for the each of the students
    //    // - store all the students name, marks, subjects in individual ArrayList/Hashset and print all subjects, students name from that
    //
    //    //Tips : You may want to use Scanner, ArrayList, HashSet/ArrayList
    //    //Your code needs to by dynamic enough to handle as many numbers of student user may want to.
    //    //Think Smartly !
    //****************************************************************************************

    public static void main(String[] args) {
        //hashset only stores unit values
        //dynamic(more than one time)>>> use loop
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many Students do you want to calculate?");
        int count = scanner.nextInt();

        for(int i=0;i<count;i++){
            System.out.println("insert students name:");
            String student = scanner.next();
            HashSet subjectList= new HashSet();
            subjectList.add("math");
            subjectList.add("science");
            subjectList.add("Acc");
            subjectList.add("physics");
            System.out.println("subjects:"+subjectList);
            HashSet markList = new HashSet();
            markList.add("100");
            markList.add("80");
            markList.add("79");
            markList.add("98");
            System.out.println("marks:"+markList);
        }
    }
}
