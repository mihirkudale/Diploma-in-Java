package Six;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F {

	public static void main(String[] args) {
		File f=new File("D:\\java projects\\mindscripts(DIJ)\\core java\\chp 30.File Handling\\Testing.txt");
		try {
			FileWriter fw=new FileWriter(f);
			fw.write("ABCD");
			fw.close();
			System.out.println("Writing Done!");
			
			FileReader fr=new FileReader(f);
			int a=fr.read();//returns character int no
			while (a!=-1)//End of file condition 
				{
				System.out.println((char)a);
				a=fr.read();
			}
			fr.close();
			}
			
			 catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
