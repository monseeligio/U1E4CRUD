import java.util.Scanner;

public class U1E4CRUD {
    public static void main(String[] args) {
        Listas lis =new Listas();
     int opc2=0;
     int opc;
     Scanner LECTOR = new Scanner(System.in);
       do{ 
        System.out.println("\n-------Menu------");
        System.out.println("1. Insertar dato");
        System.out.println("2. Leer lista");
        System.out.println("3. Actualizar");
        System.out.println("4. Borrar elemento de la lista o lista completa");
        System.out.println("5. Salir del programa");
        System.out.println("¿Que desea realizar?");
        opc=LECTOR.nextInt();
        switch(opc){
            case 1:lis.insertar();break;
            case 2:lis.leer();break;
            case 3:lis.actualizar();break;
            case 4:lis.borrar();break;
            case 5: System.exit(0);break;
            default:System.out.println("No existe esa opcion, por favor intente de nuevo");
        }
        
          System.out.println("\n¿Desea realizar otro proceso? presione 1=SI    2=NO");
       opc2=LECTOR.nextInt();
       }while(opc2!=2); 
    }
    
}
