
package cajero_banco;

public class cuenta {
    private String numCuenta;
    private double montoDep;
    private double montoRet;
    private double saldoTotal;
    private double cierre = montoRet = saldoTotal;
    
     //Constructor para clase cuenta 
    public cuenta(String nc, double dep, double ret, double st, double close){
        numCuenta = nc;
        montoDep = dep;
        montoRet = ret;
        saldoTotal = st;
        cierre = close;
    }
    
    //get y set de las variables de la clase cuenta
    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getMontoDep() {
        return montoDep;
    }

    public void setMontoDep(double montoDep) {
        this.montoDep = montoDep;
    }

    public double getMontoRet() {
        return montoRet;
    }

    public void setMontoRet(double montoRet) {
        this.montoRet = montoRet;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getCierre() {
        return cierre;
    }

    public void setCierre(double cierre) {
        this.cierre = cierre;
    }
    
  
    
}

