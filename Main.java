import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        persona p1=new persona();
        p1.nombre="santy";
        p1.apellido="santy";
        p1.edad=30;
        p1.mostrar();
    }
}
//Si no creo el constructor me toca en el main escribir y llenar cada cosa,
// lo cual si lo creo solo lleno los campos y llamo al void para que ejecute la accion