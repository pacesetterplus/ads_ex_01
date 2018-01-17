
public class MyTest {

	public static void main(String[] args) {
		StringList l = new StringList();
		l.addFront("Yusuf");
		l.addFront("Ubaid");
		l.addFront("Zahra");
		l.addFront("Mike");
		l.addFront("Iyabo");
		l.addFront("Dave");
		l.addFront("Keshi");
		l.addFront("Yusuf");
		l.addFront("Olaiya");
		l.addFront("Barrister");
		l.replace("Yusuf", "Razak");
		System.out.print(l.toString());

		l.reverse();
		System.out.print(l.toString());

	}

}
