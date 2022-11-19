package Thirteen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class M {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\java projects\\mindscripts(DIJ)\\core java\\chp 30.File Handling\\Testing.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		//ArrayList<String>list=new ArrayList<String>
		ArrayList<String>list=new ArrayList<String>();
		String s=br.readLine();
		while (s!=null) {
			list.add(s);
			s=br.readLine();
		}
		Collections.sort(list);
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i));
			bw.newLine();
		}
			br.close();
			br.close();
			System.out.println("file Updated");
	}

}
