import org.apache.hadoop.io.BooleanWritable;
import org.apache.hadoop.io.ByteWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;

public class TextPair implements WritableComparable<TextPair> {
    private IntWritable airportId;
    private BooleanWritable dataIdentifier;

    public IntWritable getAirportId() {
        return this.airportId;
    }

    public BooleanWritable getDataSet() {
        return this.dataSet;
    }

    public void setAirportId(IntWritable airportId) {
        this.airportId = airportId;
    }

    public void setDataSet(IntWritable airportId) {
        this.airportId = airportId;
    }

    public int compareTo(TextPair pair) {

    }

    public void readFields(DataInput in) {

    }

    public void write(DataOutput out) {

    }
}
