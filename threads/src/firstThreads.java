class A extends Thread{
   public void run(){
        for(int i=0;i<=5;i++){
    System.out.println("thread start A="+i);
}
        System.out.println("thread A end ");
   }
}




class B extends Thread{
   public void run(){
        for(int i=0;i<=5;i++){
    System.out.println("thread start B="+i);
}
        System.out.println("thread B end ");
   }
}
public class firstThreads {
    public static void main(String[] args) {
        A threadA=new A();
        B threadB=new B();
        threadA.start();
        threadB.start();
    }
}
