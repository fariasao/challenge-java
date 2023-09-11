package Challenge;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Apolice {
	
	private int idApolice;
    private int idVeiculo;
    private String statusApolice;
    private double valorApolice;
    private Date vigenciaApolice;
    private String placaVeiculo;
    
	public Apolice(int idApolice, int idVeiculo, String statusApolice, double valorApolice, Date vigenciaApolice,
			String placaVeiculo) {
		this.idApolice = idApolice;
		this.idVeiculo = idVeiculo;
		this.statusApolice = statusApolice;
		this.valorApolice = valorApolice;
		this.vigenciaApolice = vigenciaApolice;
		this.placaVeiculo = placaVeiculo;
	}

	public int getIdApolice() {
		return idApolice;
	}

	public void setIdApolice(int idApolice) {
		this.idApolice = idApolice;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getStatusApolice() {
		return statusApolice;
	}

	public void setStatusApolice(String statusApolice) {
		this.statusApolice = statusApolice;
	}

	public double getValorApolice() {
		return valorApolice;
	}

	public void setValorApolice(double valorApolice) {
		this.valorApolice = valorApolice;
	}

	public Date getVigenciaApolice() {
		return vigenciaApolice;
	}

	public void setVigenciaApolice(Date vigenciaApolice) {
		this.vigenciaApolice = vigenciaApolice;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	
	@Override
	public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Apolice [ID: " + idApolice + ", Vigência: " + dateFormat.format(vigenciaApolice) +
               ", Status: " + statusApolice + ", Valor: " + valorApolice + ", Placa: " + placaVeiculo + "]";
    }
    
}
