public class Buffer {

    private float v[];


    public Buffer(int dim){
        v = new float[dim];
    }

    public void inserisci(float risultato, int i){
        v[i] = risultato;
    }

    public int length(){
        return v.length;
    }

    public void Stampa(int i){

        System.out.println("Il risultato è " + v[i]);
    }

    public float getValore(int i){
        return v[i];
    }


}
