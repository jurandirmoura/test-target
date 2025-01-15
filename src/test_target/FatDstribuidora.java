package test_target;

public class FatDstribuidora {

	public static void main(String[] args) {

        double[] faturamentoDiario = {22174.1664, 24537.6698, 26139.6134,
        		 0.0,0.0,26742.6612, 0.0,42889.2258,46251.174,11191.4722, 0.0,0.0,3847.4823,373.7838,2659.7563
        		 ,48924.2448,18419.2614,0.0,0.0,35240.1826,43829.1667,18235.6852,4355.0662,13327.1025,0.0
        		 ,0.0,25681.8318,1718.1221,13220.495,8414.61};
        
       
        double menorFaturamento = calcularMenorFaturamento(faturamentoDiario);
        double maiorFaturamento = calcularMaiorFaturamento(faturamentoDiario);
        double mediaFaturamento = calcularMediaFaturamento(faturamentoDiario);
        int diasAcimaDaMedia = calcularDiasAcimaDaMedia(faturamentoDiario, mediaFaturamento);
        
  
        System.out.println("Menor faturamento ocorrido: R$ " + menorFaturamento);
        System.out.println("Maior faturamento ocorrido: R$ " + maiorFaturamento);
        System.out.println("Número de dias com faturamento superior à média: " + diasAcimaDaMedia);
    }

    public static double calcularMenorFaturamento(double[] faturamento) {
        double menor = Double.MAX_VALUE; 
        for (double valor : faturamento) {
            if (valor < menor && valor > 0) {
                menor = valor;
            }
        }
        return menor;
    }

    public static double calcularMaiorFaturamento(double[] faturamento) {
        double maior = Double.MIN_VALUE;
        for (double valor : faturamento) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    public static double calcularMediaFaturamento(double[] faturamento) {
        double soma = 0;
        int diasComFaturamento = 0;
        
        for (double valor : faturamento) {
            if (valor > 0) { 
                soma += valor;
                diasComFaturamento++;
            }
        }
        
        if (diasComFaturamento == 0) {
            return 0;
        }
        
        return soma / diasComFaturamento;
    }

    public static int calcularDiasAcimaDaMedia(double[] faturamento, double media) {
        int count = 0;
        for (double valor : faturamento) {
            if (valor > media) {
                count++;
            }
        }
        return count;
    }

	}

