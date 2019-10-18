package ParallelProgrammingLab2;

public class ParseUtils {

    public static final Integer FLIGHTS_LOG_FIRST_PARAM_NUMBER = 14;
    public static final Integer FLIGHTS_LOG_SECOND_PARAM_NUMBER = 18;
    private static final String FLIGHTS_LOG_FIRST_PARAM_COLUMN_NAME = ""
    static String[] ParseFlightsLogLine (String line) {
        String[] parameters = line.split("\",\"");
        //String[] output = {parameters[13], parameters[17]};
        return new String[] {parameters[14], parameters[18]};
    }

    static String[] ParseAirportsListLine (String line) {
        //String[] parameters = line.split("\",\"");
        return line.split("\",\"");
    }
}
