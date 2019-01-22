
public class TestClass {

	private static TestClass uniqueInstance;

	public static synchronized TestClass getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new TestClass();
		}
		return uniqueInstance;
	}

	public void getMessage() {
		System.out.println("Hello World!");
	}

}
