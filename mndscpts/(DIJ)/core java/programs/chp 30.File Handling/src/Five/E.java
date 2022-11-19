package Five;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E {

	public static void main(String[] args) {
		File f1=new File("D:\\java projects\\mindscripts(DIJ)\\core java\\chp 30.File Handling\\Testing.txt");
		try {
			FileReader fr=new FileReader(f1);
			char t[]=new char[(int)f1.length()];
			fr.read(t);
			String rv=new String(t);
			System.out.println(rv);
			System.out.println(rv.toUpperCase());
			fr.close();
			}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
			
			 catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
