public class SortCharacters {
    public static void main(String[] args) {
        if(args.length !=2){
            System.out.println("Enter two alphabets in the command line arguments");
        }else {
            String s1=args[0];
            char alpha1 = s1.charAt(0);
            String s2=args[1];
            char alpha2 = s2.charAt(0);
            if (alpha1 <= alpha2) {
                System.out.print(alpha1+","+alpha2);
            } else {
                System.out.println(alpha2+","+alpha1);
            }
        }
    }
}
