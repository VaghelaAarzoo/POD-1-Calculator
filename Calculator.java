public class Calculator{
    public static int add(int firstNumber, int secondNumber){
        return firstNumber+secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber){
        return firstNumber*secondNumber;
    }
    public static void main(String[] args) {
        int firstNumber = 2;
        int secondNumber = 5;

        int addedNumber  = add(firstNumber, secondNumber);
        System.out.println("The added number is: " + addedNumber);
        int multipliedNumber  = multiply(firstNumber, secondNumber);
        System.out.println("The added number is: " + multipliedNumber);
    }
}