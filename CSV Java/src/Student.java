
    public class Student extends Human{

        private Course course;
        private final String group;

        public Student(String surnameName, String group){
            super(surnameName);
            this.group = group;
        }

        public void addCourse(Course course){
            this.course = course;
        }

        public String getFinalScores(){
            return "Итог\n" +
                    " Активности: " + course.getActivityScore() + " из " + course.getActivityMaxScore() +
                    "\n Упражнения: " + course.getTasksScore() + " из " + course.getTasksMaxScore() +
                    "\n Домашние работы: " + course.getHomeworkScore() + " из " + course.getHomeworkMaxScore() +
                    "\n Сем: " + course.getSemScore() + " из " + course.getSemMaxScore();
        }

        public String getResultModules(){
            var modules = course.getModules();
            var result = new StringBuilder();
            for(var i: modules)
                result.append(i);
            return result.toString();
        }


        public String toString() {
            return super.getSurnameName() + "\nГруппа: " + group;
        }
    }

