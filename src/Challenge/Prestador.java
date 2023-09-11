package Challenge;

public class Prestador {

	private int idPrestador;
    private int idEmpresaFuncionario;
    private String localPrestador;
    private String placaGuincho;
    
	public Prestador(int idPrestador, int idEmpresaFuncionario, String localPrestador, String placaGuincho) {
		this.idPrestador = idPrestador;
		this.idEmpresaFuncionario = idEmpresaFuncionario;
		this.localPrestador = localPrestador;
		this.placaGuincho = placaGuincho;
	}

	public int getIdPrestador() {
		return idPrestador;
	}

	public void setIdPrestador(int idPrestador) {
		this.idPrestador = idPrestador;
	}

	public int getIdEmpresaFuncionario() {
		return idEmpresaFuncionario;
	}

	public void setIdEmpresaFuncionario(int idEmpresaFuncionario) {
		this.idEmpresaFuncionario = idEmpresaFuncionario;
	}

	public String getLocalPrestador() {
		return localPrestador;
	}

	public void setLocalPrestador(String localPrestador) {
		this.localPrestador = localPrestador;
	}

	public String getPlacaGuincho() {
		return placaGuincho;
	}

	public void setPlacaGuincho(String placaGuincho) {
		this.placaGuincho = placaGuincho;
	}
	
	@Override
	public String toString() {
        return "Prestador [ID: " + idPrestador + ", ID da Empresa/Funcionário: " + idEmpresaFuncionario +
               ", Local do Prestador: " + localPrestador + ", Placa do Guincho: " + placaGuincho + "]";
    }

    
}
