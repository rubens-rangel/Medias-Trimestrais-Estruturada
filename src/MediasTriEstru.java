import java.util.Scanner;

public class MediasTriEstru {
    public static void main(String[] args) {

        // Quantidade de alunos
        System.out.println("Escreva quantidade de alunos:");
        Scanner sc = new Scanner(System.in);
        int qtdAlunos = sc.nextInt();

        //Declaração de variaveis
        int i = 0;
        double[] nota1t = new double[qtdAlunos];
        double[] nota2t = new double[qtdAlunos];
        double[] nota3t = new double[qtdAlunos];
        double[] media = new double[qtdAlunos];
        String[] situacao = new String[qtdAlunos];
        String[] nome = new String[qtdAlunos];

        // estrutura de repetição para imput de notas e checagem de nota valida
        do {
            Scanner scst = new Scanner(System.in);
            System.out.printf("Escreva nome do Aluno: ");
            nome[i] = scst.nextLine();
            System.out.println("Escreva as notas do 1° Trimestre:");
            nota1t[i] = scst.nextDouble();

            // estrutura condicional para checagem de nota valida ( se a nota for >30 ou <0)
            if ((nota1t[i] > 30) || (nota1t[i] < 0)) {
                for (int o = 0; (nota1t[i] > 30) || (nota1t[i] < 0); o++) {
                    System.out.println("Nota invalida, digite uma nota Valida:");
                    nota1t[i] = scst.nextDouble();
                }
            }
            System.out.println("Escreva as notas do 2° Trimestre:");
            nota2t[i] = scst.nextDouble();
            if ((nota2t[i] > 30) || (nota2t[i] < 0)) {
                for (int o = 0; (nota2t[i] > 30) || (nota2t[i] < 0); o++) {
                    System.out.println("Nota invalida, digite uma nota Valida:");
                    nota2t[i] = scst.nextDouble();
                }
            }
            System.out.println("Escreva as notas do 3° Trimestre:");
            nota3t[i] = scst.nextDouble();
            if ((nota3t[i] > 30) || (nota3t[i] < 0)) {
                for (int o = 0; (nota3t[i] > 40) || (nota3t[i] < 0); o++) {
                    System.out.println("Nota invalida, digite uma nota Valida:");
                    nota3t[i] = scst.nextDouble();
                }
            }

            //calculo da media
            media[i] = nota1t[i] + nota2t[i] + nota3t[i];
            System.out.printf("Media: %.1f \n", media[i]);

            // checagem de aprovação e armazenagem em uma string situação
            if (media[i] >= 60.00) {
                situacao[i] = "Aprovado";
            } else if (media[i] < 50.00) {
                situacao[i] = "Reprovado";
            } else if (media[i] >= 50.00 && media[i] < 60.00) {
                situacao[i] = "Aluno devera realizar a Avaliação Final";
            }
            i++;
        } while (i < qtdAlunos);

        System.out.println("Lista de Alunos:");
        //estrutura de repetição para correr a lista e imprimir resultados
        for (i = 0; i < qtdAlunos; i++) {
            System.out.println(
                    "Nome: " + nome[i] +
                            ", Media: " + media[i] +
                            ", Situacao: " + situacao[i]);
        }
    }
}


