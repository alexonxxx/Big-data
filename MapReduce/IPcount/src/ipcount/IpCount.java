package ipcount;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;



public class IpCount {
	public static void main(String[] args) throws Exception { 
	
		if(args.length!=2){
			System.out.printf("Entrega la ruta de entrada y de salida");
			System.exit(-1);
		}
			
			Job job = new Job();
			job.setJarByClass(IpCount.class);
			job.setJobName("Contador de IPs");
			
			FileInputFormat.setInputPaths(job, new Path(args[0]));
			FileOutputFormat.setOutputPath(job, new Path(args[1]));
			
			job.setMapperClass(IpMapper.class);
			job.setReducerClass(IpReducer.class);
			job.setCombinerClass(IpReducer.class);
			job.setMapOutputKeyClass(Text.class);
			job.setMapOutputValueClass(IntWritable.class);
			job.setOutputKeyClass(Text.class);
			job.setOutputValueClass(IntWritable.class);
			boolean success = job.waitForCompletion(true);
			System.exit(success ? 0 : 1);
			
		
	}
}
