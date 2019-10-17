import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class FlightsLogWritable implements Writable {
    private String line;

    public String getLine() {
        return this.line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void readFields(DataInput in) throws IOException {
        setLine(in.readLine());
    }

    public void write(DataOutput out) throws IOException {
        out.writeChars(getLine());
    }
}
