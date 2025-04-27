import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        persona p1=new persona("Santy","Vargas",20);
                p1.mostrar();
    }
}
//Si creo sin constructor toca crear los campos por mi mismo aqui en el main, pero con el contructor solo
//lleno los campos