import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class JoinReducer extends Reducer<TextPair, Text, Text, Text> {
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws
            IOException, InterruptedException {
        Iterator<Text>
        Text airportName = new Text(iter.next())
        for (IntWritable value : values) {
            counter++;
        }

        context.write(key, new LongWritable(counter));
    }
}