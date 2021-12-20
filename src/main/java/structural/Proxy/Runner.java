package structural.Proxy;

public class Runner {
    public static void main(String [] args){
        WebSite site = new Proxy("google.com");

     site.run();
    }
}
