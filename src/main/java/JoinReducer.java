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

        int min = new IntWritable(Integer.MAX_VALUE);
        int max = new IntWritable(Integer.MIN_VALUE);
        int average = new IntWritable(0);
        int counter = new IntWritable(0);
        while (iter.hasNext()) {
            counter++;
            IntWritable delay = new IntWritable(Integer.parseInt(iter.next().toString()));

        }

        context.write(, new LongWritable(counter));
    }
}