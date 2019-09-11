package practice4;

public class FizzbuzzPractice01 {
    public static void main(String[] args) {
        //Write a Java program that prints the numbers from 1 to 50. But for multiples of
        // three print "Fizz" instead of the number and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz"


        int n=50;
        //important note:: Problem i have faced here
        //everytime 3,6,9,12,15...it prints fizz
        //everytime 5,10,15,20 it prints buzz
        // when its 15 it prints fizz so this will not print buzz for me
        //bcuz if i loop fizz 1st this will print fizz on 15,if i loop buzz first this will print buzz on 15
        //and if i loop fizzbuzz first this will print fizzbuzz on 15.
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");//3*5=15 so everytime it multiples of 15 it prints fizzbuzz
            }
            if (i%3==0){
                System.out.println("fizz");
            }else if (i%5==0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
