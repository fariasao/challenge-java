package Challenge;

public class ClienteApolice {

	private int idCliente;
    private int idApolice;
	public ClienteApolice(int idCliente, int idApolice) {
		this.idCliente = idCliente;
		this.idApolice = idApolice;
	}
	
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
