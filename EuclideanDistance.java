public class EuclideanDistance {
    public static void main(String[] args) {
        double x1= Integer.parseInt(args[0]);
        double y1= Integer.parseInt(args[1]);
        double x2= Integer.parseInt(args[2]);
        double y2= Integer.parseInt(args[3]);
        double distance= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.printf("The Euclidean distance between (%.2f, %.2f) and (%.2f, %.2f) is %.2f%n", x1, y1, x2, y2, distance);
    }
}
