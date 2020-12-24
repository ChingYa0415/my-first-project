
public class test {
	public static void main(String[] args) {
		System.out.println("123");
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
}