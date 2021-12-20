package behavioral.Observer;

public class JobSearch {
    public static void main(String[] args){
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java position");
Observer firstObserver = new Subscriber("Ivan Ivanov");
Observer secondObserver = new Subscriber("Petr Petrov");

jobSite.addObserver(firstObserver);
jobSite.addObserver(secondObserver);

jobSite.addVacancy("Third Java Position");

        jobSite.addVacancy("Fourth Java Position");

   jobSite.removeVacance("Third Java Position");
    }
}
