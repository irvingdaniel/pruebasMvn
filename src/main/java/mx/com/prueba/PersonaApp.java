package mx.com.prueba;


public class PersonaApp {
    static Persona persona1;
    static Persona persona2;
    static Persona persona3;
    static Persona persona4;
    
	public static void main(String[] args){
	   persona1 = persona2;
	   persona1= new Persona();
	   persona3 = new Persona();
	   persona3.comparaPersonaEquals(persona1, persona2);
	   
	   String nombre1="Juan";
	   String nombre2="Pedro";
	   
	   System.out.println(nombre1==nombre2);
	   System.out.println(nombre1.equals(nombre2));
   	   
	}
}
