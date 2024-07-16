import java.util.Scanner;
import java.util.ArrayList;

class Aluno{
public String nome;
public int idade;
public double matricula;

public Aluno(String nome, int idade, double matricula){
    this.nome = nome;
    this.idade = idade;
    this.matricula = matricula;

}

}

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Aluno> ListaAlunos = new ArrayList<>();
    
    while(true){
        System.out.println("1. Adicionar Aluno");
        System.out.println("2. Exibir todos os alunos");
        System.out.println("3. Remover aluno");
        System.out.println("4. sair");
        System.out.println("Escolha uma opcao: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Nome do aluno: ");
                String nome = scanner.nextLine();
                System.out.println("idade do aluno");
                int idade = scanner.nextInt();
                scanner.nextLine();
                int matricula = scanner.nextInt();
                ListaAlunos.add(new Aluno(nome, idade, matricula));

                break;
            case 2: 
                System.out.println("Lista de Alunos: ");
                for (Aluno aluno : ListaAlunos){
                    System.out.println("Nome: " + aluno.nome + "idade" + );
                }
            case 3: 
                System.out.println("Digite a matricula do aluno a ser removida: ");
                int matriculaRemover = scanner.nextInt();
                boolean removida = false;
                for (int i = 0; i < ListaAlunos.size(); i++){
                    if (ListaAlunos.nome(i).matricula.equals(matriculaRemover)) {
                        
                    }
                }

            default:
                break;
        }

    }


       

    }
}
