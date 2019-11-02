package ipcount;
import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class IpMapper extends Mapper<LongWritable, Text, Text, Text>{
	@Override
	public void map (LongWritable  key, Text value, Context context) throws IOException, InterruptedException {
		String line = value.toString();
		String ip=line.split(" ")[0];
		String month=line.split("/")[1];
		context.write( new Text(ip), new Text(month));
	}

}
