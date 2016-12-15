public class ThreadInterleaving{
    public static void main(String[] args){

    MyThread h = new MyThread();

    Thread t1 = new Thread(h);
    Thread t2 = new Thread(h);
    Thread t3 = new Thread(h);

    t1.start();
    t2.start();
    t3.start();

    }
}

class MyThread implements Runnable{
    public static int turn;

    @Override
    public void run(){
        for(int i =0;i<3;i++){
            synchronized(this){
                if(turn == 0){
                    System.out.print("A");
                    turn =1 ;
                    notify();
                }else{
                    try{
                        wait();
                    }catch(InterruptedException ie){

                    }
                }

                if(turn == 1){
                    System.out.print("B");
                    turn = 2;
                    notify();
                }else{
                    try{
                        wait();
                    }catch(InterruptedException ie){

                    }
                }

                if(turn == 2){
                    System.out.print("C ");
                    turn = 0;
                    notify();
                }else{
                    try{
                        wait();
                    }catch(InterruptedException ie){        

                    }
                }
            }
        }
    }
}