package ParallelProgrammingLab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportsJoinMapper extends Mapper<LongWritable, Text, TextPair, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] parsedAirportsListLine = ParseUtils.ParseAirportsListLine(value.toString());
        if (key.get() > 0) {
            TextPair outKey = new TextPair(
                    Integer.parseInt(parsedAirportsListLine[0]), (byte)0);
            context.write(outKey, new Text(parsedAirportsListLine[1]));
        }
    }
}
