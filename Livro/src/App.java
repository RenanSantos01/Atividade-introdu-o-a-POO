class Livro{
public String titulo;
public String autor;
public int anodepublicacao;

Livro(String titulo, String autor, int anodepublicacao){

    this.titulo = titulo;
    this.autor = autor;
    this.anodepublicacao = anodepublicacao;
}

}


public class App {
    public static void main(String[] args) throws Exception {
        Livro livro = new Livro("Financas", "Renan", 2005);
        
        System.out.println("titulo: " + livro.titulo);
        System.out.println("autor: " + livro.autor);
        System.out.println("Ano de publicacao: " + livro.anodepublicacao);
    }
}
