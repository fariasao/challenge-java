package Challenge;

public class Cliente {
	//Atributos da classe Cliente
	private int idCliente;
    private String nomeCliente;
    private String senhaCliente;
    private String enderecoCliente;
    private long telefoneCliente;
    private String TipoCliente;
    private String cpfCnpjCliente;
    
    //Construtor parametrizado de Cliente
	public Cliente(int idCliente, String nomeCliente, String senhaCliente, String enderecoCliente, long telefoneCliente, 
			String TipoCliente, String cpfCnpjCliente) {
		this.idCliente = idCliente;
		this.TipoCliente = TipoCliente;
		this.nomeCliente = nomeCliente;
		this.senhaCliente = senhaCliente;
		this.enderecoCliente = enderecoCliente;
		this.telefoneCliente = telefoneCliente;
		this.cpfCnpjCliente = cpfCnpjCliente;
	}
	
	//Getters e Setters
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getTipoCliente() {
		return TipoCliente;
	}
	
	public void setIdTipoCliente(String TipoCliente) {
		this.TipoCliente = TipoCliente;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getSenhaCliente() {
		return senhaCliente;
	}
	
	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	
	public long getTelefoneCliente() {
		return telefoneCliente;
	}
	
	public void setTelefoneCliente(long telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
	public String getCpfCnpjCliente() {
		return cpfCnpjCliente;
	}
	
	public void setCpfCnpjCliente(String cpfCnpjCliente) {
		this.cpfCnpjCliente = cpfCnpjCliente;
	}
	
	//Método toString com Override
	@Override
    public String toString() {
        return "Cliente [ID: " + idCliente + ", Nome: " + nomeCliente +
               ", Endereço: " + enderecoCliente + ", Telefone: " + telefoneCliente +
               ", Tipo: " + TipoCliente + ", CPF/CNPJ: " + cpfCnpjCliente + "]";
    }
	
	//Métodos de verificação do tipo de cliente
	public boolean isPessoaFisica() {
        return "CPF".equalsIgnoreCase(TipoCliente); // Verifica se o tipo do cliente é "CPF" (ignorando maiúsculas/minúsculas)
    }

    public boolean isPessoaJuridica() {
        return "CNPJ".equalsIgnoreCase(TipoCliente); // Verifica se o tipo do cliente é "CNPJ" (ignorando maiúsculas/minúsculas)
    }
    
}
