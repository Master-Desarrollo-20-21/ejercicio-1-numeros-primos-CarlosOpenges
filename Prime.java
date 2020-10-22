public class Prime {

    public Prime(){
    }

    public static boolean isPrime (int number) {
        if (number == 0 || number == 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int nextPrime (int number){
        number++;
        do {
           if (!isPrime(number)) {
               number++;
           }
        }while (!isPrime(number));
        return number;
    }
}