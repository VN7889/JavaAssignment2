public class FirstFiveMultiples {
    public static void main(String[] args) {
        int count=1;
        int i=1;
        while (count<6){
            if(i%2==0 && i%3==0 && i%5==0){
                System.out.println(i);
                count++;
                i++;
            }else {
                i++;
            }
        }
    }
}
