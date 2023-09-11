package Challenge;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class Gerenciador {

	private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private Connection conn;
	
	public Gerenciador() throws SQLException {
		OracleDataSource ods = new OracleDataSource();
		
//		configurando url
		ods.setURL(url);
//		config usuario
		ods.setUser(Credenciais.user);
//		config senha
		ods.setPassword(Credenciais.pwd);
		
//		obter uma conexão
		conn = ods.getConnection();
	}
	
	public boolean inserirCliente(Cliente c) {
		String sql = "INSERT INTO tb_hl_cliente VALUES(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, c.getIdCliente());
			ps.setString(2, c.getNomeCliente());
			ps.setString(3, c.getSenhaCliente());
			ps.setString(4, c.getEnderecoCliente());
			ps.setLong(5, c.getTelefoneCliente());
			ps.setString(6, c.getTipoCliente());
			ps.setString(7, c.getCpfCnpjCliente());
			ps.execute();
		} catch (SQLException e) {
			if(conn == null) {
				System.err.println("Conexão nula");				
			}
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean inserirApolice(Apolice a) {
		String sql = "INSERT INTO tb_hl_apolice VALUES(?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, a.getIdApolice());
			ps.setInt(2, a.getIdVeiculo());
			ps.setString(3, a.getStatusApolice());
			ps.setDouble(4, a.getValorApolice());
			ps.setDate(5, (Date) a.getVigenciaApolice());
			ps.setString(6, a.getPlacaVeiculo());
			ps.execute();
		} catch (SQLException e) {
			if(conn == null) {
				System.err.println("Conexão nula");				
			}
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean inserirVeiculo(Veiculo v) {
        String sql = "INSERT INTO tb_hl_veiculo VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, v.getIdVeiculo());
            ps.setInt(2, v.getIdMarca());
            ps.setInt(3, v.getIdTipoVeiculo());
            ps.setInt(4, v.getIdModelo());
            ps.setString(5, String.valueOf(v.getChassiAlongado()));
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public boolean inserirModelo(Modelo m) throws SQLException {
        String sql = "INSERT INTO tb_hl_modelo VALUES(?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, m.getIdModelo());
            ps.setString(2, m.getModeloVeiculo());
            ps.setDouble(3, m.getComprimentoVeiculo());
            ps.setDouble(4, m.getAlturaVeiculo());
            ps.setInt(5, m.getEixoVeiculo());
            ps.setDouble(6, m.getPesoVeiculo());
            ps.execute();
        } catch (SQLException e){
            if (conn == null) {
                System.err.println("Conexão nula!");
            }
            e.printStackTrace();
        }
        return true;
    } 
	
	public boolean inserirTipoVeiculo(TipoVeiculo t) throws SQLException {
        String sql = "INSERT INTO tb_hl_tipo_veiculo VALUES(?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getIdTipoVeiculo());
            ps.setString(2, t.getTipoVeiculo());
            ps.execute();
        } catch (SQLException e){
            if (conn == null) {
                System.err.println("Conexão nula!");
            }
            e.printStackTrace();
        }
        return true;
    }
	
	public boolean inserirMarca(Marca m) throws SQLException {
        String sql = "INSERT INTO tb_hl_marca VALUES(?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, m.getIdMarca());
            ps.setString(2, m.getMarcaVeiculo());
            ps.execute();
        } catch (SQLException e){
            if (conn == null) {
                System.err.println("Conexão nula!");
            }
            e.printStackTrace();
        }
        return true;
    }
	
	public boolean inserirEmpresa(Empresa em) throws SQLException {
        String sql = "INSERT INTO tb_hl_empresa VALUES(?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, em.getIdEmpresa());
            ps.setString(2, em.getNomeEmpresa());
            ps.setLong(3, em.getTelefoneEmpresa());
            ps.execute();
        } catch (SQLException e){
            if (conn == null) {
                System.err.println("Conexão nula!");
            }
            e.printStackTrace();
        }
        return true;
    }
	
	public boolean inserirFuncionario(Funcionario f) throws SQLException {
        String sql = "INSERT INTO tb_hl_funcionario VALUES(?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, f.getIdFuncionario());
            ps.setString(2, f.getNomeFuncionario());
            ps.setLong(3, f.getTelefoneFuncionario());
            ps.execute();
        } catch (SQLException e){
            if (conn == null) {
                System.err.println("Conexão nula!");
            }
            e.printStackTrace();
        }
        return true;
    }
	
	public boolean inserirModal(Modal m) throws SQLException {
        String sql = "INSERT INTO tb_hl_modal VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, m.getIdModal());
            ps.setString(2, m.getCategoriaModal());
            ps.setString(3, m.getTipoModal());
            ps.setDouble(4, m.getLimiteAltura());
            ps.setDouble(5, m.getLimiteComprimento());
            ps.setDouble(6, m.getLimitePeso());
            ps.setDouble(7, m.getLimiteLargura());
            ps.execute();
        } catch (SQLException e){
            if (conn == null) {
                System.err.println("Conexão nula!");
            }
            e.printStackTrace();
        }
        return true;
    } 
	
	public boolean inserirServico(Servico s) {
        String sql = "INSERT INTO tb_hl_servico VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getIdServico());
            ps.setInt(2, s.getIdCliente());
            ps.setInt(3, s.getIdPrestador());
            ps.setTimestamp(4, s.getHoraServico());
            ps.setString(5, s.getLocalUsuario());
            ps.setString(6, s.getStatusOrdem());
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public boolean inserirPrestador(Prestador p) {
        String sql = "INSERT INTO tb_hl_prestador VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, p.getIdPrestador());
            ps.setInt(2, p.getIdEmpresaFuncionario());
            ps.setString(3, p.getLocalPrestador());
            ps.setString(4, p.getPlacaGuincho());
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public boolean inserirEmpresaFuncionario(EmpresaFuncionario ef) {
        String sql = "INSERT INTO tb_hl_empresa_funcionario VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ef.getIdEmpresaFuncionario());
            ps.setInt(2, ef.getIdEmpresa());            
            ps.setInt(3, ef.getIdFuncionario());            
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public boolean inserirPrestadorModal(PrestadorModal pm) {
        String sql = "INSERT INTO tb_hl_prestador_modal VALUES (?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pm.getIdPrestador());           
            ps.setInt(2, pm.getIdModal());          
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

	public boolean inserirClienteApolice(ClienteApolice ca) {
		String sql = "INSERT INTO tb_hl_prestador_modal VALUES (?, ?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, ca.getIdCliente());          
			ps.setInt(2, ca.getIdApolice());           
			ps.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean excluir(int id, String tabela, String tabelaId) {
        String sql = "DELETE FROM "+ tabela + " WHERE " + tabelaId + " = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao apagar o cliente - excluir()");
            e.printStackTrace();
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão!");
                e.printStackTrace();
            }
        }
        return true;
    }

}
