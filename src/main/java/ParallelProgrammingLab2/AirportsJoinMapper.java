package ParallelProgrammingLab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportsJoinMapper extends Mapper<LongWritable, Text, TextPair, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] parsedAirportsListLine = ParseUtils.ParseAirportsListLine(value.toString());
        context.write(new TextPair(call.getSystemA().toString(),"0"),
                new Text(call.toString()));
    }
}
