package calculatornew;

public class Algebra {

    public void detectOddOrEven(int number) {

        String result = number % 2 == 0 ? "even" : "odd";
        System.out.println("Result: " + number + " is " + result);
    }

}
