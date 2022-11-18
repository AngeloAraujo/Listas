package ListaPessoa;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {

	private String nome;
	private String email;
	private LocalDate datanascimento;

	
	public Pessoa(String nome, String email, LocalDate datanascimento) {
		
		this.nome = nome;
		this.email = email;
		this.datanascimento = datanascimento;
	}


	public LocalDate getDatanascimento() {
		return datanascimento;
	}


	public void setDatanascimento(LocalDate datanascimento) {
		this.datanascimento = datanascimento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		if (nome.length()>=3)
			this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		LocalDate now = LocalDate.now();
		
		int age = now.getYear() - datanascimento.getYear();
		
		if (now.getMonthValue() < datanascimento.getMonthValue() || now.getMonthValue() == datanascimento.getMonthValue() && now.getDayOfYear() < datanascimento.getDayOfYear()) {
			age--;
		}
		
		return age;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", datanascimento=");
		builder.append(datanascimento);
		builder.append(", Idade=");
		builder.append(getAge());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
