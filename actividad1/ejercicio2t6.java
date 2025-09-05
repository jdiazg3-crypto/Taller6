package actividad1;
class Vehiculos {
    protected String tipo;
    protected String marca;

    public Vehiculos(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public void mostrarInformacion() {
        System.out.println("tipo: " + tipo);
        System.out.println("marca: " + marca);
    }
}

class Motos extends Vehiculos {
    private int cilindrada;

    public Motos(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}
// clase de prueba
class PruebaAcceso {
    public static void main(String[] args) {
        Vehiculos vehiculos = new Vehiculos("Auto", "Toyota");
    vehiculos.mostrarInformacion();
    
    Motos motos = new Motos("Moto", "Honda", 150);
    motos.mostrarInformacion();
    }
}