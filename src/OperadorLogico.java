
public class OperadorLogico {

	public static void main(String[] args) {
		/**System.out.println("operador and &&");
		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println("operador or ||");
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println(false || false);
		System.out.println(false || true);*/
		
		int x,y,z;
		x=4;
		y=7;
		z=12;
		boolean r;
		r=(x<y ^ y>z)?true:false;
		System.out.println(r);
	}

}
