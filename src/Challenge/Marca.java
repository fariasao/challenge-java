package Challenge;

public class Marca {
	//Atributos da classe Marca
	private int idMarca;
    private String marcaVeiculo;
    
    //Construtor parametrizado de Marca
	public Marca(int idMarca, String marcaVeiculo) {
		this.idMarca = idMarca;
		this.marcaVeiculo = marcaVeiculo;
	}
	
	//Getters e Setters
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
