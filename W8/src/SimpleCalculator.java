import java.util.Scanner;
import java.util.Spliterator;

public class SimpleCalculator {

	public static void main(String[] args) throws AddZeroException,SubtractZeroException,OutOfRangeException {
		Scanner scan = new Scanner(System.in);
		String str =scan.nextLine();
		String[] splited = str.split("[\\+\\-]");
		Integer fstoperand= Integer.parseInt(splited[0]);
		Integer sndoperand = Integer.parseInt(splited[1]);
		
		if(str.contains("+")) {
			if(fstoperand == 0 || sndoperand ==0) {
				throw new AddZeroException();
			}
			int result = fstoperand+sndoperand;
			if(fstoperand<0 || fstoperand>1000||sndoperand<0||sndoperand>1000||result<0||result>1000) {
				throw new OutOfRangeException();
			}
			System.out.println(result);
		}
		else if(str.contains("-")) {
			if(fstoperand == 0 || sndoperand ==0) {
				throw new SubtractZeroException();
			}
			int result2 = fstoperand - sndoperand;
			if(fstoperand<0 || fstoperand>1000||sndoperand<0||sndoperand>1000||result2<0||result2>1000) {
				throw new OutOfRangeException();
			}
			System.out.println(result2);
		}
		
	}
	
}

class OutOfRangeException extends Exception{
	public OutOfRangeException() {
		System.out.println("OutOfRangeException");
	}
}
class AddZeroException extends Exception{
	public AddZeroException() {
		System.out.println("AddZeroException");
	}
}
class SubtractZeroException extends Exception{
	public SubtractZeroException() {
		System.out.println("SubtractZeroException");
	}
}
