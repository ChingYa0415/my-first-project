
public class test {

	public static void main(String[] args) {
		System.out.println("123");
		Test test = new Test(1, "Test Number One");
		test.setTestNumber(2);
		test.setTestString("Test Number Two");
		test.setTestNumber(3);
		test.setTestString("Test Number Three");
		test.setTestNumber(4);
		test.setTestString("Test Number Four");
	}

	static class Test {
		private int testNumber;
		private String testString;

		Test(int testNumber, String testString) {
			this.testNumber = testNumber;
			this.testString = testString;
		}

		public void etxtendMethod() {
			System.out.println("新增這個方法，測試分支合併");
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

	class Validation {
		private int testNumber;

		public Validation(int testNumber) {
			super();
			this.testNumber = testNumber;
		}

		public int getTestNumber() {
			return testNumber;
		}

		public void setTestNumber(int testNumber) {
			this.testNumber = testNumber;
		}
	}

	class DifferentRow {
		private int testNumber;

		public DifferentRow(int testNumber) {
			super();
			this.testNumber = testNumber;
		}

		public int getTestNumber() {
			return testNumber;
		}

		public void setTestNumber(int testNumber) {
			this.testNumber = testNumber;
		}
	}
}