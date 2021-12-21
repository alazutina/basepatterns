package structural.proxy;

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
