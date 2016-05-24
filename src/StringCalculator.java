/**
 * 
 * @author Thierry
 *
 * Class
 */
public class StringCalculator {

	public StringCalculator() {
		super();

	}

	public int add(String numbers){
		
		int res=0;
		
		if (numbers.length()==0) return 0;
		
		String[] retval = numbers.split(",");
		for(String str: retval)
		{
			res+= Integer.parseInt(str);
		}
		return res;
	}
}
