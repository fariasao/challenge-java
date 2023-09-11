package Challenge;

import java.util.ArrayList;
import java.util.List;

public class Utils {
	
	//Método para localizar um determinado veículo dentro do sistema
	public static Veiculo encontrarVeiculoPorId(List<Veiculo> veiculos, int idVeiculo) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getIdVeiculo() == idVeiculo) {
                return veiculo; // Retorna o veículo se o ID correspondente for encontrado
            }
        }
        return null; // Retorna null se nenhum veículo com o ID fornecido for encontrado
    }
	
	//Método para calculo do valor total das apólices dentro de seu ArrayList
	public static double calcularValorTotalApolices(List<Apolice> apolices) {
        double valorTotal = 0.0;

        for (Apolice apolice : apolices) {
            valorTotal += apolice.getValorApolice(); // Soma o valor de cada apólice
        }

        return valorTotal;
    }
	
	//Método genérico para criação de ArrayLists
	public static <T> ArrayList<T> criarArrayList() {
        return new ArrayList<T>();
    }
}
