package FormatPhoneNumber;

public class formatPhoneNumberBetter {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		String phoneNumber = createPhoneNumber(numbers);
		System.out.println("phoneNumber: " + phoneNumber);
	}

	public static String createPhoneNumber(int[] numbers) {
		return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
	}
}
