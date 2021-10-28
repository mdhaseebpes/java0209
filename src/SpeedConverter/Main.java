package SpeedConverter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       long miles = Convert.toMilesPerHour(11.5);
        System.out.println("Miles per hour " + miles);

        Convert.printConversion(11.5);


    }

}
