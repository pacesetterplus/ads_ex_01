
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
		l2.addFront("Yus");
		l2.addFront("Uba");
		l2.addFront("Za");
		l2.addFront("Mi");
		
		l.append(l2);
	
		System.out.print(l);

	

	}

}
