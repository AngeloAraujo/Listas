package ListaPessoa;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {


		ListadePessoas l = new ListadePessoas();
		
		GregorianCalendar cal = new GregorianCalendar(1999,Calendar.DECEMBER,12);
		Date datanascimento = cal.getTime();
		
		Pessoa p = new Pessoa("Angelo", "angelo@gmail", datanascimento);
		
		l.add(p);
		
		cal = new GregorianCalendar(1998,Calendar.OCTOBER,12);
		datanascimento = cal.getTime(); 
		
		p = new Pessoa("Tereza", "tereza@gmail.com",datanascimento);
		l.add(p);
		
		List<Pessoa> lista = l.getLista();

		
		//não adiciona (mesmo nome)
		p = new Pessoa("Angelo", "angelo2@gmail.com", datanascimento);
			
		System.out.println(l.add(p));
		l.add(p);
				
				
		//não adiciona (nome < 3 letras)
		p = new Pessoa("aa", "aa@gmail.com", datanascimento);
			
		System.out.println(l.add(p));
		l.add(p);
				
		System.out.println();
								
		//pesquisa por idade
		System.out.println("Busca por idade superior: ");
		System.out.println(l.pesquisaIdade(20));
		System.out.println();
				
		//pesquisa por mes de aniversario
		System.out.println("Aniversario por mês: ");
		System.out.println(l.pesquisaMes(10));
		System.out.println();
				
		//Lista com pessoas
		System.out.println("Lista Inicial:");
		for(Pessoa item : lista) {
			System.out.println(item.toString());
		}
				
		//removendo uma pessoa da lista por nome
		l.removeNome("Angelo");
		
		System.out.println("Lista Atualizada");
		for(Pessoa item : lista) {
			System.out.println(item.toString());
		}
				
		//editar pessoa
		cal = new GregorianCalendar(2005,Calendar.JANUARY,2);
		datanascimento = cal.getTime();
		l.alteraPessoa(1, "Tereza", datanascimento, "tereza@yahoo.com");
				
		//buscar dominios
		System.out.println(l.pesquisaDominios());
				
		/*List<Pessoa> lista1 = l.getLista();
		 System.out.println();*/
				
		for (Pessoa item : lista) {
			System.out.println(item.toString());
			}
		
	}

}
