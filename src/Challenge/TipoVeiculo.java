package Challenge;

public class TipoVeiculo {
	//Atributos da classe TipoVeiculo
	private int idTipoVeiculo;
    private String tipoVeiculo;
    
    //Construtor parametrizado de TipoVeiculo
	public TipoVeiculo(int idTipoVeiculo, String tipoVeiculo) {
		this.idTipoVeiculo = idTipoVeiculo;
		this.tipoVeiculo = tipoVeiculo;
	}
	
	//Getters e Setters
	public int getIdTipoVeiculo() {
		return idTipoVeiculo;
	}
	public void setIdTipoVeiculo(int idTipoVeiculo) {
		this.idTipoVeiculo = idTipoVeiculo;
	}
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
}
