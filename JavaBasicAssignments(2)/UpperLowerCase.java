public class UpperLowerCase {
    public static void main(String[] args) {
        if(args.length !=1){
            System.out.println("Enter a Command Line argument of an alphabet from a-z either in Uppercase or LowerCase");
        }else {
            String s = args[0];
            char char1 = s.charAt(0);
            if (Character.isLowerCase(char1)) {
                System.out.println("Character Entered "+char1+" and result is "+Character.toUpperCase(char1));
            } else {
                System.out.println("Character Entered "+char1+" and result is "+Character.toLowerCase(char1));
            }
        }
    }
}
