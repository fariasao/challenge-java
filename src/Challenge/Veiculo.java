package Challenge;

public class Veiculo {

	private int idVeiculo;
    private int idMarca;
    private int idTipoVeiculo;
    private int idModelo;
    private char chassiAlongado;
    
	public Veiculo(int idVeiculo, int idMarca, int idTipoVeiculo, int idModelo, char chassiAlongado) {
		this.idVeiculo = idVeiculo;
		this.idMarca = idMarca;
		this.idTipoVeiculo = idTipoVeiculo;
		this.idModelo = idModelo;
		this.chassiAlongado = chassiAlongado;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public int getIdTipoVeiculo() {
		return idTipoVeiculo;
	}

	public void setIdTipoVeiculo(int idTipoVeiculo) {
		this.idTipoVeiculo = idTipoVeiculo;
	}

	public int getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	public char getChassiAlongado() {
		return chassiAlongado;
	}

	public void setChassiAlongado(char chassiAlongado) {
		this.chassiAlongado = chassiAlongado;
	}
    
    
	public String toString() {
        return "Veiculo [ID: " + idVeiculo + ", Marca ID: " + idMarca +
               ", Tipo Veiculo ID: " + idTipoVeiculo + ", Modelo ID: " + idModelo +
               ", Chassi Alongado: " + chassiAlongado + "]";
    }
}
