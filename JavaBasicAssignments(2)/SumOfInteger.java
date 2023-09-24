public class SumOfInteger {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Provide one integer as a command-line argument.");
        }else {
            String s=args[0];
            int sum=0;
            for(int i=0; i<s.length();i++){
                char charToInt= s.charAt(i);
                if(Character.isDigit(charToInt)){
                    int digit = Character.getNumericValue(charToInt);
                    sum+=digit;
                }
            }
            System.out.println("For given integer "+s+" the total is "+sum);
        }
    }
}
