package ParallelProgrammingLab2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

import java.io.IOException;

public class TextPairComparator extends WritableComparator {
    @Override
    public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
        try {
            buffer.reset(b1, s1, l1);                   // parse key1
            key1.readFields(buffer);

            buffer.reset(b2, s2, l2);                   // parse key2
            key2.readFields(buffer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return compare(key1, key2);
    }
    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        return a.compareTo(b);
    }
}
