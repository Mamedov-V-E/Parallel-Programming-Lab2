package ParallelProgrammingLab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportsJoinMapper extends Mapper<LongWritable, Text, TextPair, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] parsedAirportsListLine = ParseUtils.ParseAirportsListLine(value.toString());

        if (key.get() != ParseUtils.AIRPORTS_LIST_HEADER_LINE_NUMBER) {
            TextPair outKey = new TextPair(
                    Integer.parseInt(parsedAirportsListLine[ParseUtils.AIRPORTS_LIST_AIRPORT_ID_PARAM_NUMBER]),
                    ParseUtils.AIRPORTS_LIST_CODE);
            context.write(outKey,
                    new Text(parsedAirportsListLine[ParseUtils.AIRPORTS_LIST_AIRPORT_DESCRIPTION_PARAM_NUMBER]));
        }
    }
}
