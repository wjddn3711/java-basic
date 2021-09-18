package game;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Method {
	public ArrayList<String[]> getQuiz() throws Exception
	{
		File f = new File("quiz.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String in ="";
		ArrayList<String[]> quiz = new ArrayList<>();
		while((in=br.readLine()) != null)
		{
			quiz.add(in.split("\t"));
		}
		
		br.close();
		fr.close();
		
		return quiz;
	}
	
	public ArrayList<String[]> getUser() throws Exception
	{
		File f = new File("user.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String[]> user = new ArrayList<>();
		
		String in = "";
		while((in=br.readLine()) != null)
		{
			user.add(in.split("\t"));
		}
		
		br.close();
		fr.close();
		
		return user;
	}
	
	public void updateUser(ArrayList<String[]> ar) throws Exception
	{
		File f = new File("user.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		for (String[] strings : ar) {
			for (int i = 0; i < strings.length; i++) {
				if(i ==strings.length-1)
				{
					bw.write(strings[i]);
					bw.newLine();
				}
				else
				{
					bw.write(strings[i]+"\t");					
				}
			}
		}
		
		
		bw.close();
		fw.close();
	}
	
}
