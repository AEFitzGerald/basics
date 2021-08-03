import java.util.Arrays;
import java.util.ArrayList;

public class BasicThirteen {

    public static void printNumbers() {
        for(int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }

    public static void printOdd() {
        for(int i = 1; i <256; i+=2) {
            System.out.println(i);
        }   
    }

    public static int sigma(int num) {
        int total = 0;
        for(int i = 1; i <= num; i++){
            total += i;
        }
        return total;
    }

    
    public static void iterateArr(int[] inputArr) {
        for(int value: inputArr) {
            System.out.println(value);
        }
    }

    public static void findMax(int[] inputArr) {
        int maxVal = inputArr[0];
        for(int value: inputArr){
            if (value > maxVal) {
                maxVal = value;      
            }
        }
        System.out.println(maxVal);
    } 

    public static ArrayList<Integer> createOddArr(int someNum) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 1; i <= someNum; i+=2) {
            result.add(i);
        }
        return result;
    }


}
