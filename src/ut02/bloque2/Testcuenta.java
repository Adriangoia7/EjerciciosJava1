package ut02.bloque2;

public class Testcuenta {
    public static void main(String[] args) {

       
        Cuenta cuentaParticular1 = new Cuenta("Adria");

       
        Cuenta cuentaEmpresa1 = new Cuenta("Empresa S.L.", 2000);

       
        System.out.println("Titular: " + cuentaParticular1.getTitular());

     
        System.out.println("Saldo: " + cuentaEmpresa1.getCantidad());

      
        cuentaParticular1.ingresar(1000);

        cuentaEmpresa1.retirar(500);

       
        cuentaParticular1.mostrarDatos();
        cuentaEmpresa1.mostrarDatos();
    }
}

