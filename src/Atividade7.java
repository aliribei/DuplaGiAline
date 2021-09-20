import java.util.Scanner;

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
                break;
            case 3:
                break;
            case 4:
                break;

            case 0:
                break;

            default:
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
}
