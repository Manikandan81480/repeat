package ivtl;
import java.util.*;
public class repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int i=0,j=0,p1=0,p2=0,k=0,c=0;
		int n=o.nextInt();
		int x[]=new int[n];
		for(i=0;i<n;i++)
		{
			x[i]=o.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(x[i]==x[j])
				{
					if(k==1)
					{
						p2=p1;
						c=1;
						
					}
					p1=j;
					k=1;
					if(c==1&&k==1)
					{
						if(p1<p2)
						{
							System.out.println(x[p1]);
						i=n;
						break;
						}
						else
						{  
							System.out.println(x[p2]);
						i=n;
						break;
						}		
					}
					
				}
			}
			
		}
	}
}
