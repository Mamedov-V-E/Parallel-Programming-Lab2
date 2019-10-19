package ParallelProgrammingLab2;

public class ParseUtils {
    private static final Integer FLIGHTS_LOG_AIRPORT_ID_PARAM_NUMBER = 14;
    private static final Integer FLIGHTS_LOG_DELAY_PARAM_NUMBER = 17;

    static String[] ParseFlightsLogLine (String line) {
        String[] parameters = ParseCSVLine(line, ",");
        return new String[] {parameters[FLIGHTS_LOG_AIRPORT_ID_PARAM_NUMBER], parameters[FLIGHTS_LOG_DELAY_PARAM_NUMBER]};
    }

    static String[] ParseAirportsListLine (String line) {
        return ParseCSVLine(line, "\",\"");
    }

    private static String[] ParseCSVLine(String line, String delimiter) {
        String[] parameters = line.split(delimiter);
        for (int i = 0; i < parameters.length; ++i) {
            parameters[i] = parameters[i].replaceAll("\"", "");
        }
        return parameters;
    }
}
