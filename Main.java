package ListaPessoa;

import java.util.List;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {


		ListadePessoas l = new ListadePessoas();
		
		LocalDate datanascimento = LocalDate.parse("2005-05-03");
		
		Pessoa p = new Pessoa("Angelo", "angelo@gmail", datanascimento);
		
		l.add(p);
		
		p = new Pessoa("Tereza", "tereza@gmail.com",datanascimento);
		l.add(p);
		
		List<Pessoa> lista = l.getLista();

		for(Pessoa item : lista) {
			System.out.println(item.toString());
		}
	}

}
