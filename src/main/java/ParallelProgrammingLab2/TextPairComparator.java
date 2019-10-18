package ParallelProgrammingLab2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class TextPairComparator extends WritableComparator {
    protected TextPairComparator() {
        super(TextPair.class, true);
    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        return ((TextPair)a).compareTo(TextPair(b));
    }

//    @Override
//    public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
//        Integer i1 = readInt(b1, s1);
//        Integer i2 = readInt(b2, s2);
//
//        return i1.compareTo(i2);
//    }
}
