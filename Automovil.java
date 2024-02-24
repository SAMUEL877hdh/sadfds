import java.util.Scanner;

public class Automovil {
    
    private String marca;
    private int modelo;
    private int motor;
    private enum TipoCombustible {GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL}
    private TipoCombustible tipoCombustible;
    private enum TipoAutomovil {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private int velocidadMaxima;
    private enum TipoColor {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}
    private TipoColor color;
    private int velocidadActual = 0;
    


    
    public Automovil(String marca, int modelo, int motor, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos, int velocidadMaxima, TipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;    
    }

    public String getMarca() {
        return marca;
    }
    
    public int getModelo() {
        return modelo;
    }
    
    public int getMotor() {
        return motor;
    }
    
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }
    
    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }
    
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    
    public int getCantidadAsientos() {
        return cantidadAsientos;
    }
    
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    public TipoColor getColor() {
        return color;
    }
    
    public int getVelocidadActual() {
        return velocidadActual;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    public void setMotor(int motor) {
        this.motor = motor;
    }
    
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public void setColor(TipoColor color) {
        this.color = color;
    }
    
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    
    public void acelerar(int incrementoVelocidad) {
        
        if (velocidadActual + incrementoVelocidad < velocidadMaxima) {
            velocidadActual = velocidadActual + incrementoVelocidad;
        } 
        else {
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
        }
    }
    
    public void desacelerar(int decrementoVelocidad) {
        
        if ((velocidadActual - decrementoVelocidad) > 0) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } 
        
        else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
    
    
    public void frenar() {
        velocidadActual = 0;
    }
    
    public double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
    }
    
    
    public void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " +cantidadAsientos);
        System.out.println("Velocida máxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
    }
    

    

    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        Automovil auto1 = new Automovil("Ford", 2018, 3, Automovil.TipoCombustible.DIESEL, Automovil.TipoAutomovil.EJECUTIVO, 5, 6, 250, Automovil.TipoColor.NEGRO);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + "! Bienvenido.");
        
      
        
        auto1.imprimir();
  
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.desacelerar(20);
        

    }
    

}

    
