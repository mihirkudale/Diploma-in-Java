package Three;

import java.io.File;
import java.io.IOException;

public class C {

	public static void main(String[] args) {
		File f1=new File("D:\\java projects\\mindscripts(DIJ)\\core java\\chp 30.File Handling\\Testing.txt");
		try {
			if (f1.createNewFile()) {
				System.out.println("file created");
			}
			else {
				System.out.println("File not created,bcz it exists");
			}
		}
			 catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
