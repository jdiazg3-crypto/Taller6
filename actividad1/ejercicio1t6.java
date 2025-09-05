package actividad1;

//clase empeado
class Empleado{
    protected String nombre;
    protected double sueldo;

    //constructor
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
//motodo para mostrar el nombre del empleado y salario
    public void mostrarNombre(){
        System.out.println("Nombre del empleado: " + nombre);
    System.out.println("Sueldo del empleado: " + sueldo);
    }
}
//clase gerente que hereda de empleado
class Gerente extends Empleado{
    private String departamento;

    //constructor
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    //metodo para mostrar el nombre del gerente, salario y departamento
    @Override
    public void mostrarNombre(){
        super.mostrarNombre();
        System.out.println("Departamento: " + departamento);
    }
}
//clase principal para probar las clases
public class ejercicio1t6 {
    public static void main(String[] args) {
        Empleado emp1Empleado = new Empleado("Andres", 2500);
        Gerente gerente1 = new Gerente("Maria", 5000, "Ventas");
        System.out.println("Empleado:");
        emp1Empleado.mostrarNombre();
        System.out.println("Gerente:");
        gerente1.mostrarNombre();
    }
}