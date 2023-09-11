package Challenge;

public class Marca {

	private int idMarca;
    private String marcaVeiculo;
	public Marca(int idMarca, String marcaVeiculo) {
		this.idMarca = idMarca;
		this.marcaVeiculo = marcaVeiculo;
	}
	public int getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}
	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}
	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}

}
