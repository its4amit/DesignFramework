package practice;

import java.math.BigInteger;

public class BigNumbersCalculation {

	public static void main(String[] args) {
		
		BigInteger b= new BigInteger("67546756532784322835367532645367546732548532432674356735432568453865635");
		BigInteger b1= new BigInteger("7632486325367835237835723465438967456397813564731923786439275643676913767435");
		
	BigInteger c=	b.add(b1);
		System.out.println("Addition is::::" + c);	
	}
//	 Output is Addition is::::7632553872124368022158558832971612823944546113264356460796011076245367633070
	
	
}
