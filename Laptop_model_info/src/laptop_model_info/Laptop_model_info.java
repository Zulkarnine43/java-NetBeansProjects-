
package laptop_model_info;

class Dell{
    public String size; 
    public String processor; 
    public String Ram; 
    public String cache;   
 public void Dell(){
 size ="15.60 inch";
 processor ="Intel CoreI3 6th Gen 6006U";
 Ram ="8gb";
 cache ="3Mb";
       System.out.println("DELL INFORMATION");
       System.out.println(size);
       System.out.println(processor);
       System.out.println(Ram);
       System.out.println(cache);
}
}

class HP extends Dell{
 public void HP(){
 size ="15.60 inch";
 processor ="Intel CoreI5 8250U";
 Ram ="8gb";
 cache ="3Mb";
       System.out.println("HP INFORMATION");
       System.out.println(size);
       System.out.println(processor);
       System.out.println(Ram);
       System.out.println(cache);
}
}

class Lenovo extends HP{
 public void Lenovo(){
 size ="15.60 inch";
 processor ="Intel CoreI7 6600U";
 Ram ="8gb";
 cache ="3Mb";
       System.out.println("LENOVO INFORMATION");
       System.out.println(size);
       System.out.println(processor);
       System.out.println(Ram);
       System.out.println(cache);
}
}

public class Laptop_model_info extends Lenovo {
    public static void main(String[] args) {
      Laptop_model_info l = new Laptop_model_info();
      l.Dell();
      l.HP();
      l.Lenovo();
    }
}    

