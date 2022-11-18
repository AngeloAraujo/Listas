package ListaPessoa;

import java.util.ArrayList;
import java.util.List;

public class ListadePessoas {

	private List<Pessoa> lista = new ArrayList<Pessoa>();
	
	
	public List<Pessoa> getLista() {
		return lista;
	}



	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}


	//criar um método mostrar dominio = mostrar somente os dominios cadastrados
	//criar o método de exclusão pelo nome
	//não permitir nomes iguais ou com menos de 3 letras ok
	// Alterar pessoa
	//fazer uma busca usando 'like' inicial do nome
	// mostrar idade ok
	// buscar idade superior?
	//aniversariantes do mês?
	
	public boolean add (Pessoa pessoa) {
		//somente add se o nome dele for diferente aos nomes que estão na lista
		lista.add(pessoa);
		return true;
	}
	
	
	
}
