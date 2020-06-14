package WrapperClass;

public class WrapperJava {

	public static void main(String[] args) {

		String x = "100";
		int j = 200;
		System.out.println("----String to int------ ");
		System.out.println(x + 20);
		// Data Conversion : String > int

		int i = Integer.parseInt(x);

		System.out.println(i + 20);

		// int to String

		System.out.println("----int to String ----- ");

		System.out.println(j);

		String s = String.valueOf(j);
		System.out.println(s + 20);

	}

}
