public class CommandLineArgs {
    public static void main(String[] args) {
        if(args.length ==0){
            System.out.println("No Values");
        }else {
            String name1=args[0];
            String name2=args[1];
            System.out.println(name1+", "+name2);
        }
    }
}
