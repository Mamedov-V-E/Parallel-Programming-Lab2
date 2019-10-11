import org.apache.hadoop.io.BooleanWritable;
import org.apache.hadoop.io.ByteWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;

public class TextPair implements WritableComparable<TextPair> {
    private IntWritable airportId;
    private BooleanWritable dataIdentifier;

    public TextPair() {
        this.airportId = new IntWritable(0);
        this.dataIdentifier = new BooleanWritable(0);
    }

    public TextPair(IntWritable airportId, BooleanWritable dataIdentifier) {
        this.airportId = airportId;
        this.dataIdentifier = dataIdentifier;
    }

    public IntWritable getAirportId() {
        return this.airportId;
    }

    public BooleanWritable getDataIdentifier() {
        return this.dataIdentifier;
    }

    public void setAirportId(IntWritable airportId) {
        this.airportId = airportId;
    }

    public void setDataIdentifier(BooleanWritable dataIdentifier) {
        this.dataIdentifier = dataIdentifier;
    }

    public int compareTo(TextPair pair) {

    }

    public void readFields(DataInput in) {

    }

    public void write(DataOutput out) {

    }
}
