package mx.com.prueba;


public class Persona {
   private String nombre;
   private String ap_Pat;
   private String ap_Mat;
   
   public void setNombre(String nombre){
	   this.nombre=nombre;
   }
   public String getNombre(){
	   return nombre;
   }
   public void setAp_Pat(String ap_Pat){
	   this.ap_Pat=ap_Pat;
   }
   public String getAp_Pat(){
	   return ap_Pat;
   }
   public void setAp_Mat(String ap_Mat){
	   this.ap_Mat=ap_Mat;
   }
   public String getAp_Mat(){
	   return ap_Mat;
   }
   public Persona(){
	   
   }
   public Persona(String nombre){
	   this.nombre=nombre;
   }
   public Persona(String nombre, String ap_Pat){
	   this.nombre=nombre;
	   this.ap_Pat=ap_Pat;
   }
   public Persona(String nombre, String ap_Pat, String ap_Mat){
	   this.nombre=nombre;
	   this.ap_Pat=ap_Pat;
	   this.ap_Mat=ap_Mat;
   }
   public void comparaPersonaEquals(Persona p1, Persona p2){
	   if (p1.equals(p2)){
		   System.out.println("Personas iguales");
	   }else{
		   System.out.println("Personas diferentes");
	   }
   }
}
