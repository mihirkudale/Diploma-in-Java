package Eleven;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class K {

	public static void main(String[] args) throws Exception {
		File f1=new File("D:\\java projects\\mindscripts(DIJ)\\core java\\chp 30.File Handling\\Testing.txt");
		FileWriter fw=new FileWriter(f1);
		BufferedWriter bw=new BufferedWriter(fw);
		String[] ref= {"Dog","cat","sheep","cow"};
		for (int i = 0; i < ref.length; i++) {
			bw.write(ref[i]);
			bw.newLine();
		}
		bw.close();
		System.out.println("Writing done");
	}
}
	
