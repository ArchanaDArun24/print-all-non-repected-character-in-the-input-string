package String;
import java.util.*;

public class AllNonReapectedCharInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		x=x.replace(" ", "");
		x=x.toUpperCase();
		int size=x.length();
		char y[]=x.toCharArray();
		int i=0;
		Map<Character,Integer> map=new LinkedHashMap<>();
		while(i!=size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int oldval=map.get(y[i]);
				int newval=oldval+1;
				map.put(y[i],newval);
			}
			++i;
		}
		int count=0;
		Set<Map.Entry<Character,Integer>> lmap=map.entrySet();
		for(Map.Entry<Character,Integer>data:lmap)
		{
			if(data.getValue()==1)
			{
				System.out.println(data.getKey()+"\t");
				count++;
			}
		}
		
		System.out.println(count);
	}

}
