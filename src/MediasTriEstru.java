import java.io.IOException;
import java.util.Scanner;

public class MediasTriEstru {
    public static void main(String[] args) throws IOException {

        // double media;
        System.out.println("Escreva quantidade de alunos:");
        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();

        //variaveis
        int i= 0;
        double[] nota1t = new double[qtd];
        double[] nota2t = new double[qtd];
        double[] nota3t = new double[qtd];
        double[] media = new double[qtd];
        String[] status = new String[qtd];
        String[] nome= new String[qtd];

        do {
            Scanner scst = new Scanner(System.in);
            System.out.printf("Escreva nome do Aluno:");
            nome[i] = scst.nextLine();
            System.out.println("Escreva as notas do 1Trimestre:");
            nota1t[i] = scst.nextDouble();
            if (nota1t[i] > 30) {System.out.println("Nota invalida"); break; }
            System.out.println("Escreva as notas do 2Trimestre:");
            nota2t[i] = scst.nextDouble();
            if (nota2t[i] > 30) {System.out.println("Nota invalida"); break;}
            System.out.println("Escreva as notas do 3Trimestre:");
            nota3t[i] = scst.nextDouble();
            if (nota3t[i] > 40) {System.out.println("Nota invalida"); break;}

            media[i]=nota1t[i]+nota2t[i]+nota3t[i];
            System.out.printf("Media: %.1f\n",media[i]);


            if (media[i] >= 60.00 ){ status[i] = "Aprovado"; }
            else if (media[i] < 50.00){ status[i] = "Reprovado";}
            else if (media[i] >= 50.00 && media[i] <= 59.99){ status[i] = "Fara a Avaliacao Final"; }
            i++;

        }while ( i < qtd );

        for ( i=0; i<qtd; i++) {
            System.out.println("Nome: " + nome[i] + ", Media: " + media[i]+ ", Situacao: " + status[i]);
        }
        sc.close();
    }
}