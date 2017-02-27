
package cajero_banco;


public class cliente {
    String nombre1;
    String nombre2;
    String apellido1;
    String apellido2;
    String cedula;
    String telefono;
    String direccion;
    String numCuenta;
    int pin;
    
    //Constructor 1 para aperturas de cuentas y base de datos
    public cliente(String nom1, String nom2, String ape1, String ape2, String ci, String tel, String dir, String nc, int id)
    {
     nombre1 = nom1;
     nombre2 = nom2;
     apellido1 = ape1;
     apellido2 = ape2;
     cedula = ci;
     telefono = tel;
     direccion = dir;
     numCuenta =nc;
     pin = id;
    }
    //Constructor 2 para identificarse con cajero
    public cliente(String nom1, String nom2, String ape1, String ape2, String nc)
    {
     nombre1 = nom1;
     nombre2 = nom2;
     apellido1 = ape1;
     apellido2 = ape2;
     numCuenta =nc;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public int getPin(){
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    void mostrarEstado(){
        System.out.println(nombre1+nombre2+apellido1+apellido2+" Portador de Cedula Nro. "+cedula);
        System.out.println("telefono Nro: "+telefono+" Direccion: "+" Numero de Cuenta: "+numCuenta+" Pin: "+pin+"\n");
    }
    



}


