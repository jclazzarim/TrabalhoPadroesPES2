public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;

	public Cliente(final String nome, final String sobrenome, final String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + " Sobrenome: " + getSobrenome() + " CPF: " + getCpf();
	}
}
