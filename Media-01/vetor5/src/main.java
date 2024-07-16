import java.util.Scanner;

class vetor{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n1[] = new int[5];
    int maior = 0; int menor = 0;

    for(int i = 0; i < 5; i++){
    System.out.println("insira um numero: ");
    n1[i] = scanner.nextInt();

    
    if(i == 0){
    maior = n1[i];
    menor = n1[i];
    }
    else if (n1[i] > maior) {
    maior = n1[i];
    }
    else if (n1[i] < menor) {
    menor = n1[i];
    }
    
}

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);


    }
 
}




