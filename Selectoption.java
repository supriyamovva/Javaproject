package Onlinetest;
import java.util.*;
import java.io.*;                                                                                                                                             
public  class Selectoption implements Examination
{
	public void enterDetails()
	 {
	 	Scanner ln = new Scanner(System.in);
	 	int option;
	 	System.out.println("\t\t\t\t 1.FACULTY");
	 	System.out.println("\n");
	 	System.out.println("\t\t\t\t 2.STUDENT");
	 	System.out.println("\n");
	 	System.out.println("Enter your option:");
	 	option = ln.nextInt();
	 	try{
	 	switch(option)
	 	{
	 		case 1 :CLS.clsc();
	 				System.out.println("Enter your username and password to set Questions:");
	 				System.out.println("\n");
	 				Faculty fa = new Faculty();
					fa.facultyWork("faculty","amma");
	 				break;
	 		case 2 :CLS.clsc();
	 				Studentoption s=new Studentoption();
	 				s.rules();
	 				Examoption p = new Examoption();
	 				p.writeExam();
	 				break;
	 		default:System.out.println("Invalid Entry.Enter again");
	 				Selectoption l = new Selectoption();
	 				l.enterDetails();
	 				break;
	 	}
	 }catch(Exception e)
	 {
	 	System.out.println("Exception");
	 }
  }
}