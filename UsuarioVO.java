package Model.VO;

public class UsuarioVO {

	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private String nomeUsuario;
	private String senha;
	private String grauEscola;

	public UsuarioVO(String nome, String sobrenome, String datanasc, String nomeUsuario, String senha,
			String grauEscola) {

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = datanasc;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.grauEscola = grauEscola;

	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * @param sobrenome the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * @return the dataNascimento
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the nomeUsuario
	 */
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	/**
	 * @param nomeUsuario the nomeUsuario to set
	 */
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the grauEscola
	 */
	public String getGrauEscola() {
		return grauEscola;
	}

	/**
	 * @param grauEscola the grauEscola to set
	 */
	public void setGrauEscola(String grauEscola) {
		this.grauEscola = grauEscola;
	}

}