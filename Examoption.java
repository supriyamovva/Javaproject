package Onlinetest;
import java.util.*;
import java.io.*;
public class Examoption 
{
    public void writeExam() throws IOException , FileNotFoundException
	{
	try
	{

		Studentoption s = new Studentoption();
		int ln = s.studentWork();
		if(ln == 1)
		{
			
			CLS.clsc();
			System.out.println("\t\tYou've succesfully loggedin.Begin your Exam!!");
			System.out.println("\n");
			Startexamoption x = new Startexamoption();
			x.examQuestions();

		}
		else
		{
			System.out.println("Invalid Username or Password.Enter Again");
			Examoption p = new Examoption();
	 		p.writeExam();
		}
	}
	catch(Exception e)
	{
		System.out.println("Exception occured");
	}
	}
}