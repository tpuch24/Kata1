package kata;
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
/**
 * Add:
 * 
 * @param numbers
 * @return
 */
	public int add(String numbers){
		
		int res=0;
		String localRegex=",|\\n";
		
		if (numbers.length()==0) return 0;
		//To found new regex
		//Look for // in firsts positions
		StringBuffer stringBuffer = new StringBuffer(numbers);

		if (numbers.indexOf("//")==0)
		{
			if  (numbers.indexOf("\n")==3) {
				localRegex = stringBuffer.substring(2, 3);
				numbers = stringBuffer.substring(4,numbers.length());
			}
		}
	
		String[] retval = numbers.split(localRegex);
		for(String str: retval)
		{
			int nextValue = Integer.parseInt(str);

			if ((nextValue>=0)&&(nextValue<=1000)) res+= nextValue;
		}
		return res;
	}

}
