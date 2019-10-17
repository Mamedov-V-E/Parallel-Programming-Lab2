package ParallelProgrammingLab2;

public class ParseUtils {

    static String[] ParseFlightsLogLine (String line) {
        //String[] parameters = line.split("\",\"");
        return line.split("\",\"");
    }

    static String ParseAirportsListLine (String line) {
        String[] parameters = line.split("\",\"");
        String[] output = {parameters[14], parameters[]};
    }
}
