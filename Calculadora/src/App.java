class Caluculadora{
public int somaa;
public int somab;


public int calcularsomar(int somaa, int somab){
    return somaa + somab;
}

}

public class App {
    public static void main(String[] args) throws Exception {
        Caluculadora caluculadora = new Caluculadora();
       int resultado = caluculadora.calcularsomar(20, 5);

        System.out.println("resultado da soma: " + resultado);
    }
}
