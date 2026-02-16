import java.util.Scanner;

public class AppArrayAlumno{
  public static void main(String[] args){
  String[][] arrayAlumnos;
  int nAlumnos = 0, media = 0, mayor = 0;
  
  System.out.println("No de alumnos de la asignatura: ");
  nAlumnos = sc.nextInt();
  arrayAlumnos = new String[nAlumnos][2];
  
  for(int i = 0; i < arrayAlumnos.length; i++){
    String nota = "";
    AlumnoG i = new AlumnoG;
    i.DATOS();
    nota = "" + i.media;
    arrayAlumnos[i][0] = i.nombre;
    arrayAlumnos[i][1] = nota; 
    media += i.media;
  }
  
  media = (int)(media / nAlumnos);
  
  System.out.println("La media redondeada de los alumnos de la asignatura es: " + media);
  
  System.out.println("Alumnos con nota superior a la media: );
  for(int i = 0; i < attayAlumnos.length; i++){
    if(i.media > media){
      System.out.println(i.nombre + i.media);
      if(i.media > mayor)
        mayor = i;
    }
   }
   System.out.println("El alumno con la mayor nota es: " + arrayAlumnos[mayor][0] + "con una nota de " + arrayAlumnos[mayor][1]);
  }
}
