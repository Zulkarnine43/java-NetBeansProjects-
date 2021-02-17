
class a extends Thread{
   public void run(){
        for(int i=0;i<=5;i++){
         
    System.out.println("thread start a="+i);
}
        System.out.println("thread a end ");
   }
}

class d extends Thread{
   public void run(){
        for(int i=0;i<=5;i++){
    System.out.println("thread start d="+i);
}
        System.out.println("thread d end ");
   }
}
public class setGetThread {
    public static void main(String[] args) {
                a threadA=new a();
                d threadB=new d();
                

                threadA.setPriority(Thread.MIN_PRIORITY);
//                threadB.setPriority(threadA.getPriority()+1);
                  threadB.setPriority(Thread.MAX_PRIORITY);
            threadA.start();
            threadB.start();
            
    }
    }

