package Automovil;

public class automovil {
    String marca;
    int modelo;
    int velocidadMaxima;
    int velocidadActual=0;
    enum tipoCom {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GASNATURAL
    }
    tipoCom  tipoCombistible;

    enum tipoAuto{
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }
    tipoAuto tipoAutomovil;

    
    public automovil(String marca, int modelo, int velocidadMaxima, int velocidadActual, tipoCom tipoCombistible, tipoAuto tipoAutomovil) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.tipoCombistible = tipoCombistible;
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    public void acelerar(int incremento){
        if (velocidadActual + incremento> velocidadMaxima){
            System.out.println("No se puede incrementar por encima de la velocidad maxima");
        } 
        else {
            velocidadActual = velocidadActual + incremento;

        }

    }

    public void desacelerar(int decremento){
        if (velocidadActual - decremento >= 0) {
            velocidadActual = velocidadActual - decremento; 

        }else {
            System.out.println("No puede desacelerar a una velocidad menor a 0");
        }
    }
    
    public void frenar(){
        velocidadActual = 0;
    }

    double calcularTiempoLlegada(int distancia){
        return distancia/velocidadActual;
    }
    public void imprimir(){
        System.out.println("Marca = " + marca);
        System.out.println("Modelo =" + modelo);
        System.out.println("Velocidad Maxima = " + velocidadMaxima);
        System.out.println("Velocidad Actual = "+ velocidadActual);
        System.out.println("Tipo Combustible = " + tipoCombistible);
        System.out.println("Tipo Automovil =" + tipoAutomovil);
    }

    public static void main(String[] args) {
        automovil auto1 = new automovil("Subaru", 2024, 240, 140, tipoCom.GASOLINA, tipoAuto.CIUDAD);
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad Actual = " +auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad Actual = " +auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad Actual = " +auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad Actual = " +auto1.velocidadActual);
        auto1.desacelerar(10); 
    }

    }

