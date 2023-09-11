package Challenge;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TestaChallenge {
	public static void main(String[] args) throws SQLException {
		//Instanciando o gerenciador
		Gerenciador gc = new Gerenciador();
		
		//Utilizando o método de criar ArrayList para o armazenamento de novas array lists
		List<Cliente> clientes = Utils.criarArrayList();
        List<TipoVeiculo> tiposVeiculo = Utils.criarArrayList();
        List<Marca> marcas = Utils.criarArrayList();
        List<Modelo> modelos = Utils.criarArrayList();
        List<Veiculo> veiculos = Utils.criarArrayList();
        List<Empresa> empresas = Utils.criarArrayList();
        List<Modal> modais = Utils.criarArrayList();
        List<Funcionario> funcionarios = Utils.criarArrayList();
        List<Apolice> apolices = Utils.criarArrayList();
        List<EmpresaFuncionario> empresaFuncionarios = Utils.criarArrayList();
        List<Prestador> prestadores = Utils.criarArrayList();
        List<PrestadorModal> prestadorModais = Utils.criarArrayList();
        List<ClienteApolice> clienteApolices = Utils.criarArrayList();
        List<Servico> servicos = Utils.criarArrayList();
		
        //Instanciando os objetos de cada classe
		Cliente c = new Cliente(1, "roger", "Senha123", "rua b", 123456789, "CPF", "123.456.78904");
        TipoVeiculo TpVeiculo = new TipoVeiculo(1, "Carro");
        Marca m = new Marca(1, "Toyota");
        Modelo mo = new Modelo(1, "Focus", 4.5, 1.6, 2, 1500);
        Veiculo v = new Veiculo(1, m.getIdMarca(), TpVeiculo.getIdTipoVeiculo(), mo.getIdModelo(), 'N');
        Empresa e = new Empresa(1, "Empresa A", 987654321);
        Modal mod = new Modal(1, "Categoria A", "Tipo A", 2.0, 5.0, 1000.0, 2.0);
        Funcionario f = new Funcionario(1, "Funcionário A", 123456789);
        Apolice a = new Apolice(1, v.getIdVeiculo(), "v", 1500.0, new Date(123, 8, 12), "ABC123");
		EmpresaFuncionario ef = new EmpresaFuncionario(1, e.getIdEmpresa(), f.getIdFuncionario());
		Prestador p = new Prestador(1, ef.getIdEmpresaFuncionario(), "Local A", "abs-1270");
		PrestadorModal pm = new PrestadorModal(p.getIdPrestador(), mod.getIdModal());
		ClienteApolice ca = new ClienteApolice(c.getIdCliente(), a.getIdApolice());
		Servico s = new Servico(1, c.getIdCliente(), p.getIdPrestador(), new Timestamp(System.currentTimeMillis()), "Local X", "A");
		
		//Adicionando os objetos dendo de suas devidas ArrayLists
		clientes.add(c);
        tiposVeiculo.add(TpVeiculo);
        marcas.add(m);
        modelos.add(mo);
        veiculos.add(v);
        empresas.add(e);
        modais.add(mod);
        funcionarios.add(f);
        apolices.add(a);
        empresaFuncionarios.add(ef);
        prestadores.add(p);
        prestadorModais.add(pm);
        clienteApolices.add(ca);
        servicos.add(s);
		
        //Inserção dos dados no banco de dados, assim como retorno de mensagem indicando sucesso ou falha
		System.out.println(gc.inserirCliente(c) ? 
				"Cliente registrado" : "Cliente nao registrado");
		
		System.out.println(gc.inserirTipoVeiculo(TpVeiculo) ?
				"Tipo veiculo registrado" : "Tipo nao registrado");

		System.out.println(gc.inserirMarca(m) ? 
				"Marca registrado" : "Marcar nao registrado");
		
		System.out.println(gc.inserirModelo(mo) ?
				"Modelo veiculo registrado" : "modelo veiculo nao registrado");
		
		System.out.println(gc.inserirVeiculo(v) ? 
				"Veiculo registrado" : "Veiculo Não registrado");
		
		System.out.println(gc.inserirEmpresa(e) ?
				"Empresa cadastrada" : "Empresa nao cadastrada");
		
		System.out.println(gc.inserirModal(mod) ?
				"Modal cadastrado" : "Modal não cadastrado");
		
		System.out.println(gc.inserirFuncionario(f)?
				"Funcionario Cadastrado" : "Funcionario nao cadastrado");
		
		System.out.println(gc.inserirApolice(a) ? 
				"Apolice Cadastrada" : "Apolice nao cadastrada");
		
		System.out.println(gc.inserirEmpresaFuncionario(ef) ? 
				"Funcionario-Empresa cadastrado" : "Funcionario-Empresa não cadastrado");
		
		System.out.println(gc.inserirPrestador(p) ? 
				"Prestador registrado" : "Prestador nao registrado");

		System.out.println(gc.inserirPrestadorModal(pm) ? 
				"Prestador-Modal registrado" : "Prestador-Modal nao registrado");

		System.out.println(gc.inserirClienteApolice(ca) ? 
				"Cliente-Apolice registrado" : "Cliente-Apolice nao registrado");
		
		System.out.println(gc.inserirServico(s) ? 
				"Servico registrado" : "Servico nao registrado");
		
		//Método para excluir itens do banco de dados, de maneira genérica por meio da inserção do nome e do id da tabela
//		System.out.println(gc.excluir(1, "tb_hl_servico", "id_servico") ?
//				"Cliente Excluido" : "Cliente não excluido");
		
		
		//Impressão dos dados, junto ao método toString em override
		System.out.println("\nInformações do Cliente:");
		System.out.println(c.toString());
        
		System.out.println("\nInformações da Apolice:");
		System.out.println(a.toString());
        
        System.out.println("\nInformações do Veiculo:");
        System.out.println(v.toString());
        
        System.out.println("\nInformações do Modelo:");
        System.out.println(mo.toString());
        
        System.out.println("\nInformações do Prestador:");
        System.out.println(p.toString());

        System.out.println("\nInformações do Servico:");
        System.out.println(s.toString());
        
        //Método para localização de veículo
        Veiculo veiculoEncontrado = Utils.encontrarVeiculoPorId(veiculos, 1);
        if (veiculoEncontrado != null) {
            System.out.println("\nVeículo encontrado: " + veiculoEncontrado);
        } else {
            System.out.println("\nVeículo não encontrado.");
        }
        
        //Calculo do valor total de apolices
        double valorTotalApolices = Utils.calcularValorTotalApolices(apolices);
        System.out.println("\nValor Total das Apólices: R$" + valorTotalApolices);
        
        //Impressão do tipo de pessoa cadastrada no sistema
        if (c.isPessoaFisica()) {
            System.out.println("\nEste cliente está cadastrado como Pessoa Física (PF).");
        } else if (c.isPessoaJuridica()) {
            System.out.println("\nEste cliente está cadastrado como Pessoa Jurídica (PJ).");
        }

	}
}
