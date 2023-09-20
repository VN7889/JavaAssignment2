public class FibonacciWord {
    public static void main(String[] args) {
        int n=10;
        String a="a";
        String b="b";
        String res="";
        System.out.println("f(0) = "+a);
        System.out.println("f(1) = "+b);
        for(int i=2;i<=n;i++){
            res= a+b;
            a=b;
            b=res;
            System.out.println("f("+i+") = "+res);
        }
    }
}
