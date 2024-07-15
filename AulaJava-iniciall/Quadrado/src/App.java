class Quadrado {
    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }
    
    public int getlado(){
        return lado;
    }

    public void setlado(int lado){
        this.lado = lado;
    } 

    public int calculararea(){
        return lado*lado;

    }

    public static void main(String[] args){
        Quadrado quadrado1 = new Quadrado( 4);
        System.out.println("tamanho do lado:" + quadrado1.getlado());
        System.out.println("Area do quadrado:" + quadrado1.calculararea());

        quadrado1.setlado(4);
        System.out.println("tamanho do lado:" + quadrado1.getlado());
        System.out.println("Area do quadrado:" + quadrado1.calculararea());
    
    }


    }