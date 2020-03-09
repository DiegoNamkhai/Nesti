
public class CalcThread<semaphore> extends Thread {

    private float a;
    private float b;
    private float risultato;
    private char operazione;
    private Buffer v;
    private int i;

    public CalcThread(float a, float b, char operazione, Buffer v) {
        this.a = a;
        this.b = b;
        this.operazione = operazione;
        this.v = new Buffer(v.length());
        this.v = v;
    }

    public void setI(int i){
        this.i = i;
    }


    public void run(){
        switch (operazione){
            case '+' :
                risultato = a+b;
                break;
            case '-' :
                risultato = a-b;
                break;
            case '*' :
                risultato = a*b;
                break;
            case '/' :
                risultato = a/b;
                break;
        }
        v.inserisci(risultato, i);

    }


}
