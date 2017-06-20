package Onlinetest;
import java.util.*;
import java.io.*;
public class Startexamoption 
{
    public void examQuestions() throws IOException , FileNotFoundException
	{
		Scanner s = new Scanner(System.in);
		FileInputStream fin = new FileInputStream("questions.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fin));
		LineNumberReader  lnr = new LineNumberReader(new FileReader(new File("questions.txt")));
		FileInputStream finn = new FileInputStream("answers.txt");
		BufferedReader brr = new BufferedReader(new InputStreamReader(finn));
		String ansLine = null;
		String []words = new String[50];
		try
		{
			while((ansLine = brr.readLine()) != null)
			{
				 words = ansLine.split(" ");
			}
			int k = words.length;
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
        lnr.skip(Long.MAX_VALUE);
        int count = lnr.getLineNumber()+1; 
		lnr.close();
		String line = null;
		int j=0,counter =-1;
		LineNumberReader  lnrr = new LineNumberReader(new FileReader(new File("questions.txt")));
        lnrr.skip(Long.MAX_VALUE);
        int count1 = lnrr.getLineNumber()+1; 
		lnrr.close();
		int noOfQuestions = 20;
		String []finalAns = new String[noOfQuestions];
		int round=1;
		
		try
		{	
		while(round<=noOfQuestions){
			
			for(int i=0;i<5;i++){
				line=br.readLine();
				if(line!=null)
					System.out.println(line);

				}
				
				 counter++;
				 System.out.println("\n");
				 System.out.println("Enter your option");
			    finalAns[counter] = s.nextLine();
			    CLS.clsc();
			    round++;
			}
		}
		catch(Exception e)
		{
			
		}
		int finals = finalAns.length ;
		int score = 0;
		for(int i=0;i<20;i++)
		{
			if(words[i].equals(finalAns[i]))
			{
				score = score + 5;
			}
			else
			{
				score = score -2;
			}
		}
		
		System.out.println("Exam Key:-");
		for(int i=0;i<20;i++)
		{
			System.out.print(words[i] + "\t");
		}
		System.out.println("\n");
		System.out.println("Your Answers:-");
		for(int i=0;i<20;i++)
		{
			System.out.print(finalAns[i] + "\t");
		}
		System.out.println("\n");
		System.out.println("Your Online Exam Score is :" + score);
	}
}