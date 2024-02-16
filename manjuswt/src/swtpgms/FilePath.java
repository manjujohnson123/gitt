package swtpgms;

import java.io.File;

public class FilePath {

	void checkPath()
	{
		try
		{
			String path="C:\\Files\\first1.txt";
			File file=new File(path);
					if(file.exists())
					{
					  System.out.println("File exist");	
					}
					else
					{
						System.out.println("File not exist");
					}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	int checkLoop()
	{
		int f=1;
		try
		{
			
			for(int i=1;i<=5;i++)
			{
				
				System.out.println("i is:"+i);	
				f=f*i;
				System.out.println("f is:"+f);	
			}
			System.out.println("fact is:"+f);	
			
			 	
					 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return f;
	}
	void checkCondition()
	{
		try
		{
			 char ch='a';
			 switch(ch)
			 {
			 	case 'D':
			 		System.out.println("in A");
		 		break;

			 	case 'e':
			 		System.out.println("in e");
		 		break;

			 	case 'o':
			 		System.out.println("in o");
		 		break;

			 	case 'i':
			 		System.out.println("in i");
		 		break;
		 		
		 		
		 		
			 }		
			 
			 if(ch=='f')
			 {
			 	
			 		System.out.println("in a");
			 }
			 if(ch=='e')
			 {
			 	
			 		System.out.println("in e");
			 }
			 
			 if(ch=='o')
			 {
			 	
			 		System.out.println("in o");
			 }if(ch=='i')
			 {
				 	
			 		System.out.println("in i");
			 }		
			 
			 //---------------------------------
			 
			 if(ch=='f')
			 {
			 	
			 		System.out.println("in a");
			 }
			 else if(ch=='e')
			 {
			 	
			 		System.out.println("in e");
			 }
			 
			 else if(ch=='o')
			 {
			 	
			 		System.out.println("in o");
			 }
			 else if(ch=='i')
			 {
				 	
			 		System.out.println("in i");
			 }		
			 else
			 {
				 
			 }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
		
		FilePath obj=new FilePath();
		obj.checkPath();
		int r=obj.checkLoop();	
		System.out.println("expected result:120, calculated result:"+r);
	
}
}
