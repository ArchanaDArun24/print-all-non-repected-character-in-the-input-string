package String;
import java.util.*;
public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		x=x.replace(" ", "");
		x=x.toUpperCase();
		char y[]=x.toCharArray();
		int size=y.length;
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
				map.put(y[i], newval);
			}
			++i;
		}
		Set<Map.Entry<Character, Integer>> hmap=map.entrySet();
		for(Map.Entry<Character, Integer> data:hmap)
		{
			if(data.getValue()==1)
			{
				System.out.println(data.getKey());
				System.exit(0);
			}
		}
	}

}
