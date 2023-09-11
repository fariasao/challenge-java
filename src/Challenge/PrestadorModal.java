package Challenge;

public class PrestadorModal {
	//Atributos da classe PrestadorModal
    private int idPrestador;
    private int idModal;

 	//Construtor parametrizado de PrestadorModal
    public PrestadorModal(int idPrestador, int idModal) {
        this.idPrestador = idPrestador;
        this.idModal = idModal;
    }

    //Getters e Setters
	public int getIdPrestador() {
		return idPrestador;
	}

	public void setIdPrestador(int idPrestador) {
		this.idPrestador = idPrestador;
	}

	public int getIdModal() {
		return idModal;
	}

	public void setIdModal(int idModal) {
		this.idModal = idModal;
	}
}
