import java.util.Scanner;

class media{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double somaDasnotas = 0;

    for(int i = 1; i<= 3; i++){
        System.out.println("Digite a nota do aluno" + i + ":");
        double nota = scanner.nextDouble();
        somaDasnotas += nota;

    }
    double media = somaDasnotas / 3;
    System.out.println("A media das notas é: " + media);
 
}



}


