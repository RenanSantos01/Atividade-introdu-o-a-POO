class Bola{
    private String cor; 
    
    
    public Bola(String cor){
        this.cor = cor;
    }
    
    public String getcor(){
        return cor;
    }
    
    public void setcor(String cor){
        this.cor = cor;
    }
    
    
    }
    
    public class App {
        public static void main(String[] args) throws Exception {
            Bola bola = new Bola("vermelho");
            System.out.println("Cor da bola: " + bola.getcor());
            
            bola.setcor("azul");
            System.out.println("nova cor da bola: " + bola.getcor());
        }
    
    }
    