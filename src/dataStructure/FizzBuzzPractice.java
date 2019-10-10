package dataStructure;

public class FizzBuzzPractice {
    public static void main(String[] args) {
        //Write a Java program that prints the numbers from 1 to 50. But for multiples of
        // three print "Fizz" instead of the number and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz"

        for(int i=1;i<=50;i++){ //at first we need to print 1-50
             if(i%3==0 && i%5==0) { //everytime its 15(3x5)this will print fizzbuzz instead of numbers.
                 System.out.println("FizzBuzz");
             }else if(i%3==0){ //if number is multiple of 3 print fizz
                System.out.println("fizz");//that means everytime its 3x1,3x2,3x3....print fizz instead of number.
            }else if(i%5==0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }

}

