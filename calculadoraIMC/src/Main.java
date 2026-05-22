import javax.swing.JOptionPane;

// Classe responsável por realizar o cálculo IMC
public class Main {

    public static double calculadoraIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método responsável pela classificação
    public static String classificarIMC(double imc) {

        if (imc < 18.5) {
            return "Abaixo do peso";

        } else if (imc < 25) {
            return "Peso normal!";

        } else if (imc < 30) {
            return "Sobrepeso";

        } else {
            return "Obesidade";
        }
    }

    public static void main(String[] args) {

        double altura = Double.parseDouble(
                JOptionPane.showInputDialog("Digite sua altura (m): ")
                        .replace(",", ".")
        );

        double peso = Double.parseDouble(
                JOptionPane.showInputDialog("Digite seu peso em Kg: ")
                        .replace(",", ".")
        );

        double imc = calculadoraIMC(peso, altura);

        JOptionPane.showMessageDialog(
                null,
                String.format("Seu IMC é: %.2f", imc)
        );

        JOptionPane.showMessageDialog(
                null,
                "Classificação: " + classificarIMC(imc)
        );
    }
}