import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class JoinReducer extends Reducer<TextPair, Text, Text, Text> {
    @Override
    protected void reduce(TextPair key, Iterable<Text> values, Context context) throws
            IOException, InterruptedException {
        Iterator<Text> iter = values.iterator();
        Text outValue = new Text(iter.next());

        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        long average = 0;
        long counter = 0;
        while (iter.hasNext()) {
            counter++;
            IntWritable delay = new IntWritable(Integer.parseInt(iter.next().toString()));

        }

        context.write(, new LongWritable(counter));
    }
}