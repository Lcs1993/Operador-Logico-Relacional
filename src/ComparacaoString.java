
public class ComparacaoString {

	public static void main(String[] args) {
		String nome1="Gustavo";
		String nome2="Gustavo";
		String nome3=new String("Gustavo");
		String resultado=nome1==nome3?"igual":"diferente";
		System.out.println(resultado);
		 resultado=nome1.equals(nome3)?"igual":"diferente";
		 System.out.println(resultado);
	}

}
