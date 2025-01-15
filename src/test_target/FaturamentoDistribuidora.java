package test_target;

public class FaturamentoDistribuidora {

	public static void main(String[] args) {

		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;

		// Calculando o total de faturamento
		double totalFaturamento = sp + rj + mg + es + outros;

		// Calculando o percentual de representação de cada estado
		double percentualSP = (sp / totalFaturamento) * 100;
		double percentualRJ = (rj / totalFaturamento) * 100;
		double percentualMG = (mg / totalFaturamento) * 100;
		double percentualES = (es / totalFaturamento) * 100;
		double percentualOutros = (outros / totalFaturamento) * 100;

		// Exibindo os resultados
		System.out.println("Percentual de representação no faturamento mensal:");
		System.out.println("SP: " + String.format("%.2f", percentualSP) + "%");
		System.out.println("RJ: " + String.format("%.2f", percentualRJ) + "%");
		System.out.println("MG: " + String.format("%.2f", percentualMG) + "%");
		System.out.println("ES: " + String.format("%.2f", percentualES) + "%");
		System.out.println("Outros: " + String.format("%.2f", percentualOutros) + "%");
	}

}
