package LAB2;
//the main is the model, it encapsulates data and provides methods to the accces
public class Main {
    private static final int noOfThreads=6;
    private static final int processorLoad=1000000;
    public static void main(String args[]){
        Window win=new Window(noOfThreads);
        for(int i =0; i<noOfThreads; i++){

            Fir fir=new Fir(i,i+2,win,processorLoad).start();
            fir.addObserver(win);
            Thread t= new Thread(fir);
            t.start();
        }
    }
}
