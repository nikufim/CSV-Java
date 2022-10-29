import java.util.ArrayList;

public class Course {
    private final ArrayList<Module> modules = new ArrayList<>();
    private final float activityMaxScore;

    private final float tasksMaxScore;
    private final float homeworkMaxScore;
    private final float semMaxScore;

    public Course(float activityMaxScore, float tasksMaxScore, float homeworkMaxScore, float semMaxScore){
        this.activityMaxScore = activityMaxScore;
        this.tasksMaxScore = tasksMaxScore;
        this.homeworkMaxScore = homeworkMaxScore;
        this.semMaxScore = semMaxScore;
    }

    public void addModule(Module module){
        modules.add(module);
    }

    public float getTasksMaxScore(){
        return tasksMaxScore;
    }

    public float getHomeworkMaxScore(){
        return homeworkMaxScore;
    }

    public float getActivityMaxScore(){
        return activityMaxScore;
    }

    public float getSemMaxScore(){
        return semMaxScore;
    }

    public ArrayList<Module> getModules(){
        return modules;
    }

    public float getTasksScore(){
        var score = 0f;
        for(var i: modules)
            score += i.getTasksScore();
        return score;
    }

    public float getHomeworkScore(){
        var score = 0f;
        for(var i: modules)
            score += i.getHomeworkScore();
        return score;
    }

    public float getActivityScore(){
        var score = 0f;
        for(var i: modules)
            score += i.getActivityScore();
        return score;
    }

    public float getSemScore(){
        var score = 0f;
        for(var i: modules)
            score += i.getSemScore();
        return score;
    }

}