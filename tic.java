import java.io.*;
import java.util.*;
class tic
{
	public static void main(String args[])throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("TIC-TAC-TOE");
		System.out.println("Choose a cell numbered from 1  to 9 as below and play");
		System.out.println("1|2|3");
		System.out.println("-+-+-");
		System.out.println("4|5|6");
		System.out.println("-+-+-");
		System.out.println("7|8|9");
		
		char c[][]={{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '}};
	    /*for(int i=0;i<5;i++)
	    {
	    	for(int j=0;j<5;j++)
	    	{
	    		System.out.print(c[i][j]);
	    	}
	    	System.out.println("");
	    }*/
	    System.out.println("Player 1 sign is X");
	    System.out.println("Player 2 sign is O");
	    int count=0;
        while(count<=9)
	    {
          
          System.out.println("Player 1:Enter your choice");
          int uchoice=Integer.parseInt(br.readLine());
          System.out.println("Player 1:has put a X in cell  "+uchoice);
          put(c,uchoice,'X');
          count++;
          boolean ch=check(c,'X');
          if(ch==true)
          {
          	System.out.println("Player 1 has won :-)");
          	break;
          }
          if(count==9)
           {
	    	  System.out.println("Its a tie");
	    	  break;
	       }
          System.out.println("Player 2:Enter your choice");
          int cchoice=Integer.parseInt(br.readLine());
          System.out.println("Player 2: has put a O in cell  "+cchoice);
          put(c,cchoice,'O');
          count++;
          boolean chh=check(c,'O');
          if(chh==true)
          {
          	System.out.println("Player 2 has won :-)");
          	break;
          }
	    }
	 }   
	public static void put(char c[][],int ch,char sign)//putting values in particular cells
	{
		switch(ch)
		{
			case 1:
			 c[0][0]=sign;
			 break;
			 case 2:
			 c[0][2]=sign;
			 break;
			 case 3:
			 c[0][4]=sign;
			 break;
			 case 4:
			 c[2][0]=sign;
			 break;
			 case 5:
			 c[2][2]=sign;
			 break;
			 case 6:
			 c[2][4]=sign;
			 break;
			 case 7:
			 c[4][0]=sign;
			 break;
			 case 8:
			 c[4][2]=sign;
			 break;
			 case 9:
			 c[4][4]=sign;

		}
		for(int i=0;i<5;i++)
	    {
	    	for(int j=0;j<5;j++)
	    	{
	    		System.out.print(c[i][j]);
	    	}
	    	System.out.println("");
	    }
	}

	static boolean check(char c[][],char sign)//checking wining conditions
	{
		if(c[0][0]!=' ' && c[0][0]==sign && c[0][2]!=' ' && c[0][2]==sign && c[0][4]!=' ' && c[0][4]==sign)
	    return true;
        else if(c[2][0]!=' ' && c[2][0]==sign && c[2][2]!=' ' && c[2][2]==sign && c[2][4]!=' ' && c[2][4]==sign)
	    return true;
	    else if(c[4][0]!=' ' && c[4][0]==sign && c[4][2]!=' ' && c[4][2]==sign && c[4][4]!=' ' && c[4][4]==sign)
	    return true;
        else if(c[0][0]!=' ' && c[0][0]==sign && c[2][0]!=' ' && c[2][0]==sign && c[4][0]!=' ' && c[4][0]==sign)
	    return true;
	    else if(c[0][2]!=' ' && c[0][2]==sign && c[2][2]!=' ' && c[2][2]==sign && c[4][2]!=' ' && c[4][2]==sign)
	    return true;
	    else if(c[0][4]!=' ' && c[0][4]==sign && c[2][4]!=' ' && c[2][4]==sign && c[4][4]!=' ' && c[4][4]==sign)
	    return true;
	    else if(c[0][0]!=' ' && c[0][0]==sign && c[2][2]!=' ' && c[2][2]==sign && c[4][4]!=' ' && c[4][4]==sign)
	    return true;
	    else if(c[0][4]!=' ' && c[0][4]==sign && c[2][2]!=' ' && c[2][2]==sign && c[4][0]!=' ' && c[4][0]==sign)
	    return true;
	return false;
//for more easy condition refer to the Hitesh choudhary video on youtube
    }

}
