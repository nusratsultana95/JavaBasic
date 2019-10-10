package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int []numbers={22,1,33,42,4,7,2,9};
        //goal>>sort the array
        for(int i=1;i<numbers.length;i++){
            int j=i-1;//everytime j will be less than //now my j become 0; i
            int point = numbers[i];//point is a container where we storing value of i
            while(j>=0 && numbers[j]>point){
                numbers[j+1]=numbers[j];
                j=j-1;
            }
            numbers[j+1]=point;
            for(int newnumber:numbers){
                System.out.print(newnumber+", ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("final value:=");
        for(int newnumber:numbers ){
            System.out.print(newnumber+", ");
        }
    }
}
