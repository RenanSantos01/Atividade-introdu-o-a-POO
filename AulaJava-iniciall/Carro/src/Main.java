class Carro{
    private String marca;
    private String modelo;
    private int anodefabri;
    private String cor;
    private int valoratual;
    
    Carro(String marca, String modelo, int anodefabri, String cor, int valoratual){
        this.marca = marca;
        this.modelo = modelo;
        this.anodefabri = anodefabri;
        this.cor = cor;
        this.valoratual = valoratual;
    }
    
    public String getmarca(){
        return marca;
    }
    
    public String getmodelo(){
        return modelo;
    }
    
    public int getanodefabri(){
        return anodefabri;
    }
    
    public String getcor(){
        return cor;
    }
    
    public int getvaloratual(){
        return valoratual;
    }
    
    
    }
    
    public class Main {
        public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("ford", "fordka", 2023, "azul", 5000);
            
            System.out.println("marca " + carro1.getmarca());
            System.out.println("modelo " + carro1.getmodelo());
            System.out.println("anodefabri " + carro1.getanodefabri());
            System.out.println("cor " + carro1.getcor());
            System.out.println("valoratual " + carro1.getvaloratual());
        }
    
    }
    