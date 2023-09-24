public class OddEven {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Enter one positive or negative integer at command line argument");
        }else {
            int num = Integer.parseInt(args[0]);
            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        }
    }
}
