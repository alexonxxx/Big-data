package ipcount;


import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class MonthPartitioner extends Partitioner<Text, Text> {

	@Override
	public int getPartition(Text ip, Text month, int arg2) {
	
		
			if (month.equals(new Text("Jan"))) 
			{
			   return 0;
			}
			else if(month.equals(new Text("Feb"))) 
			{
			   return 1;
			}
			else if (month.equals(new Text("Mar"))) 
			{
			   return 2;
			}
			else if(month.equals(new Text("Apr"))) 
			{
			   return 3;
			}
			else if (month.equals(new Text("May"))) 
			{
			   return 4;
			}
			else if(month.equals(new Text("Jun"))) 
			{
			   return 5;
			}
			else if (month.equals(new Text("Jul"))) 
			{
			   return 6;
			}
			else if(month.equals(new Text("Aug"))) 
			{
			   return 7;
			}
			else if (month.equals(new Text("Sep"))) 
			{
			   return 8;
			}
			else if (month.equals(new Text("Oct"))) 
			{
			   return 9;
			}
			else if (month.equals(new Text("Nov"))) 
			{
			   return 10;
			}
			else{
			   return 11;
			}

		
			
		
	}

}
