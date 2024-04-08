// Will Cowden
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

/*
 * This script takes in a 1-line geojson and converts it to each feature having its own line
 * 
 * Example output:
 * 
 *  {"type":"FeatureCollection","features":[
 *      {"type":"Feature","properties":{"name":"Turkey"},"geometry":{"coordinates"...
 *      {"type":"Feature","properties":{"name":"United Kingdom"},"geometry":{"coordinates"...
 *      ...
 *  ]}
 */

public class cleanupGeoJSON
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("temp.geojson"));
        FileWriter file2 = new FileWriter("temp2.geojson");
		String oneLine = file.nextLine();

        for (int x = 0; x != oneLine.length()-9;x++)
        {
            if (oneLine.substring(x,x+10).equals("{\"type\":\"F") && x > 4)
            {
                file2.write("\n    ");
            }
            file2.write(oneLine.substring(x,x+1));
        }
        file2.write(oneLine.substring(oneLine.length()-9,oneLine.length()-2) + "\n]}");
        file2.close();
	}

	public static void main(String[] args) throws Exception
	{
		new cleanupGeoJSON().run();
	}	
	
}