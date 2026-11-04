import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {

        //TASK 4
        System.out.println("TASK 4");

        Double [] arrT4 = new Double[10];
        
        //Show the array
        System.out.println("The array is: ");
        for (int i = 0; i < arrT4.length; i++) {
            arrT4[i] = Math.random() * 100;

            // show the array
            System.out.println("Random array of doubles["+(i+1)+"] = "+arrT4[i]);
        }
        System.out.println('\n');


        //print even index
        System.out.println("The even index numbers are: ");
        for(int i = 0; i < arrT4.length; i++) {
            if(i%2 == 0)
                System.out.println("Even index["+(i+1)+"] = "+arrT4[i]);}
        System.out.println('\n');
            
        
        //print odd number
        int integer = 0;
        System.out.println("The odd numbers are: ");
        for(int i = 0; i < arrT4.length; i++) {         
            integer = arrT4[i].intValue();
            if(integer%2 !=0)
                System.out.println("Odd number["+(i+1)+"] = "+integer);
        }
        //System.out.println('\n');
        System.out.println("EndOfTask4\n\n\n");
        //endOf Task4





        //TASK 5
        System.out.println("TASK 5");
        
        //get the inputed characters from user
        java.util.Scanner in = new Scanner(System.in);
        System.out.print("Enter a sequence of (5)characters: ");          
        String c = in.next();

        if (c.length() > 5) {
            System.out.println("You entered more than 5 characters, only the first 5 characters will be used");
            c = c.substring(0, 5); 
        }
        else if(c.length()<5){
            int requireMore = 5 - c.length();
            System.out.println("You entered less than 5 characters, please enter "+requireMore+" more characters:");
            String remainder = in.next();
            c += remainder;
            if (c.length() > 5) {
            c = c.substring(0, 5);
            }
            char[] arrOfCharsFromUser = new char[5];  
            c = c.toLowerCase();        
            for (int i = 0; i < arrOfCharsFromUser.length; i++) { 
                arrOfCharsFromUser[i] = c.charAt(i);
            }
        }

        // fill the array with the characters from the input string
        char[] arrOfCharsFromUser = new char[5];            
        for (int i = 0; i < arrOfCharsFromUser.length; i++) { 
            c = c.toLowerCase();
            arrOfCharsFromUser[i] = c.charAt(i);
        }


        //Show the array
        System.out.println("Your input is: ");
        for(int i = 0; i < arrOfCharsFromUser.length; i++){
            // show the array
            System.out.println("Character["+(i+1)+"] is: "+arrOfCharsFromUser[i]);
        }
        System.out.println('\n');

        
        //Show the array
            //made the array bigger because I messed up the understanding of the task
            //so we will find the occurence of each char in random array of 25 characters haha
        char [] RandArrT5 = new char[20];
        System.out.println("The random array is: ");
        for(int i = 0; i < RandArrT5.length; i++){
            Random r = new Random();
            RandArrT5[i] = (char)(r.nextInt(26) + 'a');
            // show the array
            System.out.println("Random character["+(i+1)+"] is: "+RandArrT5[i]);
        }
        System.out.println('\n');



        // //Testcase for zeroes
        //     //uncomment to test the zeroes case
        // for(int i = 0; i < arrOfCharsFromUser.length; i++){
        //     arrOfCharsFromUser[i] = 'w';
        // }



        //count the occurence of each char in the random array
        int [] count = new int[5];
        char find = ' ';
        // count the occurences of each character in the random array
        for(int i = 0; i < arrOfCharsFromUser.length; i++){
            find = arrOfCharsFromUser[i];
            count[i] = 0;
            for(int j = 0; j < RandArrT5.length; j++){
                if(RandArrT5[j]==find)
                    count[i]++;
            }   
        }
        // check if all the occurences are zeroes
        boolean allZeros = true;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                allZeros = false;
                break;
            }
        }
        if (allZeros) {
            System.out.println("All the characters occurrences are zeroes");
        } else {
            // if not all are zeroes, print the occurrences of each character
            for(int i = 0; i < arrOfCharsFromUser.length; i++){
                System.out.println("The occurence of ["+arrOfCharsFromUser[i]+"] in the random array is: "+count[i]);
            }
        }
        //System.out.println('\n');
        System.out.println("EndOfTask5\n\n\n");
        //endOf Task5





        //TASK 6
        System.out.println("TASK 6");

        //get the inputed characters from user
            //char [] arrOfCharsFromUser  -- from declared in task 5    
        //System.out.println(Character.getNumericValue(c.charAt(0)));

        int [] arrOfIntsFromUser = new int[5];
        for(int i = 0; i < arrOfCharsFromUser.length; i++){
            arrOfIntsFromUser[i] = Character.getNumericValue(arrOfCharsFromUser[i]);
        }


        // use bubble sort to sort the array of values of characters
        int n = arrOfIntsFromUser.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arrOfIntsFromUser[j] > arrOfIntsFromUser[j + 1]) {
                    // swap(arrOfIntsFromUser[j], arrOfIntsFromUser[j + 1]);
                    int temp = arrOfIntsFromUser[j];
                    arrOfIntsFromUser[j] = arrOfIntsFromUser[j + 1];
                    arrOfIntsFromUser[j + 1] = temp;    
                    swapped = true;
                }
            }
        
            // If no two elements were swapped, then break
            if (!swapped)
                break;
        }
        System.out.println("The sorted array is: ");
        for(int i = 0; i < arrOfIntsFromUser.length; i++){
            if(i == 0)
                System.out.println("Char from user["+(i+1)+"]: ["+arrOfCharsFromUser[i]+"]"+" has value: ["+arrOfIntsFromUser[i]+"] <-- smallest value");
            else
                System.out.println("Char from user["+(i+1)+"]: ["+arrOfCharsFromUser[i]+"]"+" has value: ["+arrOfIntsFromUser[i]+"]");
        }
        //System.out.println("The smallest value in the array is: "+arrOfIntsFromUser[0]);

        //System.out.println('\n');
        System.out.println("EndOfTask6\n\n");
        //endOf Task6




        //TASK 7
        System.out.println("TASK 7");

        boolean [] arrOfRandomBools = new boolean[10];

        
        //Create and show the array
        System.out.println("The array is: ");
        for (int i = 0; i < arrOfRandomBools.length; i++) {
            arrOfRandomBools[i] = Math.random() > 0.5;

            // show the array
            System.out.println("Random array of booleans["+(i+1)+"] = "+arrOfRandomBools[i]);
        }
        System.out.println('\n');

        //Find the number of true values in the array
        int countTrue = 0;
        int countFalse = 0;
        for(int i = 0; i < arrOfRandomBools.length; i++){
            if(arrOfRandomBools[i] == true)
                countTrue++;
        }
        countFalse = arrOfRandomBools.length - countTrue;
        

        boolean [] arrOfTrueBools = new boolean[countTrue];
        boolean [] arrOfFalseBools = new boolean[countFalse];
        //Create arrays of true and false values
        for(int i = 0; i < countTrue; i++ ){
            arrOfTrueBools[i] = true;
        }
        for(int i = 0; i < countFalse; i++ ){
            arrOfFalseBools[i] = false;
        }

        //Show the arrays of true and false values
        System.out.println("The number of true values in the array is: "+countTrue+"\nThe array of true values is: ");
        for(int i = 0; i < countTrue; i++ ){
            System.out.println("True value["+(i+1)+"] = "+arrOfTrueBools[i]);
        }
        System.out.println('\n');

        System.out.println("The number of false values in the array is: "+countFalse+"\nThe array of false values is: ");
        for(int i = 0; i < countFalse; i++ ){
            System.out.println("False value["+(i+1)+"] = "+arrOfFalseBools[i]);
        }

        System.out.println("EndOfTask7\n\n");
        //endOf Task7





        //TASK 8
        System.out.println("TASK 8");

        int [] arr1 = new int[10];
        int [] arr2 = new int[10];


        //define arr1 and arr2 with random numbers
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = (int)(Math.random() * 100);
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = (int)(Math.random() * 100);
        }

        //Show the arrays
        System.out.println("The first array is: ");
        for(int i = 0; i < arr1.length; i++){
            System.out.println("Array1["+i+"] = "+arr1[i]);
        }
        System.out.println('\n');
        System.out.println("The second array is: ");
        for(int i = 0; i < arr2.length; i++){
            System.out.println("Array2["+i+"] = "+arr2[i]);
        }
        System.out.println('\n');

        //Count the number of common values in the two arrays
        int countMatch = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    countMatch++;
                    break;
                }
            }
        }

        // Create an array to hold the common values
        int[] arr3 = new int[countMatch];
        int k = 0;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    arr3[k] = arr1[i]; 
                    k++;               
                    break;
                }
            }
        }

        System.out.println("The array of common values is: ");
        if (arr3.length == 0) {
            System.out.println("There are no common values in the two arrays");
        } else {
            for (int i = 0; i < arr3.length; i++) {
                System.out.println("Common value[" + (i + 1) + "] = " + arr3[i]);
            }
        }
        System.out.println();

        int [] arr4 = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++){   
            for(int j = 0; j < arr2.length; j++){
               arr4[i] = arr1[i];
               arr4[arr1.length + j] = arr2[j];
            }
        }
        System.out.println("The array of all values is: ");
        for(int i = 0; i < arr4.length; i++){
            System.out.println("All values["+(i+1)+"] = "+arr4[i]);
        }
        System.out.println('\n');
        
        int gay = arr3.length;
        if (gay == 0) {
            System.out.println("There are no common values between arr1 and arr2.");
        } else {
            boolean swapped1 = false;
            for (int i = 0; i < gay - 1; i++) {
                swapped1 = false;
                for (int j = 0; j < gay - i - 1; j++) {
                    if (arr3[j] > arr3[j + 1]) {
                        int temp = arr3[j];
                        arr3[j] = arr3[j + 1];
                        arr3[j + 1] = temp;
                        
                        swapped1 = true;
                    }
                }
            
                if (!swapped1)
                    break;
            }
        }


        System.out.println("The sorted array of all values is: ");
        for (int i = 0; i < arr4.length; i++) {
            System.out.println("Sorted value[" + (i + 1) + "] = " + arr4[i]);
        }

        System.out.println("EndOfTask8\n\n");
        //endOf Task8
	}
}
