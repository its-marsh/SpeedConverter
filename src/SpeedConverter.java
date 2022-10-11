public class SpeedConverter {
    public static long toMilesPerHour (double kilometersPerHour) {
        long calculatedValue;

        if(kilometersPerHour < 0) {
            calculatedValue = -1L;
        } else {
            calculatedValue = Math.round(kilometersPerHour / 1.609);
        }
        return calculatedValue;
    }

    public static void printConversion (double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
