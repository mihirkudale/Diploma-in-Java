package Twelve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class L {

	public static void main(String[] args) throws Exception {
		File f=new File("D:\\java projects\\mindscripts(DIJ)\\core java\\chp 30.File Handling\\Testing.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		{
			while (s!=null) {
				System.out.println(s);
				s=br.readLine();
			}
			br.close();
			
		}
	}

}
