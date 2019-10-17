package ParallelProgrammingLab2;

import org.apache.hadoop.io.ByteWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightsJoinMapper extends Mapper<LongWritable, Text, TextPair, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] parsedFlightsLogLine = ParseUtils.ParseFlightsLogLine(value.toString());
        TextPair outKey = new TextPair(
                new IntWritable(Integer.parseInt(parsedFlightsLogLine[0])), new ByteWritable((byte)1));
        context.write(outKey, new Text(parsedFlightsLogLine[1]));
    }
}
