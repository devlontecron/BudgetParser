import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;

public class Main {

	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		
		File selectedFile = getFile();
		
		BufferedReader br = new BufferedReader(new FileReader(selectedFile));
		String pointer = br.readLine();	
		while(pointer != null) {
			sb.append(pointer +"//");
			pointer = br.readLine();	
		}
		
		String gaps = sb.toString().replaceAll("  \\s+","*");
		
		ArrayList<String[]> monthoutput = createSpreadsheet(gaps);
		
		ArrayList<String[]> db = createdb();
		
		


		
		for(int j = 0; j < outerArr.size(); j++) {
			
		}
		
		String[] curr = outerArr.get(5);
		
		System.out.println(curr[1].toString());
			
		


		
	}
	
	private static ArrayList<String[]> createdb() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("database.txt"));
		String pointer = br.readLine();	
		StringBuilder sbb = new StringBuilder();
		while(pointer != null) {
			sbb.append(pointer +"//");
			pointer = br.readLine();	
		}
		
		ArrayList<String[]> out = new ArrayList<String[]>();
		
		String textdb = sbb.toString();
		
		try {
			for (int p = 0; p < textdb.length(); p++) {
				
				if(p<textdb.length()) {

					
				if (textdb.charAt(p) == '/' && textdb.charAt(p + 1) == '/' && p+2<textdb.length()) {
					while(textdb.charAt(p) != ',') {
						p++;
					}

					if (textdb.charAt(p) == ',') {
						int q = 1;
						while (textdb.charAt((p + q)) != ',') {
							q++;
						}
		
		
		
		return null;
	}

	public static ArrayList<String[]> createSpreadsheet(String gaps) {

		ArrayList<String[]> outerArr = new ArrayList<String[]>(); 
		
		try {
		for (int p = 0; p < gaps.length(); p++) {
			
			if(p<gaps.length()) {

				
			if (gaps.charAt(p) == '/' && gaps.charAt(p + 1) == '/' && p+2<gaps.length()) {
				while(gaps.charAt(p) != '*') {
					p++;
				}

				if (gaps.charAt(p) == '*') {
					int q = 1;
					while (gaps.charAt((p + q)) != '*') {
						q++;
					}
					int r = 1;
					while (gaps.charAt((p + q + r)) != '*') {
						r++;
					}

					String recipt = gaps.substring((p + 1), (p + q));
					String cost = gaps.substring((p + q+1), (p + q + r));

					String[] insert = { recipt, cost };

					outerArr.add(insert);

					p = p + q + r;
				}

			}
			}
		}
		}
		catch(Exception e) {
			
		}
		return outerArr;
		
	}

	public static File getFile() {
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(null);
		return fc.getSelectedFile();
		}

}
