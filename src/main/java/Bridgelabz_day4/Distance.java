package Bridgelabz_day4;

public class Distance {
    public static void main(String[] args) {


        int x = (args.length > 0) ? Integer.parseInt(args[0]) : 3;
        int y = (args.length > 0) ? Integer.parseInt(args[1]) : 4;

        double distance = Math.sqrt(x * x + y * y);

        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
    }
}
