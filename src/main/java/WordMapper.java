import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

public class WordMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException,
            InterruptedException {

        String line = value.toString();
        String specialSymbols = "[—\\[\\]?!,.«»();„“:…]+";
        String words[] =
                line.replaceAll(specialSymbols, "").toLowerCase().split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                context.write(new Text(word), new IntWritable(1));
            }
        }
    }
}