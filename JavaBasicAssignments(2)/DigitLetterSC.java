public class DigitLetterSC {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Enter any alphabet or number or a symbol at command line argument");
        }else {
            String s1= args[0];
            char char1 = s1.charAt(0);
            if (Character.isLetter(char1)) {
                System.out.println("Alphabet");
            } else if (Character.isDigit(char1)) {
                System.out.println("Digit");
            } else {
                System.out.println("Special Character");
            }
        }
    }
}
