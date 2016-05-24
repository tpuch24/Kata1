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
		if (stringBuffer.subSequence(0, 1)=="//"){
			int firstNewlinePosition= numbers.indexOf("\n");
			if  (firstNewlinePosition>1) {
				localRegex = (String) stringBuffer.subSequence(3, 3);
			}			
		}
	
		String[] retval = numbers.split(localRegex);
		for(String str: retval)
		{
			res+= Integer.parseInt(str);
		}
		return res;
	}

}
