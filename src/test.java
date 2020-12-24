
public class test {
	public static void main(String[] args) {
		System.out.println("123");
	}

	class Test {
		private int testNumber;
		private String testString;

		Test(int testNumber, String testString) {
			this.testNumber = testNumber;
			this.testString = testString;
		}

		public int getTestNumber() {
			return testNumber;
		}

		public void setTestNumber(int testNumber) {
			this.testNumber = testNumber;
		}

		public String getTestString() {
			return testString;
		}

		public void setTestString(String testString) {
			this.testString = testString;
		}

	}
}