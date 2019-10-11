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

//        String specialSymbols = "\\P{L}+";
//        String specialSymbols = "[^a-zA-Z0-9а-яА-Я'\\- ]";
        String specialSymbols = "[—\\[\\]?!,.«»();„“:…]+";
//        String specialSymbols = "[\\[\\]?!,.«»();„“:…]|— ";
//        String words[] =
//                line.replaceAll(specialSymbols, "").replaceAll("\\n+", " ").toLowerCase().split(" ");
//        String words[] =
//                line.replaceAll(specialSymbols, "").toLowerCase().split("\\s+");
        String words[] =
                line.replaceAll(specialSymbols, "").toLowerCase().split("\\s+");
//        String words[] =
//                line.toLowerCase().split(specialSymbols);

        for (String word : words) {
//            context.write(new Text(word), new IntWritable(1));
            if (!word.isEmpty()) {
                context.write(new Text(word), new IntWritable(1));
            }
        }
    }
}