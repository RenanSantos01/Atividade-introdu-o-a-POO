class Carro{

private String ligar;

Carro(String ligar){
    this.ligar = ligar;
}

public String ligar(){
    return ligar;
}

}

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("vrum, vrum"); 
        System.out.println("ligar: " + carro.ligar());
    }
}
