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
        if (key.get() > 1) {
            if (parsedFlightsLogLine[1].isEmpty()) {
                System.out.println("Пустая строка в качестве кода аеропорта в строке " + key.get());
            } else {
                TextPair outKey = new TextPair(
                        Integer.parseInt(parsedFlightsLogLine[0]), (byte)1);
                if (Double.parseDouble(parsedFlightsLogLine[1]) > 0) {
                    context.write(outKey, new Text(parsedFlightsLogLine[1]));
                }
            }
        } else {
            System.out.println("номер строки " + key.get());
        }
//        if (key.get() > 1) {
//            if (!parsedFlightsLogLine[1].isEmpty()){
//                TextPair outKey = new TextPair(
//                        Integer.parseInt(parsedFlightsLogLine[0]), (byte)1);
//                if (Double.parseDouble(parsedFlightsLogLine[1]) > 0) {
//                    context.write(outKey, new Text(parsedFlightsLogLine[1]));
//                }
//            }
//        }
    }
}
