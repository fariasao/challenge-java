package Challenge;

public class Modal {
	//Atributos da classe Modal
	private int idModal;
    private String categoriaModal;
    private String tipoModal;
    private double limiteAltura;
    private double limiteComprimento;
    private double limitePeso;
    private double limiteLargura;
    
    //Construtor parametrizado de Modal
	public Modal(int idModal, String categoriaModal, String tipoModal, double limiteAltura, double limiteComprimento,
			double limitePeso, double limiteLargura) {
		this.idModal = idModal;
		this.categoriaModal = categoriaModal;
		this.tipoModal = tipoModal;
		this.limiteAltura = limiteAltura;
		this.limiteComprimento = limiteComprimento;
		this.limitePeso = limitePeso;
		this.limiteLargura = limiteLargura;
	}

	//Getters e Setters
	public int getIdModal() {
		return idModal;
	}

	public void setIdModal(int idModal) {
		this.idModal = idModal;
	}

	public String getCategoriaModal() {
		return categoriaModal;
	}

	public void setCategoriaModal(String categoriaModal) {
		this.categoriaModal = categoriaModal;
	}

	public String getTipoModal() {
		return tipoModal;
	}

	public void setTipoModal(String tipoModal) {
		this.tipoModal = tipoModal;
	}

	public double getLimiteAltura() {
		return limiteAltura;
	}

	public void setLimiteAltura(double limiteAltura) {
		this.limiteAltura = limiteAltura;
	}

	public double getLimiteComprimento() {
		return limiteComprimento;
	}

	public void setLimiteComprimento(double limiteComprimento) {
		this.limiteComprimento = limiteComprimento;
	}

	public double getLimitePeso() {
		return limitePeso;
	}

	public void setLimitePeso(double limitePeso) {
		this.limitePeso = limitePeso;
	}

	public double getLimiteLargura() {
		return limiteLargura;
	}

	public void setLimiteLargura(double limiteLargura) {
		this.limiteLargura = limiteLargura;
	}
    
}
