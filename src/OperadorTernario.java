
public class OperadorTernario {

	public static void main(String[] args) {
		int n1,n2, soma;
		n1=50;
		n2=22;
		soma=n1<n2?n1:n2;
		System.out.println(soma);
		//10>8?System.out.println("true"):System.out.println("false");-Operador Tenario sempre precisa retornar o valor
		boolean condicao=7>8?true:false;
		System.out.println(condicao);
		soma=(n1>n2)?n1+n2:n1-n2;
		System.out.println(soma);
				

	}

}
