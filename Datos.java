/**
Universidad del Valle de Guatemala
 */
import java.util.ArrayList;


public class Datos {
    ArrayList<Alimentos> alimento = new ArrayList<>();

    public ArrayList<Alimentos> getAlimento() {
        return alimento;
    }

    public void setAlimento(ArrayList<Alimentos> alimento) {
        this.alimento = alimento;
    }
    

    public void registroAlimento(String alimentos, Double azucar){
        
        Alimentos a = new Alimentos();
        a.setAlimentos(alimentos);
        a.setAzucar(azucar);

        alimento.add(a);
    }
}