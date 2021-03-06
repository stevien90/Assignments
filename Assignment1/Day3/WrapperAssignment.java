package Day3;

public class WrapperAssignment {

	public static void main(String[] args) {
		//Float
		System.out.println("--------------FLOAT-------------");
		Float d = 77f;
		Float d1 = 77f;
		Float d2 = new Float(88d);
		
		System.out.println("d == d2: "+(d==d2)); //false ???? why is it different = memory too large so it point to different memoy
		System.out.println("d == d1: "+(d==d1));//false 
		System.out.println("d value = d2: " + (d.equals(d2)));//True
		System.out.println("d value = d1: " + (d.equals(d)));//True
		
		System.out.println(System.identityHashCode(d)); // 604107971
		System.out.println(System.identityHashCode(d1));//123961122 ?? why is it different = memory too large
		System.out.println(System.identityHashCode(d2));//1227229563 ?? why is it different = memory too large
		
		float x = d;
		System.out.println("d value is now a primitive");
		d = x;
		System.out.println("d value back to Object");

		String age ="30";
		Float a = Float.parseFloat(age); // string to float
		System.out.println(a);
		
		Double f = d.doubleValue(); //declaring Double Obj f to have value of d (77)
		
		System.out.println(d.compareTo(88f));// negative value
		System.out.println(d.compareTo(77f));// 0
		System.out.println(d.compareTo(23f));// positive value
		
		//Double
		System.out.println("\n" + "----------Double--------------");
		Double hair = 12d;
		Double grade = 12d;
		Double fingers= new Double(12d);
		
		double xx = hair;//obj to prim
		hair = xx;// primitive to obj
		Double ss = Double.parseDouble(age); // string to double
		
		Long ll = hair.longValue(); // declaring long ll to convert value of double 77 to long
		
		System.out.println(fingers.compareTo(10d));// positive value
		System.out.println(fingers.compareTo(12d));// 0
		System.out.println(fingers.compareTo(20d));// negative value
		
		//Long
		System.out.println("\n " + "--------Long-----------");
		Long eye = 2l;
		Long feet =3l;
		Long nose =2l;
		
		System.out.println("nose = feet :" + (nose==feet)); // false
		System.out.println(System.identityHashCode(nose)); // 186997857
		System.out.println(System.identityHashCode(feet)); // 1763847188
		
		
		long lll = eye;
		eye = lll;
		Long mouth = Long.parseLong(age);
		
		Double ddd = nose.doubleValue();
		
		System.out.println(feet.compareTo(mouth));// -1
		System.out.println(mouth.compareTo(eye));// 1
		System.out.println(eye.compareTo(feet));// -1
		
		
		
		
		
	}

}
