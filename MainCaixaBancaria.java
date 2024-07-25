import java.util.Scanner;

public class MainCaixaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        int contadornota100 = 0, contadornota50 = 0, contadornota20 = 0, contadornota10 = 0, contadornota5 = 0;
    
          do{
            System.out.println("Informe o valor que quer sacar: (sendo o valor divisível por 5 fazendo favor.)");
            valor = scanner.nextInt();
          }while(valor % 5 != 0);

            if (valor >= 100) {
                while (valor >= 100 && contadornota100 < 100) {
                    valor = valor - 100;
                    contadornota100 += 1;
                }
            }
            if (valor >= 50) {
                while (valor >= 50 && contadornota50 < 100) {
                    valor = valor - 50;
                    contadornota50 += 1;
                }
            }
            if (valor >= 20) {
                while (valor >= 20 && contadornota20 < 100) {
                    valor = valor - 20;
                    contadornota20 += 1;
                }
            }
            if (valor >= 10) {
                while (valor >= 10 && contadornota10 < 100) {
                    valor = valor - 10;
                    contadornota10 += 1;
                }
            }
            if (valor >= 5) {
                while (valor >= 5 && contadornota5 < 100) {
                    valor = valor - 5;
                    contadornota5 += 1;
                }
            }
            
            if(valor % 5 == 0){
            System.out.println(" Foram sacadas " + contadornota100 + " cédulas de cem reais.");
            System.out.println(" Foram sacadas " + contadornota50 + " cédulas de cinquenta reais.");
            System.out.println(" Foram sacadas " + contadornota20 + " cédulas de vinte reais.");
            System.out.println(" Foram sacadas " + contadornota10 + " cédulas de dez reais.");
            System.out.println(" Foram sacadas " + contadornota5 + " cédulas de cinco reais.");
            } else{
                System.out.println("Valor inválido. Não é multiplo de 5.");
            }
       

    }
}
