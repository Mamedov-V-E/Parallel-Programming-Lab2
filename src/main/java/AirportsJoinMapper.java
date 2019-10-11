import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AirportsJoinMapper extends Mapper<LongWritable, Text, TextPair, Text> {
}
