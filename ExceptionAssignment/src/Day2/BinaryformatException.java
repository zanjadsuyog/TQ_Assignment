package Day2;

public class BinaryformatException {

	public static void main(String[] args) {

		public class BinaryFormatException extends Exception {
			public BinaryFormatException(String message) {
				super(message);
			}
		}
		
		public static int binaryToDecimal(String binaryString) throws BinaryFormatException {
			for (char c : binaryString.toCharArray()) {
				if (c != '0' && c != '1') {
					throw new BinaryFormatException("Invalid binary string: " + binaryString);
				}
			}

			int decimalNumber = 0;
			int power = 0;

			for (int i = binaryString.length() - 1; i >= 0; i--) {
				int bit = binaryString.charAt(i) - '0';
				decimalNumber += bit * Math.pow(2, power);
				power++;
			}

			return decimalNumber;
		}

		public class Main {
			public static void main(String[] args) {
				String binaryString = "1012";

				try {
					int decimalNumber = binaryToDecimal(binaryString);
					System.out.println("Decimal equivalent of " + binaryString + " is " + decimalNumber);
				} catch (BinaryFormatException e) {
					System.out.println(e.getMessage());
				}
			}

			
		}
	}
}
