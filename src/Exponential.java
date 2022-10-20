public class Exponential {

    public static void main(String args[]){
        int n = 100;
        System.out.println(fibonacci(5));


    }
    static int fibonacci(int number)
    {
        if (number <= 1)
            return number;

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
