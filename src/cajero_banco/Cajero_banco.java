

package cajero_banco;
import java.util.Scanner;   
       
public class Cajero_banco {
    int identificador;
    String cliente;
    int pin;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    public Cajero_banco(int id){
        identificador = id;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
    public static void main(String[] args) {
                  
         
        // la muestra la hare con 4 personas. 
         cliente c1 = new cliente("Jose","Luis","Perez","Marcano","5299938","83254579","Heredia","905871",9002);
         cliente c2 = new cliente("Ana","Maria","Rodriguez","Iturbe","67432189","70108779","Escazu","905991",4445);
         cliente c3 = new cliente("Nestor","Luis","Gonzalez","Quiros","43766909","87194737","Alajuea","906001",1234);
         cliente c4 = new cliente("Andrea","Isabel","Izquierdo","Velez","5299938","83254579","Heredia","905987",5550);
         // mostrare los datos de los 4 clientes del banco
         c1.mostrarEstado();
         c2.mostrarEstado();
         c3.mostrarEstado();
         c4.mostrarEstado();
         
        System.out.println("\n" + "Introduzca su PIN: ");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        
        if(pin == 9002)
         {
            System.out.println("Cuenta Cliente #905871 ");  
         }
         else if(pin == 4445)
             {
            System.out.println(c2);
             }
         
         else if(pin == 1234)
             {
             System.out.println(c3);
             }     
         
         else if(pin == 5550)
             {
             System.out.println(c4);
             }    
        
         else
         {
         System.out.println("Clave Incorrecta");
         }
        
        
        
       
        
         
    }
    
}
