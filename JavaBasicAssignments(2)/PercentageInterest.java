import java.util.Locale;

public class PercentageInterest {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Please enter Gender(Male or Female) and age(1 to 120) to find the percentage of interest");
        }
        String gender=args[0].toLowerCase();
        int age = Integer.parseInt(args[1]);
        if (gender.equals("female")) {
            if(age>=1 && age<=58){
                System.out.println("Percentage of Interest for "+gender+" of age "+age+" is 8.2%");
            }else if (age>58){
                System.out.println("Percentage of Interest for "+gender+" of age "+age+" is 7.6%");
            }else{
                System.out.println("Enter age between(1-120)");
            }
        }else if (gender.equals("male")){
            if (age>=1 && age<=60){
                System.out.println("Percentage of Interest for "+gender+" of age "+age+" is 9.2%");
            }else if (age>60){
                System.out.println("Percentage of Interest for "+gender+" of age "+age+" is 8.3%");
            }else{
                System.out.println("Enter age between(1-120)");
            }
        }else{
            System.out.println("Enter Gender correctly either male or female");
        }
    }
}
