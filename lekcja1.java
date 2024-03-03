package PodstawyProgramowaniaL9;

import java.util.Scanner;

public class lekcja1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        basicOperations();
        arraysEvenOrNotEven();
        calculatingBmi();
        isPalindrome(scanner);

    }
    public static void basicOperations(){
        int firstVariable = 10;
        int secondVariable = 5;

        System.out.println(firstVariable - secondVariable);
        System.out.println(firstVariable + secondVariable);
        System.out.println(firstVariable / secondVariable);
        System.out.println(firstVariable * secondVariable);
    }

    public static void arraysEvenOrNotEven (){
        int[] myArray = new int[] {2, 3, 4, 6, 7, 8};
        int numbersValue = 0;

        for (int i = 0; i < myArray.length; i++){
            numbersValue += myArray[i];
        }

        int average = numbersValue / myArray.length;
        System.out.println("Średnia liczb w tablicy wynosi: " + average);

        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] % 2 == 0) {
                System.out.println("Liczba [" + myArray[i] + "] jest parzysta");
            } else {
                System.out.println("Liczba [" + myArray[i] + "] nie jest parzysta");
            }
        }
    }

    public static void calculatingBmi(){
        double bmiValue = 0.00d;
        double weigth = 0.00d;
        double height = 0.00d;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoją wagę w kilogramach: " + scanner);
        weigth = scanner.nextDouble();
        System.out.println("Podaj swój wzrost w metrach: " + scanner);
        height = scanner.nextDouble();

        bmiValue = (weigth / (height * height));
        System.out.println("Your BMI is: " + bmiValue);
    }

    public static void isPalindrome(Scanner input){
        System.out.println("Palindrome check, enter word or sentence: ");

        while (input.hasNext()) {
            String sentence = input.nextLine();
            if (sentence.equals("quit")) {
                break;
            }
            for (int i = 0; i < sentence.length() / 2; i++) {
                char currentChar = sentence.charAt(i);
                char checkedChar = sentence.charAt(sentence.length() - i - 1);

                if (currentChar != checkedChar) {
                    System.out.println("Input: [" + sentence + "] isn't a palindrome");
                    break;
                } else {
                    System.out.println("Input: [" + sentence + "] is a palindrome");
                    break;
                }
            }
            System.out.println("Insert new entry or type 'quit' to exit. ");
        }
        System.out.println("The end of program.");
    }


}
