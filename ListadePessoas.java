package ListaPessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		if (pessoa.getNome().length() < 3 || pesquisaNome(pessoa)) {
			return false;
		}else {
			lista.add(pessoa);
			return true;
		}

	}
	
	public boolean pesquisaNome(Pessoa pessoat){
		
		for (Pessoa p : lista)
		{
		   if (pessoat.getNome().equalsIgnoreCase(p.getNome()))
		      return true;
		}
		return false;
		
	}
	
	public boolean buscarNome(Pessoa pessoa){
		
		for (Pessoa p : lista)
		{
		   if (pessoa.getNome() == p.getNome())
		      return true;
		}
		return false;
	}
	
	public List<Pessoa> pesquisaIdade(int idade){
		List<Pessoa> listaIdade = new ArrayList<Pessoa>();
		
		for (Pessoa p : lista){
		   if (p.calcularIdade()>idade) {
			   listaIdade.add(p);
		   }
		}
		
		return listaIdade;	
	}
	@SuppressWarnings("deprecation")
	public List<Pessoa> pesquisaMes(int mes){
		List<Pessoa> listaMes = new ArrayList<Pessoa>();
		
		for (Pessoa p : lista){
		   if (p.getDatanascimento().getMonth()==(mes-1)) {
			   listaMes.add(p);
		   }
		}
		
		return listaMes;
	}
	
	public void removeNome(String nome) {	
		this.lista.removeIf(pessoa -> pessoa.getNome().equalsIgnoreCase(nome));
	}
	
	public void alteraPessoa(int id, String nome, java.util.Date aniversario, String email) {		
		lista.get(id).setNome(nome);
		lista.get(id).setDatanascimento(aniversario);
		lista.get(id).setEmail(email);
	}
	
	public ArrayList<String> pesquisaDominios() {

		ArrayList<String> dominios = new ArrayList<String>();
		
		for (Pessoa p : lista){
			
			  String split[] = p.getEmail().split("@");
			  
			  if (!dominios.contains(split[1])){
				  dominios.add(split[1]);
			  }
	
		}
		return dominios;
	}
	
	
	
}
