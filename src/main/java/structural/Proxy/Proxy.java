package structural.Proxy;

public class Proxy implements WebSite{
    private  String url;
    private RealSite realSite;

    public Proxy(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(realSite == null){
           realSite = new
                   RealSite(url);
        }
       realSite.run();

    }
}
