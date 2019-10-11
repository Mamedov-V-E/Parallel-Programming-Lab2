import org.apache.hadoop.io.BooleanWritable;
import org.apache.hadoop.io.ByteWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;

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

    public void readFields(DataInput in) {

    }

    public void write(DataOutput out) {

    }
}
