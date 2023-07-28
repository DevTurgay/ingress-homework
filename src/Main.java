public class Main {
    public static void main(String args[]) {
        Main obj = new Main();

        obj.checkNumber(10);

        // System.out.println(obj.toMilesPerHour(-5.6));
        obj.printConversation(1.5);

        obj.printMegaBytesAndKiloBytes(5000);
    }

    // Positive, Negative or Zero
    private void checkNumber(int number) {
        System.out.println(
                number > 0 ? "positive"
                        :
                        (number < 0 ? "negative" : "zero")
        );
    }

    // Speed Converter
    private long toMilesPerHour(double speedInKm) {
        if (speedInKm <= 0)
            return -1L;

        double unit = 0.621371;
        return (long) Math.round((speedInKm * unit));
    }

    private void printConversation(double kilometresPerHour) {
        long milesPerHour = this.toMilesPerHour(kilometresPerHour);
        System.out.println(milesPerHour == -1 ? "Invalid Value" :
                kilometresPerHour + " km/h = " + milesPerHour + " mi/h"
        );
    }

    // MegaBytes Converter
    private void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        int unit = 1024;
        System.out.println(kiloBytes < 0 ? "Invalid Value":
                kiloBytes + " KB = " + (kiloBytes/unit) + " MB and " + (kiloBytes%unit) + " KB"
                );
    }
}
