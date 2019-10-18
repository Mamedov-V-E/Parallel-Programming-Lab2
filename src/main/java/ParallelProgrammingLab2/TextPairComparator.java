package ParallelProgrammingLab2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class TextPairComparator extends WritableComparator {
    public int compare(TextPair a, TextPair b) {
        return a.compareTo(b);
    }
}
