public class Ejercicios {
    private int caminar;
    private int JumpingJacks;
    private int Despechadas;
    private int Abdominales;
    private int Sentadillas;

    public Ejercicios(){
        this.caminar = 0;
        this.JumpingJacks = 0;
        this.Despechadas = 0;
        this.Abdominales = 0;
        this.Sentadillas = 0;
        }



    public int getCaminar() {
        return caminar;
    }
    public void setCaminar(int caminar) {
        this.caminar = caminar;
    }
    public int getJumpingJacks() {
        return JumpingJacks;
    }
    public void setJumpingJacks(int jumpingJacks) {
        JumpingJacks = jumpingJacks;
    }
    public int getDespechadas() {
        return Despechadas;
    }
    public void setDespechadas(int despechadas) {
        Despechadas = despechadas;
    }
    public int getAbdominales() {
        return Abdominales;
    }
    public void setAbdominales(int abdominales) {
        Abdominales = abdominales;
    }
    public int getSentadillas() {
        return Sentadillas;
    }
    public void setSentadillas(int sentadillas) {
        Sentadillas = sentadillas;
    }
   
    
}