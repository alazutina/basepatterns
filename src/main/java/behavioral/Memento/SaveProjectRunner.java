package behavioral.Memento;

public class SaveProjectRunner {

    public static void main(String [] args){
        Project project = new Project();
        GithubRepo github = new GithubRepo();


        System.out.println("Creating new project. version 1.0" );
        project.setVersionAndDate("version 1.0");

        System.out.println(project);

        System.out.println("Saving current version ");

        github.setSave(project.save());
try {
    Thread.sleep(5000);
}catch (InterruptedException e){ }
        System.out.println("Version 1.1");

        project.setVersionAndDate("version 1.1");

        System.out.println(project);

        project.load(github.getSave());

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){ }

        System.out.println(project);
    }

}
