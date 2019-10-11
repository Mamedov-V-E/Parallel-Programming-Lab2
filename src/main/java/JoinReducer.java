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

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        double average = 0;
        long counter = 0;
        while (iter.hasNext()) {
            long delay = Long.parseLong(iter.next().toString());
            if (delay > max) { max = delay; }
            if (delay < min) { min = delay; }
            if (counter == 0) {
                average = delay;
            } else {
                average *= (double)counter/(counter+1);
            }
            counter++;
        }
        
        context.write(, new LongWritable(counter));
    }
}