package One;

import java.io.File;

public class A {

	public static void main(String[] args) {
		File f1=new File("D:\\java projects\\mindscripts(DIJ)\\core java\\chp 30.File Handling\\Testing.txt");
		if (f1.mkdir()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("file not created");
		}
		if (f1.exists()) {
			System.out.println("File exists");
		}
		else {
			System.out.println("file not exists");
		}
		if (f1.delete()) {
			System.out.println("file deleted");
		}
		else {
			System.out.println("file not deleted");
		}

	}

}
