package Nine;

import java.io.FileWriter;
import java.io.IOException;

public class I {

	
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("D:\\java projects\\mindscripts(DIJ)\\core java\\chp 30.File Handling\\Testing.txt");
			fw.write("hello");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
