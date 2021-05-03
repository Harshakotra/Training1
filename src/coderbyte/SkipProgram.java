package coderbyte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SkipProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String line;
		boolean saw=false;
 
 File file=new File("C:\\Users\\kotra\\Documents\\test1.txt");
@SuppressWarnings("resource")
BufferedReader br= new	BufferedReader(new FileReader(file));
 Map <String,String> tree= new TreeMap<>();
 if((line=br.readLine())!=null)
 {
	 System.out.println(line);
 }
 while((line=br.readLine())!=null)
 {
	if(line.equals("")) {
		saw=true;
		continue;
	} 
	if(saw)
	{
		saw=false;
		continue;
	}	
	tree.put(line.split(",")[0], line);		
 }
 tree.forEach((x,y)->System.out.println(y));
	}

}
