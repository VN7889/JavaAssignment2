public class PrimeNumbers {
    public static void main(String[] args) {

        if(args.length!=1){
            System.out.println("Enter one number as command line argument.");
        }else{
            int num= Integer.parseInt(args[0]);
            boolean isPrime = true;
            if (num < 2) {
                System.out.println(num + " is neither Prime nor a Composite");
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(num + " is a Prime Number");
                } else {
                    System.out.println(num + " is not a Prime Number");
                }
            }
        }
    }
}
