class a extends Thread{
   public void run(){
        for(int i=0;i<=5;i++){

    System.out.println("thread start a="+i);
}
        System.out.println("thread a end ");
   }
}



class b extends Thread{
   public void run(){
        for(int i=0;i<=5;i++){
               if(i==1)
            try{
                sleep(1);
            }catch(Exception e){

            }
    System.out.println("thread start b="+i);
}
        System.out.println("thread b end ");
   }
}

class c extends Thread{
   public void run(){
        for(int i=0;i<=5;i++){
               if(i==1)
            try{
                sleep(1);
            }catch(Exception e){

            }
    System.out.println("thread start c="+i);
}
        System.out.println("thread c end ");
   }
}


class d extends Thread{
   public void run(){
        for(int i=0;i<=5;i++){
               if(i==1)
            try{
                sleep(1);
            }catch(Exception e){

            }
    System.out.println("thread start d="+i);
}
        System.out.println("thread d end ");
   }
}



class e extends Thread{
   public void run(){
        for(int i=0;i<=5;i++){
               if(i==1)
            try{
                sleep(1);
            }catch(Exception e){

            }
    System.out.println("thread start e="+i);
}
        System.out.println("thread e end ");
   }
}


public class sleepThread {
    public static void main(String[] args) {
        a threadA=new a();
        b threadB=new b();
        c threadC=new c();
        d threadD=new d();
        e threadE=new e();
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        threadE.start();
    }
}
