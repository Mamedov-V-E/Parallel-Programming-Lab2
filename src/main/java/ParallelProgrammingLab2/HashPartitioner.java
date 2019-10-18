package ParallelProgrammingLab2;

import org.apache.hadoop.mapreduce.Partitioner;

public class HashPartitioner<K, V> extends Partitioner<K, V> {
    @Override
    public int getPartition(TextPair key, V value, int numReduceTasks) {
        return (key.getAirportId().hashCode() & Integer.MAX_VALUE) % numReduceTasks;
    }
}