public class driver {
    public static void main(String[] args) {
        System.out.println("Tip: $" + Double.parseDouble(args[0]) * .15    + "\nTotal cost: $" + (Double.parseDouble(args[0]) * .15 + Double.parseDouble(args[0])));
    }
}