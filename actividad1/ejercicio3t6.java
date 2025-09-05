package actividad1;

// Ejemplo de uso incorrecto de protected
class Banco {
    protected double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }
}

// Subclase que puede modificar saldo directamente (no seguro)
class ClienteBanco extends Banco {
    public ClienteBanco(double saldo) {
        super(saldo);
    }

    public void modificarSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo; // Acceso directo, NO seguro
    }
}


// Clase que encapsula el saldo de manera segura
class BancoSeguro {
    private double saldo;

    public BancoSeguro(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}

