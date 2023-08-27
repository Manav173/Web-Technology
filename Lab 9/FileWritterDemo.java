import java.io.*;

public class FileWritterDemo
{
	public static void main(String[] args) throws IOException
	{
		String in = "Introduction to Java Programming";
		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		for(int i = 0; i < in.length(); i++)
		{
			fw.write(in.charAt(i));
		} 
		bw.close();
	}
}
