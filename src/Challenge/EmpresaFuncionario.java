package Challenge;

public class EmpresaFuncionario {
	//Atributos da classe EmpresaFuncionario
	private int idEmpresaFuncionario;
    private int idEmpresa;
    private int idFuncionario;

    //Construtor parametrizado de EmpresaFuncionario
    public EmpresaFuncionario(int idEmpresaFuncionario, int idEmpresa, int idFuncionario) {
        this.idEmpresaFuncionario = idEmpresaFuncionario;
        this.idEmpresa = idEmpresa;
        this.idFuncionario = idFuncionario;
    }

    //Getters e Setters
	public int getIdEmpresaFuncionario() {
		return idEmpresaFuncionario;
	}

	public void setIdEmpresaFuncionario(int idEmpresaFuncionario) {
		this.idEmpresaFuncionario = idEmpresaFuncionario;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
}
