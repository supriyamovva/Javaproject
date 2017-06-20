package Onlinetest;
import java.util.*;
import java.io.*;
public  class Faculty extends Rules
{
	public void rules()
	{
		System.out.println("\t\t\tINSTRUCTIONS  FOR  FACULTY");
		System.out.println("\n");
		System.out.println("\t 1) Set the questions and choices in the file with name 'questions.txt'");
		System.out.println("\n");
		System.out.println("\t 2)Set the answers in the file with name 'answers.txt'");
		System.out.println("\n");
		System.out.println("\t 3)Set the Usernames and passwords of the user who wish to write exam in\t file 'usernames.txt'");
		System.out.println("\n");
		System.out.println("\t 4)Place all these files in existing folder 'Javaproject'");
		System.out.println("\n");

	}

	 public void facultyWork(String x , String y) throws IOException,FileNotFoundException
	{ 
		Scanner s = new Scanner(System.in);
		try
		{
			String u = x;
			String pa = y;
			int yes = 1;
			int no = 0;
			String n = "no";
			String username = null;
			char []password = new char[20];
		 Console consl = System.console();
		 if(consl != null)
		 {
		 		username = consl.readLine("Admin name : ");
		 		System.out.println("\n");
				password = consl.readPassword("Admin password : ");
		}
		 String pass = new String(password);
		 int option;
		 if((u.equals(username)) && (pa.equals(pass)))
		 {
		 	Faculty f = new Faculty();
		 	f.rules();
		 	f.facultyWork();
		 	System.out.println("Have u placed all the files as mentioned above? Enter '1' for 'yes' else '0'");
		 	option = s.nextInt();
		 	if(yes == option)
		 		{
		 			System.out.println("\t\tSuccessfully Done Adding ");
		 			System.out.println("\n");
		 			System.out.println("\t\tAll the Usernames and passwords are set!");
		 			System.out.println("\n");
		 			System.out.println("\t\tAll the questions are set!");
		 			System.out.println("\n");
		 			System.out.println("\t\tStudents are now permitted to write the Exam!");
		 			System.out.println("\n");
		 			CLS.clsc();
		 			System.out.println("\tNow students can begin the Exam");
					System.out.println("\n");
		 			Studentoption st = new Studentoption();
	 				st.rules();
	 				Examoption p = new Examoption();
	 				p.writeExam();
		 		} 
		 	else if(no == option)
		 	{
		 		Faculty f1 = new Faculty();
		 		f1.rules();
		 	}
		 	else
		 	{
		 		System.out.println("Invalid entry");
		 	}
		 }
		 else
		 {
		 	System.out.println("Invalid Username or password,Enter again");
			Faculty f2 = new Faculty();
		 	f2.facultyWork("faculty","amma");

		 }
		
		}
	catch(Exception e)
	{

	}
	}
public static void facultyWork() throws IOException , FileNotFoundException
{
	BufferedReader  b = new BufferedReader(new InputStreamReader(System.in));
	Scanner s = new Scanner(System.in);
	System.out.println("Give no of questions you want to add in the file");
	int q = s.nextInt();
	try{
					CLS.clsc();
				}
				catch(Exception e)
				{
				}
	System.out.println("How many users do u want to add?");
	int no = s.nextInt();
	System.out.println("Add usernames and Passwords for the users seperated by comma:");
	try{
	
    		File file =new File("usernames.txt");
    		if(!file.exists())
    		{
    			file.createNewFile();
    		}
    		FileWriter fileWritter = new FileWriter(file.getName(),true);
    	    BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
    	    for(int i=0;i<no;i++)
    	    {
    	    String data = b.readLine();
    	    bufferWritter.newLine();
    	    bufferWritter.write(data);
    		}
    	    bufferWritter.close();
			System.out.println("Done");

    	}
    	catch(IOException e)
    	{
    		
    	}

}
}
