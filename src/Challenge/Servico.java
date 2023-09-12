package Challenge;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Servico implements Descricao{
	//Atributos da classe Servico
	private int idServico;
    private int idCliente;
    private int idPrestador;
    private Timestamp horaServico;
    private String localUsuario;
    private String statusOrdem;

    //Construtor parametrizado de Servico
    public Servico(int idServico, int idCliente, int idPrestador, Timestamp horaServico, String localUsuario, String statusOrdem) {
        this.idServico = idServico;
        this.idCliente = idCliente;
        this.idPrestador = idPrestador;
        this.horaServico = horaServico;
        this.localUsuario = localUsuario;
        this.statusOrdem = statusOrdem;
    }

    //Getters e Setters
	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdPrestador() {
		return idPrestador;
	}

	public void setIdPrestador(int idPrestador) {
		this.idPrestador = idPrestador;
	}

	public Timestamp getHoraServico() {
		return horaServico;
	}

	public void setHoraServico(Timestamp horaServico) {
		this.horaServico = horaServico;
	}

	public String getLocalUsuario() {
		return localUsuario;
	}

	public void setLocalUsuario(String localUsuario) {
		this.localUsuario = localUsuario;
	}

	public String getStatusOrdem() {
		return statusOrdem;
	}

	public void setStatusOrdem(String statusOrdem) {
		this.statusOrdem = statusOrdem;
	}
	
	//Método toString com override
	@Override
	public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = dateFormat.format(horaServico);
        return "Servico [ID: " + idServico + ", ID do Cliente: " + idCliente +
               ", ID do Prestador: " + idPrestador + ", Hora do Serviço: " + dataFormatada +
               ", Local do Usuário: " + localUsuario + ", Status da Ordem: " + statusOrdem + "]";
    }
    
}
