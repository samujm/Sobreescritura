package domain;
//--------------------------------------------------------------《 SOBREESCRITURA 》------------------------------------------------------------------------------------
//----------- ▀ Se aplica en herencia, ya que significa que un metodo en la clase hija modifica el comportamiento de la clase padre, es decir que lo sobreescribe -------------------
public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String obtenerDetalles(){
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
}
