import java.util.Scanner;

public class AlumnoG{
  public String nombre;
  public int telefono, edad, nota1, nota2, nota3;
  
  AlumnoG{
    nombre = ""
    telefono = 123456789;
    edad = 0
    nota1 = (int)(10*Math.random());
    nota2 = (int)(10*Math.random());
    nota3 = (int)(10*Math.random());
  }
  public void AlumnoDatos(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nombre del aluno: ");
    nombre = sc.nextLine();
    System.out.println("Edad del aluno: ");
    edad = sc.nextInt();
    System.out.println("Teléfono del aluno: ");
    telefono = sc.nextInt();
  }
  public void AlumnoPrint(){
    System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nNota1: " + nota1 + "\nNota2: " + nota2 + "\nNota 3: " + nota3);
  }
  
}
