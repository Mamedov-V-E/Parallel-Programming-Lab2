package ParallelProgrammingLab2;

import org.apache.hadoop.io.*;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class TextPair implements WritableComparable<TextPair> {
    private Integer airportId;
    private Byte dataIdentifier;

    public TextPair() {
        this.airportId = 0;
        this.dataIdentifier = 0;
    }

    public TextPair(Integer airportId, Byte dataIdentifier) {
        this.airportId = airportId;
        this.dataIdentifier = dataIdentifier;
    }

    public Integer getAirportId() {
        return this.airportId;
    }

    public Byte getDataIdentifier() {
        return this.dataIdentifier;
    }

    public void setAirportId(Integer airportId) {
        this.airportId = airportId;
    }

    public void setDataIdentifier(Byte dataIdentifier) {
        this.dataIdentifier = dataIdentifier;
    }

    @Override
    public int compareTo(TextPair pair) { return this.toString().compareTo(pair.toString()); }

    @Override
    public String toString() {
        return this.airportId.toString() + this.dataIdentifier.toString();
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        this.airportId = in.readInt();
        this.dataIdentifier = in.readByte();
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(this.airportId);
        out.writeByte(this.dataIdentifier);
    }
}
