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

        IntWritable min = new IntWritable(Integer.MAX_VALUE);
        IntWritable max = new IntWritable(Integer.MIN_VALUE);
        
        while (iter.hasNext()) {
            IntWritable delay = new IntWritable(Integer.parseInt(iter.next().toString()));

        }

        context.write(, new LongWritable(counter));
    }
}