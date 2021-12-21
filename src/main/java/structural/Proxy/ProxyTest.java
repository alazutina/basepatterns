package structural.proxy;

interface File {
    void show();
}
class RealFile implements File {
    private String file;
    public RealFile(String file){
        this.file = file;
        load(file);
    }
    private void load(String file){
        System.out.println("Load " + file);
    }
    public void show() {
        System.out.println("Display " + file);
    }
}
class ProxyFile implements File {
    private String file;
    private RealFile proxyFile;
    public ProxyFile(String file){
        this.file = file;
    }
    public void show() {
        if(proxyFile == null){
            proxyFile = new RealFile(file);
        }
        proxyFile.show();
    }
}

public class ProxyTest {//тест
    public static void main(String[] args) {
    File file = new ProxyFile("File.java");
        file.show();
        file.show();
    }
}
