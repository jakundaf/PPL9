package PodstawyProgramowaniaL9;

public class lekcja1 {
    public static void main(String[] args) {

        int firstVariable = 10;
        int secondVariable = 5;

        System.out.println(firstVariable - secondVariable);
        System.out.println(firstVariable + secondVariable);
        System.out.println(firstVariable / secondVariable);
        System.out.println(firstVariable * secondVariable);

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
}
