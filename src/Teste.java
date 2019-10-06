import java.util.LinkedList;

public class Teste {

	public static void main(String[] args) {

		Aluno maria = new Aluno();
		maria.setNome("Maria");
		
		Aluno manoel = new Aluno();
		manoel.setNome("Manoel");
		
		Aluno joaquim = new Aluno();
		joaquim.setNome("Joaquim");
		
		LinkedList listaLigada = new LinkedList();
		
		listaLigada.add(maria);
		listaLigada.add(manoel);
		listaLigada.add(1, joaquim);
		
		for (int i = 0; i < listaLigada.size(); i++) {
		System.out.println(listaLigada.get(i));
		}
	}
}