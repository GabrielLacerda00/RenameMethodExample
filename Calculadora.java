public class Calculadora {
  public int calcular(String operacao, int num1, int num2) {
    int resultado = 0;

    if (operacao.equals("soma")) {
      resultado = sum(num1, num2);
    } else if (operacao.equals("subtracao")) {
      resultado = subtracao(num1, num2);
    } else if (operacao.equals("multiplicacao")) {
      resultado = multiplicacao(num1, num2);
    } else if (operacao.equals("divisao")) {
      resultado = divisao(num1, num2);
    } else {
      throw new IllegalArgumentException("Operação desconhecida: " + operacao);
    }

    return resultado;
  }

  private int sum(int num1, int num2) {
    return num1 + num2;
  }

  private int subtracao(int num1, int num2) {
    return num1 - num2;
  }

  private int multiplicacao(int num1, int num2) {
    return num1 * num2;
  }

  private int divisao(int num1, int num2) {
    if (num2 != 0) {
      return num1 / num2;
    } else {
      throw new IllegalArgumentException("Divisão por zero não é permitida");
    }
  }
}
