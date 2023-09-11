package Challenge;

public class Empresa {
	//Atributos da classe Apólice
	private int idEmpresa;
    private String nomeEmpresa;
    private long telefoneEmpresa;
    
    //Construtor parametrizado de Empresa
	public Empresa(int idEmpresa, String nomeEmpresa, long telefoneEmpresa) {
		this.idEmpresa = idEmpresa;
		this.nomeEmpresa = nomeEmpresa;
		this.telefoneEmpresa = telefoneEmpresa;
	}
	
	//Getters e Setters
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public long getTelefoneEmpresa() {
		return telefoneEmpresa;
	}
	public void setTelefoneEmpresa(long telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}
    
    
}
