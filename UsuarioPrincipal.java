/**Universidad del Valle de Guatemala
30/09/2021
Grupo: 5
Proyecto 2 */

public class UsuarioPrincipal{


    private String nombre;
    private float peso;
    private float altura;
    private String diabetes;
    private int edad;
    
    public UsuarioPrincipal() {
        this.nombre = "";
        this.peso = 0;
        this.altura = 0;
        this.diabetes = "";
        this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String getDiabetes() {
        return diabetes;
    }
    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

}