//Program to remove duplicate name from File 
package Fourteen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class N {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\java projects\\mindscripts(DIJ)\\core java\\chp 30.File Handling\\Testing.txt");
		FileInputStream fin=new FileInputStream(f);
		byte[] barr=new byte[(int)f.length()];
		fin.read(barr);
		fin.close();
		FileOutputStream fout=new
				FileOutputStream("D:\\java projects\\mindscripts(DIJ)\\core java\\chp 30.File Handling\\Testing.txt");
		fout.write(barr);
		fout.close();
		System.out.println("writing done");
	}

}
