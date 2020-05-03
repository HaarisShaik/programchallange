import java.util.*;

public class SentanceToPiglatin {

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String s,w="",lp,rp,nw,rs="";
		int i,l,wl,j;
		char ch;
		System.out.println("Enter the sentance: ");
		s = sc.nextLine().toUpperCase();
		s = s+" ";
		l = s.length();
		for(i=0;i<l;i++)
		{
			ch=s.charAt(i);
					if(ch  !=' ')
						w+=ch;
					else
					{
						wl = w.length();
						for(j=0;j<wl;j++)
		 				{
							ch=w.charAt(j);
							if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
								break;
						
						}
						lp=w.substring(0,j);
						rp=w.substring(j);
						nw=rp+lp+"AY";
						rs=rs+nw+" ";
						w="";
								
					}
		}
		
		rs=rs.substring(0,rs.length()-1);
		System.out.println("Resulting sentance: "+rs);
	}

}
