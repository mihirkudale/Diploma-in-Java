package Eight;

import java.io.FileWriter;
import java.io.IOException;

public class H {

	public static void main(String[] args) {
		try {
			FileWriter fw=new
					FileWriter("D:\\java projects\\mindscripts(DIJ)\\core java\\chp 30.File Handling\\Testing.txt");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
