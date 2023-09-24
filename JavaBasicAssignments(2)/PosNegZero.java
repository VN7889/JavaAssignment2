public class PosNegZero {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Enter one positive or negative integer at command line argument");
        }else {
            int num = Integer.parseInt(args[0]);
            if (num < 0) {
                System.out.println("Negative");
            } else if (num > 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Zero");
            }
        }
    }
}
