class Cachorro{

public void latir(){
    System.out.println("au, au");
}

}

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro();
        cachorro.latir();
    }
}
