package collections;

import java.util.ArrayList;

public class PrintingUniqueNumber 
{
		public static void main(String[] args) 
		{
			int a[]= {4,5,5,5,4,6,6,9,4};	
			
			ArrayList<Integer> al=new ArrayList<Integer>();
			
			for(int i=0; i<a.length;i++)
			{
				int count=0;
				
				if(!al.contains(a[i]))
				{
					al.add(a[i]);
					count++;
					
					for(int j=i+1;j<a.length;j++)
					{
						if(a[i]==a[j])
						{
							count++;
						}
					}
					
					System.out.println(a[i]+"="+count);
					
					if(count==1) {
					
						System.out.println(a[i]+" is a unique number.");
					}
					
					
				}
			}
			
			
						
		}

}
