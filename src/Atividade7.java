import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Atividade7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;
        Atividade7 atividade = new Atividade7();

        System.out.println("+-------------------------------------------+");
        System.out.println("+------------------Bem Vindo----------------+");
        System.out.println("+-------------------------------------------+");
        System.out.println("+-------------------------------------------+");
        System.out.println("1) Numeros pares: ");
        System.out.println("2) Numeros impares: ");
        System.out.println("3) Numeros primos: ");
        System.out.println("4) Calculos de juros: ");
        System.out.println("0) Sai: ");
        opcao = sc.nextInt();


        switch (opcao){

            case 1:
                atividade.escolhaPares();
                break;
            case 2:
                atividade.escolhaImpares();
                break;
            case 3:
                atividade.escolhaPrimos();
                break;
            case 4:
                atividade.escolhaCalculoJuros();
                break;

            case 0:
                System.out.println("Saindo do programa!");
                break;
            default:
                System.out.println("Valor inválido! Digite novamente!");
                break;

        }

    }

    private void escolhaPares(){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero");
        numero = sc.nextInt();

        for (int i = 0; i <= numero; i++) {
            if(i % 2 == 0){
                System.out.println("numeros pares "+i);
            }
        }
    }
    private void escolhaImpares(){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero");
        numero = sc.nextInt();

        for (int i = 0; i <= numero; i++) {
            if(i % 2 == 1){
                System.out.println("numeros ímpares: "+i);
            }
        }
    }

    private void escolhaPrimos(){
        int num;
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 2; i <num ; i++) {
            String primo = "numero primo";
            for (int j = 2; j <i ; j++) {
                if(i % j == 0){
                    primo = "nao primo";
                }
            }
            if(primo == "numero primo"){
                System.out.println(i + " " +primo);

            }
        }
    }

    private void escolhaCalculoJuros(){
        double valorInicial = 0.0;

        boolean valida = true;
        do {
            System.out.println("Digite um numero: ");
            Scanner sc = new Scanner(System.in);
            valorInicial = sc.nextDouble();
            if( valorInicial < 0){
                System.out.println("Erro, valor deve ser positivo!");
            } else {
                valida = false;
            }
        }while (valida);


        Locale locale = new Locale("pt", "BR");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

      // double valorInicial = 5000.00; // valor original
        double percentual = 2.0 / 100.0; // 2%

        System.out.println("Valor inicial de investimento: " + currencyFormatter.format(valorInicial));

        for (int mes = 1; mes <= 24; mes++) {

            double valorLucro = percentual * valorInicial;
            valorInicial += (valorInicial * percentual);

            System.out.println("*****************************");
            System.out.println("Mês: "+ mes);
            System.out.println("Rendimento mensal de: "+ currencyFormatter.format(valorLucro));
            System.out.println( "Valor atualizado: " + currencyFormatter.format(valorInicial));
        }
    }
}
