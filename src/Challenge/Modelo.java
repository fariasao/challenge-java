package Challenge;

public class Modelo {

	private int idModelo;
    private String modeloVeiculo;
    private double comprimentoVeiculo;
    private double alturaVeiculo;
    private int eixoVeiculo;
    private double pesoVeiculo;
    
	public Modelo(int idModelo, String modeloVeiculo, double comprimentoVeiculo, double alturaVeiculo, int eixoVeiculo,
			double pesoVeiculo) {
		this.idModelo = idModelo;
		this.modeloVeiculo = modeloVeiculo;
		this.comprimentoVeiculo = comprimentoVeiculo;
		this.alturaVeiculo = alturaVeiculo;
		this.eixoVeiculo = eixoVeiculo;
		this.pesoVeiculo = pesoVeiculo;
	}

	public int getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public double getComprimentoVeiculo() {
		return comprimentoVeiculo;
	}

	public void setComprimentoVeiculo(double comprimentoVeiculo) {
		this.comprimentoVeiculo = comprimentoVeiculo;
	}

	public double getAlturaVeiculo() {
		return alturaVeiculo;
	}

	public void setAlturaVeiculo(double alturaVeiculo) {
		this.alturaVeiculo = alturaVeiculo;
	}

	public int getEixoVeiculo() {
		return eixoVeiculo;
	}

	public void setEixoVeiculo(int eixoVeiculo) {
		this.eixoVeiculo = eixoVeiculo;
	}

	public double getPesoVeiculo() {
		return pesoVeiculo;
	}

	public void setPesoVeiculo(double pesoVeiculo) {
		this.pesoVeiculo = pesoVeiculo;
	}
	
	@Override
    public String toString() {
        return "Modelo [ID: " + idModelo + ", Modelo: " + modeloVeiculo +
               ", Comprimento: " + comprimentoVeiculo + "m, Altura: " + alturaVeiculo +
               "m, Eixo: " + eixoVeiculo + ", Peso: " + pesoVeiculo + "kg]";
    }
    
}
