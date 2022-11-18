package ListaPessoa;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {

	private String nome;
	private String email;
	private Date datanascimento;

	
	public Pessoa(String nome, String email, Date datanascimento) {
		
		this.nome = nome;
		this.email = email;
		this.datanascimento = datanascimento;
	}


	public Date getDatanascimento() {
		return datanascimento;
	}


	public void setDatanascimento(Date datanascimento) {
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

	public int calcularIdade() {
		Date data = new Date();
		return data.getYear()-datanascimento.getYear();
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
		builder.append(", calcularIdade()=");
		builder.append(calcularIdade());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	}
	
	

