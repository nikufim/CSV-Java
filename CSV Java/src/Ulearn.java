import java.util.ArrayList;

public class Ulearn {
    private final String moduleName;
    private final float tasksMaxScore;
    private final float homeworkMaxScore;
    private final float activityMaxScore;
    private final float activityScore;
    private final float semMaxScore;
    private final float semScore;

    private final ArrayList<ExerciseInfo> tasks = new ArrayList<>();
    private final ArrayList<ExerciseInfo> homeworks = new ArrayList<>();

    public Ulearn(String moduleName, float exercisesMaxScore,
                  float homeworkMaxScore, float activityMaxScore,
                  float semMaxScore, float activityScore, float semScore) {
        this.moduleName = moduleName;
        this.tasksMaxScore = exercisesMaxScore;
        this.homeworkMaxScore = homeworkMaxScore;
        this.activityMaxScore = activityMaxScore;
        this.activityScore = activityScore;
        this.semMaxScore = semMaxScore;
        this.semScore = semScore;
    }

    public String getModuleName(){
        return moduleName;
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
    public float getActivityScore(){
        return activityScore;
    }

    public float getHomeworkScore(){
        var score = 0f;
        for(var i: homeworks)
            score += i.getPointsScored();
        return score;
    }

    public float getTasksScore(){
        var score = 0f;
        for(var i: tasks)
            score += i.getPointsScored();
        return score;
    }

    public float getSemScore(){
        return semScore;
    }

    public float getSemMaxScore(){
        return semMaxScore;
    }

    public ArrayList<ExerciseInfo> getTasks(){
        return tasks;
    }

    public ArrayList<ExerciseInfo> getHomeworks(){
        return homeworks;
    }

    public void addExercise(ExerciseInfo exercise){
        tasks.add(exercise);
    }

    public void addHomework(ExerciseInfo exercise){
        homeworks.add(exercise);
    }

    public String toString(){
        return "Модуль: " + getModuleName() +
                "\n Активности: " + getActivityScore() + " из " + getActivityMaxScore() +
                "\n Упражнения: " + getTasksScore() + " из " + getTasksMaxScore() +
                "\n Домание работы: " + getHomeworkScore() + " из " + getHomeworkMaxScore() +
                "\n Сем: " + getActivityScore() + " из " + getActivityMaxScore() + "\n\n";

    }
}

