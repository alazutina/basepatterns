package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Lessons implements Observed{

    List<String> lessons = new ArrayList<>();
List<Observer> students = new ArrayList<>();

public void addLesson(String lesson){
    this.lessons.add(lesson);

    notifyObserver();
}

public void  removeLesson(String lesson){
    this.lessons.remove(lesson);
    notifyObserver();
}


    @Override
    public void addObserver(Observer observer) {
this.students.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
this.students.remove(observer);
    }

    @Override
    public void notifyObserver() {
    for(Observer observer: students ){

            observer.newInLessons(this.lessons);
    }
    }
}
