import java.util.Scanner;

class idade{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int maiordeidade = 0;

    System.out.println("insira sua idade: ");
    maiordeidade = scanner.nextInt();
    
    if(maiordeidade >= 18){
    System.out.println("maior de idade: ");
    }
    
    if(maiordeidade <= 18){
    System.out.println("menor de idade");    

    }
 


}
}


