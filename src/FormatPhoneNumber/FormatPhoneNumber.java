package FormatPhoneNumber;

public class FormatPhoneNumber {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		String phoneNumber = createPhoneNumber(numbers);
		System.out.println("phoneNumber: " + phoneNumber);
	}

	public static String createPhoneNumber(int[] numbers) {
		StringBuilder phoneNumber = new StringBuilder();
		phoneNumber.append("(");
		for (int i=0;i<numbers.length;i++) {
			phoneNumber.append(numbers[i]);
			if (i == 2) {
				phoneNumber.append(") ");
			} else if (i == 5) {
				phoneNumber.append("-");
			}
			
		}
		return phoneNumber.toString();
	}

}
