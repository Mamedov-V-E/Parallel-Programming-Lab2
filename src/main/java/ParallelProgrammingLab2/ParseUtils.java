package ParallelProgrammingLab2;

public class ParseUtils {

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
