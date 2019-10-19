package ParallelProgrammingLab2;

public class ParseUtils {
    private static final Integer FLIGHTS_LOG_AIRPORT_ID_PARAM_NUMBER = 14;
    private static final Integer FLIGHTS_LOG_DELAY_PARAM_NUMBER = 17;
    private static final String FLIGHTS_LOG_DELIMITER = ",";
    private static final String AIRPORTS_LIST_DELIMITER = "\",\"";
    public static final Integer AIRPORTS_LIST_HEADER_LINE_NUMBER = 0;
    public static final Integer FLIGHTS_LOG_HEADER_LINE_NUMBER = 0;
    public static final Byte AIRPORTS_LIST_CODE = 0;
    public static final Byte FLIGHTS_LOG_CODE = 1;

    static String[] ParseFlightsLogLine (String line) {
        String[] parameters = ParseCSVLine(line, FLIGHTS_LOG_DELIMITER);
        return new String[] {parameters[FLIGHTS_LOG_AIRPORT_ID_PARAM_NUMBER], parameters[FLIGHTS_LOG_DELAY_PARAM_NUMBER]};
    }

    static String[] ParseAirportsListLine (String line) {
        return ParseCSVLine(line, AIRPORTS_LIST_DELIMITER);
    }

    private static String[] ParseCSVLine(String line, String delimiter) {
        String[] parameters = line.split(delimiter);
        for (int i = 0; i < parameters.length; ++i) {
            parameters[i] = parameters[i].replaceAll("\"", "");
        }
        return parameters;
    }
}
