package ParallelProgrammingLab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class FlightsJoinMapper extends Mapper<LongWritable, Text, TextPair, Text> {
}
