public class Palindrome {
    public static void main(String[] args) {
        if (args.length!=1){
            System.out.println("Enter a number at Command Line Argument to Check if it is a Palindrome or not");
        }else {
            int num=Integer.parseInt(args[0]);
            int n=num;
            int reverse=0;
            while (num!=0){
                int remainder=num%10;
                reverse= reverse*10 +remainder;
                num=num/10;
            }
            if(n == reverse){
                System.out.println(n+" is a Palindrome");
            }else {
                System.out.println(n+" is not a Palindrome");
            }
        }
    }
}
