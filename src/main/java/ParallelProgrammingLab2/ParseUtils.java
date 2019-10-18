package ParallelProgrammingLab2;

public class ParseUtils {
    private static final Integer FLIGHTS_LOG_AIRPORT_ID_PARAM_NUMBER = 14;
    private static final Integer FLIGHTS_LOG_DELAY_PARAM_NUMBER = 17;

    static String[] ParseFlightsLogLine (String line) {
        String[] parameters = line.split(",");
        for (int i = 0; i < parameters.length; ++i) {
            parameters[i] = parameters[i].replaceAll("\"", "");
        }
        return new String[] {parameters[FLIGHTS_LOG_AIRPORT_ID_PARAM_NUMBER], parameters[FLIGHTS_LOG_DELAY_PARAM_NUMBER]};
    }

    static String[] ParseAirportsListLine (String line) {
        String[] parameters = line.split("\",\"");
        for (int i = 0; i < parameters.length; ++i) {
            parameters[i] = parameters[i].replaceAll("\"", "");
        }
        return parameters;
    }

//    private static String[] ParseCSVLine(String line) {
//        String[] parameters = line.split(",");
//        for (String p : parameters) {
//            p = p.replaceAll("\"", "");
//        }
//        return parameters;
//    }
}
