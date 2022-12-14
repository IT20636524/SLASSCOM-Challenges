class MathStudent extends Student {
    private int[] quizzes;
    private int test1;
    private int test2;
    private int finalExam;

    public MathStudent(String firstName, String lastName, int[] quizzes, int test1, int test2, int finalExam) {
        super(firstName, lastName, "Math");
        this.quizzes = quizzes;
        this.test1 = test1;
        this.test2 = test2;
        this.finalExam = finalExam;
    }

    @Override
    public double getFinalAverage() {
        double quizAverage = 0;
        for (int quiz : quizzes) {
            quizAverage += quiz;
        }
        quizAverage /= quizzes.length;

        return (quizAverage * 0.15 + test1 * 0.3 + test2 * 0.2 + finalExam * 0.35) / 3;
    }

    @Override
    public int getFinalExamGrade() {
        double sum=0.0;
        for(int i=0; i<5; i++){
            sum+=quizzes[i];
        }
        double quizAverage = sum / 5.0;
        return (int) ((0.15 * quizAverage) + (0.3 * test1) + (0.2 * test2) + (0.35 * finalExam));
    }
}