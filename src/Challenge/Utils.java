package Challenge;

import java.util.List;

public class Utils {

	public static Veiculo encontrarVeiculoPorId(List<Veiculo> veiculos, int idVeiculo) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getIdVeiculo() == idVeiculo) {
                return veiculo; // Retorna o veículo se o ID correspondente for encontrado
            }
        }
        return null; // Retorna null se nenhum veículo com o ID fornecido for encontrado
    }
	
	public static double calcularValorTotalApolices(List<Apolice> apolices) {
        double valorTotal = 0.0;

        for (Apolice apolice : apolices) {
            valorTotal += apolice.getValorApolice(); // Soma o valor de cada apólice
        }

        return valorTotal;
    }
}
