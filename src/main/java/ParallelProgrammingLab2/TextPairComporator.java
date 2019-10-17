package ParallelProgrammingLab2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

static class TextPairComparator extends WritableComparator {
    public int compare(WritableComparable a, WritableComparable b) {
        return a.compareTo(b);
    }
}
