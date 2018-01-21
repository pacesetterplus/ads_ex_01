
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
		
		
		StringList l2 = new StringList();
		l2.addFront("Yusuf");
		l2.addFront("Ubaid");
		l2.addFront("Zahra");
		l2.addFront("Mike");
		
		l.append(l2);
	
		System.out.print(l);

	

	}

}
