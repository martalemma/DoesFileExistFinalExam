package exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileExist {

	public static void main(String[] args) throws IOException {
		String path = "data\\\\FileExist.properties";
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		while ((line=br.readLine()) != null) {
			System.out.println(line);
		}
		doesFileexist();
	}
	
	
	public  static void doesFileexist() throws IOException {
String path ="data\\FileExist.properties";
		
		Properties prop = new Properties();
		
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		prop.load(fi);
		System.out.println(prop.getProperty("Apple"));
		
	}

}
