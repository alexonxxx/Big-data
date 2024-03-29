package ipcount;
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


public class IpReducer extends Reducer<Text,Text, Text, IntWritable> {
	@Override
	public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
		int ipCount=0;
		for (Text value: values){
			ipCount++;
		}
		context.write(key, new IntWritable(ipCount));
	}
	
}
