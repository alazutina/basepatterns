package structural.Proxy;

public class RealSite implements WebSite{
    private  String url;

    public RealSite(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading project from "+url);
    }

    @Override
    public void run() {
System.out.println("Running project "+url);
    }
}
