
public class CalcController {
        //operazione (6262-2)/(1-1)
        //il risultato che da java è infinity, poichè prende il valore più vicino a zero
        //posso modificare il messaggio infinity con un errore ma non credo sia utile
    public static void main(String[] args) throws InterruptedException {
        Buffer v = new Buffer(10);
        int i = 0;//contatore che fa da indice
        CalcThread t1 = new CalcThread(6262,2,'-', v);
        CalcThread t2 = new CalcThread(1,1,'-', v);
        //a=i;
        t1.setI(i);
        //i++;
        i++;
        t2.setI(i);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        CalcThread t3 = new CalcThread(v.getValore(i-1), v.getValore(i),'/', v);
        i++;
        t3.setI(i);
        t3.start();
        t3.join();
        v.Stampa(i);



    }
}
