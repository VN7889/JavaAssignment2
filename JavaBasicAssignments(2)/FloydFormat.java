public class FloydFormat {
    public static void main(String[] args) {
        if( args.length != 1){
            System.out.println("Please enter an Integer");
        }else{
            int n= Integer.parseInt(args[0]);
            if(n==0){
                System.out.println(" ");
            }else {
                for(int i=1;i<=n;i++){
                    System.out.println("*\t".repeat(i));
                }
            }
        }
    }
}
