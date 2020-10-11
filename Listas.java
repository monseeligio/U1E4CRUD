
package u1e4crud;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Listas {
List<String> lista = new ArrayList<String>();
int opc2;
Scanner lector = new Scanner(System.in);
    public void insertar(){
        do{
        Scanner lector = new Scanner(System.in);
        System.out.println("INGRESE EL DATO QUE DESEA INSERTAR");
        String dato;
        dato= lector.nextLine();
        lista.add(dato);
       System.out.println("\n¿desea realizar insertar otro dato?, presione 1=SI    2=NO");
       opc2=lector.nextInt();
       }while(opc2!=2); 
    }
    
    
    public void leer(){
        if(lista.isEmpty()){
            System.out.println("LISTA VACIA, DEBES INGRESAR DATOS"); }
     else{
        System.out.println("\n--------LISTA----------\n");
        for (int i = 0; i <= lista.size() - 1; i++) {
            System.out.println(i+"."+lista.get(i));
        }  
      }
    }
    
    
        public void actualizar(){
        if(lista.isEmpty()){
        System.out.println("LISTA VACIA, DEBES INGRESAR DATOS"); }
        
        else{
        System.out.println("\n--------LISTA----------\n");
        for (int i = 0; i <= lista.size() - 1; i++) {
            System.out.println(i+"."+lista.get(i));
        }
        try{
        System.out.println("\n¿Que dato desea modificar?");
        int dato1;
        dato1= lector.nextInt();
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su nuevo dato");
        String dato2;
        dato2= lector.nextLine();
        lista.set(dato1,dato2);
        System.out.println("\n--------LISTA MODIFICADA----------\n");
         for (int i = 0; i <= lista.size() - 1; i++) {
            System.out.println(i+"."+lista.get(i));
        }
        }
        catch(Exception e){
            System.out.println("No existe ese dato, no se pudo realizar la modificacion");
        }
     } 
        }
       
        
        public void borrar(){
        if(lista.isEmpty()){
        System.out.println("LISTA VACIA, DEBES INGRESAR DATOS"); 
         }
            
       else{
       System.out.println("\n--------LISTA----------\n");
        for (int i = 0; i <= lista.size() - 1; i++) {
       System.out.println(i+"."+lista.get(i));}
       System.out.println("\n¿Desea borrar alguna la lista o solo un elemento?\n Presione 1 para toda la lista\n Presione 2 para solo un elemento ");
       
       int opc;
        Scanner lector = new Scanner(System.in);
        opc= lector.nextInt();
        if (opc==2){
        try{ 
        System.out.println("\n¿Que dato desea eliminar?");
        int dato; 
        dato= lector.nextInt();
        lista.remove(dato);
        System.out.println("Dato eliminado con exito");
        System.out.println("\n--------LISTA MODIFICADA----------\n");
        for (int i = 0; i <= lista.size() - 1; i++) {
            System.out.println(i+"."+lista.get(i));
        }
        }
        catch(Exception e){
            System.out.println("No existe ese dato");
        }
        }
        else {
            lista.clear();
            System.out.println("Se elimino la lista con exito");
        }
        }
     
        
    }
    

}
