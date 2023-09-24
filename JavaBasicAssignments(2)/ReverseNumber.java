public class ReverseNumber {
    public static void main(String[] args) {
        if (args.length!=1){
            System.out.println("Enter a number to reverse it");
        }else {
            int num=Integer.parseInt(args[0]);
            int reverse=0;
            while (num!=0){
                int remainder=num%10;
                reverse= reverse*10 +remainder;
                num=num/10;
            }
            System.out.println(reverse);
        }
    }
}
