public class ColorCode {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Enter a Command Line argument of any one alphabet out of these 5: [b,r,g,o,y] ");
        }else {
            String s=args[0].toUpperCase();
            char colorCode = s.charAt(0);
            switch (colorCode) {
                case 'B':
                    System.out.println("Blue");
                    break;
                case 'R':
                    System.out.println("Red");
                    break;
                case 'G':
                    System.out.println("Green");
                    break;
                case 'O':
                    System.out.println("Orange");
                    break;
                case 'Y':
                    System.out.println("Yellow");
                    break;
                default:
                    System.out.println("Invalid Code");
            }
        }
    }
}
