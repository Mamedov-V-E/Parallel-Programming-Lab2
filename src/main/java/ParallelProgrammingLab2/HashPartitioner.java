package ParallelProgrammingLab2;

import org.apache.hadoop.mapreduce.Partitioner;

public class HashPartitioner<K, V> extends Partitioner<K, V> {
    public int getPartition(K key, V value, int numReduceTasks) {
        return (((TextPair)key).getAirportId().hashCode() & Integer.MAX_VALUE) % numReduceTasks;
    }
}