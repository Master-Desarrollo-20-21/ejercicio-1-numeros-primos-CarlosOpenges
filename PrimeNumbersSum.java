public class PrimeNumbersSum {

    public static void main(String[] args) {

        Prime prime = new Prime();
        int counter = 0;
        int limit = 50;
        int actualNumber = 0;
        int sumFirst = 0;
        int sumSecond = 0;
        for (int i = 0; i <= limit; i++){
            if (prime.isPrime(i)){
                sumFirst += i;
            }
        }
        System.out.println("La suma de los números primos que hay entre los 50 primeros números es: " + sumFirst);

        do {
           actualNumber = prime.nextPrime(actualNumber);
           sumSecond += actualNumber;
           counter ++;
        }while (counter <= limit - 1));
        System.out.println("La suma de los 50 primeros números primos es: " + sumSecond);
    }
}