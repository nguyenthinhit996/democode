package home;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class structstream {
	public static void main(String [] args) {
		String path="person.json";
		SparkSession spark= SparkSession.builder().appName("20190109").config("spark.master", "local").getOrCreate();
		Dataset<Row> df=spark.read().format("json").json(path);
		df.show();
		spark.close();
	}
}
