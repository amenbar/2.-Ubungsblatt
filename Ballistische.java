public class Ballistische {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Bitte geben Sie genau drei Argumente ein: x0, v0 und t.");
            return;}
        else {
            float x0 = Float.parseFloat(args[0]);
            float v0 = Float.parseFloat(args[1]);
            float t = Float.parseFloat(args[2]);
            String s = "9.81";
            double g = Double.parseDouble(s);
            double h = x0 + v0 * t - (g * t * t) / 2;
            System.out.println(h);
        }
    }
}
