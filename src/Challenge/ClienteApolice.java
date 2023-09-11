package Challenge;

public class ClienteApolice {
	//Atributos da classe ClienteApolice
	private int idCliente;
    private int idApolice;
    
    //Construtor parametrizado de ClienteApolice
	public ClienteApolice(int idCliente, int idApolice) {
		this.idCliente = idCliente;
		this.idApolice = idApolice;
	}
	
	//Getters e Setters
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdApolice() {
		return idApolice;
	}
	public void setIdApolice(int idApolice) {
		this.idApolice = idApolice;
	}
}
