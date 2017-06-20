package Onlinetest;
import java.util.*;
import java.io.*;
public class Studentoption extends Rules
{
	public void rules(){
		System.out.println("\t\t\tINSTRUCTIONS  FOR  STUDENTS");
		System.out.println("\n");
		System.out.println("\t1) Each question carries 5 marks");
		System.out.println("\n");
		System.out.println("\t2) Each wrong answer deducts 2 marks");
		System.out.println("\n");
		System.out.println("\t3) Copying is strictly prohibited");
		System.out.println("\n");
		System.out.println("\t4) Password sharing leads to the cancellation of your exam");
		System.out.println("\n");
		System.out.println("\t5) Enter your Username and Password to begin the exam");
		System.out.println("\n");

	}
    public int studentWork() throws IOException , FileNotFoundException
	{	
	Console cnsl = System.console();
    String alpha = null;
   	int getNumber=0;
    char []pwd = new char[20];
		if (cnsl != null) 
		{
            alpha = cnsl.readLine("Username: ");
            System.out.println("\n");
            pwd = cnsl.readPassword("Password: ");
        } 
        String beta = new String(pwd);
     	FileInputStream fin = new FileInputStream("usernames.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fin));
		LineNumberReader  lnr = new LineNumberReader(new FileReader(new File("usernames.txt")));
        lnr.skip(Long.MAX_VALUE);
        int count = lnr.getLineNumber()+1; 
		lnr.close();
		String line = null;
		int i=0;
		String []user = new String[count];
		String []pass = new String[count]; 
		try
		{
			for(int m =0 ;m<count;m++)
			{
			while((line = br.readLine()) != null)
			{
				String[] words = line.split(",");
					user[i] = words[0];
					pass[i] = words[1];
					i++;
		    }
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured");
		}
	for(int j =0;j<user.length;j++)
	{
		   if((user[j].equals(alpha)) && (pass[j].equals(beta)))
		   {
		   	getNumber = 1;
		   	break;
		   }
		   else
		   {
		   	continue;
		   }
	}
	fin.close();
	return getNumber;
	}
}