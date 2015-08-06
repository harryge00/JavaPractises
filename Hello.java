import java.util.Arrays;
public class Hello {
	public static String[] starCount(String[] args) {
		String[] strarr=new String[args.length];
		int count=0;
		int n=0;
		for(int i=0;i<args.length;i++)
		{
			if(args[i].equals("star"))
				count++;
			else
				strarr[n++]=args[i];

		}
		if((count&1) ==0)
			return args;
		else
			return Arrays.copyOf(strarr,n);

	}
    public static void main(String[] args) {
		 String [] strarr1=starCount("star you you you star is star".split(" "));
		 for(int i=0;i<strarr1.length;i++)
			System.out.println(strarr1[i]);

		 String [] strarr2=starCount("Star Star is a star song by The Rolling star that appeared on their 1973 album Goats Head Soup.".split(" ")); 
		 for(int i=0;i<strarr2.length;i++)
			System.out.println(strarr2[i]);

        System.out.println("Hello world!");
    }
}
