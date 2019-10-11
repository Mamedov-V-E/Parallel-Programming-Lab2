import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Partitioner;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class TextPair implements WritableComparable<TextPair> {
    private IntWritable airportId;
    private ByteWritable dataIdentifier;

    public TextPair() {
        this.airportId = new IntWritable(0);
        this.dataIdentifier = new ByteWritable((byte)0);
    }

    public TextPair(IntWritable airportId, ByteWritable dataIdentifier) {
        this.airportId = airportId;
        this.dataIdentifier = dataIdentifier;
    }

    public IntWritable getAirportId() {
        return this.airportId;
    }

    public ByteWritable getDataIdentifier() {
        return this.dataIdentifier;
    }

    public void setAirportId(IntWritable airportId) {
        this.airportId = airportId;
    }

    public void setDataIdentifier(ByteWritable dataIdentifier) {
        this.dataIdentifier = dataIdentifier;
    }

    public int compareTo(TextPair pair) {
        return this.toString().compareTo(pair.toString());
    }

    public String toString() {
        return this.airportId.toString() + this.dataIdentifier.toString();
    }

    public void readFields(DataInput in) throws IOException {
        airportId.readFields(in);
        dataIdentifier.readFields(in);
    }

    public void write(DataOutput out) throws IOException {
        airportId.write(out);
        dataIdentifier.write(out);
    }

    public class HashPartitioner<K, V> extends Partitioner<K, V> {
        public int getPartition(K key, V value, int numReduceTasks) {
            return (((K)(((TextPair)key).getAirportId())).hashCode() & Integer.MAX_VALUE) % numReduceTasks;
        }
    }
}
