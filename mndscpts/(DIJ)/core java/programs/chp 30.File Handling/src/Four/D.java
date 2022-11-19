package Four;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("unused")
public class D {

	public static void main(String[] args) {
		
		try {
			FileWriter fw=new FileWriter("D:\\java projects\\mindscripts(DIJ)\\core java\\chp 30.File Handling\\Testing.txt");
			fw.write("Hello World,Hope you are fine");
			fw.flush();
			fw.close();
			}
			
			 catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
