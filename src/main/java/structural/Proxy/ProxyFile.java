package structural.proxy;

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
