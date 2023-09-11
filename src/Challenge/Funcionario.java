package Challenge;

public class Funcionario {

	private int idFuncionario;
    private String nomeFuncionario;
    private long telefoneFuncionario;
	public Funcionario(int idFuncionario, String nomeFuncionario, long telefoneFuncionario) {
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.telefoneFuncionario = telefoneFuncionario;
	}
	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public long getTelefoneFuncionario() {
		return telefoneFuncionario;
	}
	public void setTelefoneFuncionario(long telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}
}
