import java.util.Arrays;
import java.util.ArrayList;

public class BasicThirteenTest {

    
    public static void main(String[] args){
        System.out.println("Main method entry point");

        BasicThirteen one = new BasicThirteen();
        one.printNumbers();
        BasicThirteen two = new BasicThirteen();
        two.printOdd();
        BasicThirteen three = new BasicThirteen();
        System.out.println(three.sigma(255));
        BasicThirteen four = new BasicThirteen();
        int[] arr1 = {1,3,5,7,9,13};
        four.iterateArr(arr1);
        BasicThirteen five = 
        new BasicThirteen();
        int[] arr2 = {1,101,9};
        five.findMax(arr2);
        int[] arr3 = {-6, -10, -2};
        five.findMax(arr3);
        BasicThirteen six = new BasicThirteen();
        System.out.println(six.createOddArr(255));
    }
}

