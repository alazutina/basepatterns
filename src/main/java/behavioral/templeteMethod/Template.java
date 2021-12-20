package behavioral.templeteMethod;


public abstract class Template {
    public void showPage(){
        System.out.println("Wellcome!");
        showName();
        System.out.println(", we glad to see you");
    }

    public abstract void showName();
}

