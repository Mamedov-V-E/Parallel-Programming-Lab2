package ParallelProgrammingLab2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class TextPairComparator extends Generator.Has {
    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        return ((TextPair)a).compareTo((TextPair)b);
    }
}
