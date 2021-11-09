package backend.unidad2;

import java.util.Scanner;

public class BackendUnidad2 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        String hobby;
        String editor;
        String sOperativo;
        
        System.out.println("Ingrese su nombre: ");
        nombre = s.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = s.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = s.nextInt();
        s.nextLine();
        System.out.println("Ingrese su hobby: ");
        hobby = s.nextLine();
        System.out.println("Ingrese su editor de código preferido: ");
        editor = s.nextLine();
        System.out.println("Ingrese su sistema operativo: ");
        sOperativo = s.nextLine();
        
        System.out.println("-------------------");
        System.out.println("Su nombre completo es " + nombre + " " + apellido + ".");
        System.out.println("Ud. tiene " + edad + " años.");
        System.out.println("Su hobby es " + hobby + ".");
        System.out.println("Su editor de código preferido es " + editor + " y su sistema operativo es " + sOperativo + ".");
    }
    
}
