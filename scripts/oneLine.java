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
 * This script takes converts the full file into 1-line
 * 
 */

public class oneLine
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("temp.geojson"));
        FileWriter file2 = new FileWriter("temp2.geojson");
		String currLine;

        while (file.hasNextLine())
        {
            currLine = file.nextLine();
            file2.write(currLine);
        }

        file2.close();
	}

	public static void main(String[] args) throws Exception
	{
		new oneLine().run();
	}	
	
}