public class Swap {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Before Swapping a= "+a+" and b= "+b);
        int tmp=a;
        a=b;
        b=tmp;
        System.out.println("After Swapping a= "+a+" and b= "+b);
    }
}

