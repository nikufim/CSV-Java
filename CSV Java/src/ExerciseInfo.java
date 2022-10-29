public class ExerciseInfo {
        private final String exerciseName;
        private final float maxScore;
        private final float pointsScored;

        public ExerciseInfo(String taskName, float maxScore, float pointsScored){
            this.exerciseName = taskName;
            this.maxScore = maxScore;
            this.pointsScored = pointsScored;
        }

        public String getExerciseName(){ return exerciseName; }
        public float getMaxScore(){ return maxScore; }
        public float getPointsScored(){ return pointsScored; }
    }

