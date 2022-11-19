package Two;

import java.io.File;
import java.io.IOException;

public class B {

	public static void main(String[] args) {
		File f1=new File("D:\\java projects\\mindscripts(DIJ)\\core java\\chp 30.File Handling\\Testing.txt");
		try {
			if (f1.createNewFile()) {
				System.out.println("file is created");
			}
			else {
				System.out.println("File is not created");
			}
		}
			 catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
		
		