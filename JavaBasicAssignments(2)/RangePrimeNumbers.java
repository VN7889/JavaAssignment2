public class RangePrimeNumbers {
    public static void main(String[] args) {
        for(int num=10;num<99;num++){
            boolean isPrime = true;
            if (num % 2 == 0) {
                isPrime = false;
            } else {
                for (int i = 3; i <= Math.sqrt(num); i += 2) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
