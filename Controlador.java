import java.util.Scanner;
public class Controlador {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Qué implementación de Stack desea usar? \n 1. ArrayList  \n 2. Vector \n 3. Lista Simplemente Encadenada \n. 4. Lista Doblemente Encadenada");
        int type = scan.nextInt();
        Calculator calculadora = new Calculator(type);
        Conversor convert = new Conversor(type);
        for(int i=0;i<convert.operaciones.count();i++){
            String op=convert.operaciones.pull();
            System.out.println("El resultado de: "+op+" Es: "+calculadora.Evaluate(op));
        }
    }
}
