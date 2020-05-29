import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Input Angka Min: ");
        // int inputMin = scanner.nextInt();
        // System.out.println("Input Angka Max: ");
        // int inputMax = scanner.nextInt();
        // if (inputMin<inputMax) {            
        //     int baru = inputMax - inputMin +1;
        //     int array [] = new int[baru]; 
        //     array[0] = 3;
        //     for (int i = 0; i < array.length; i++) {
        //         array[i] = i + inputMin;
        //     }   
        //     System.err.println(Arrays.toString(array)); 
        //     // System.out.println(generateArrayFromRange(inputMin, inputMax));
        // }
        // else{
        //     System.out.println("Input salah");
        // }
        System.out.println("Input Angka: ");
        int input = scanner.nextInt();
        System.out.println(inputArray(input));
    }
    // public static ArrayList<Integer> generateArrayFromRange(int inputMin, int inputMax) {
    //     ArrayList<Integer> numbers = new ArrayList<Integer>();
    //     for (int i = inputMin; i <= inputMax; i++) {
    //         numbers.add(i); //sama seperti push
    //     }
    //     // System.out.println(numbers);
    //     return numbers;
    // }
    public static boolean inputArray(int input) {
        // ArrayList<Integer> numbers = new ArrayList<Integer>();
        int[] numbers = { 1,2,3,4,5 };  
        // boolean tes = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==input) return true;
            
        }
        return false;
    }
}