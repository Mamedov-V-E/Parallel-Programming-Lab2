package ParallelProgrammingLab2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;
import org

public class TextPairComparator extends WritableComparator {
    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        return ((TextPair)a).compareTo((TextPair)b);
    }
    @Override
    public int compare()
}
