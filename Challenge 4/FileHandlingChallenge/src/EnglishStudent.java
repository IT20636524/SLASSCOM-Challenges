class EnglishStudent extends Student {
    private int termPaper;
    private int midterm;
    private int finalExam;

    public EnglishStudent(String firstName, String lastName, int termPaper, int midterm, int finalExam) {
        super(firstName, lastName, "English");
        this.termPaper = termPaper;
        this.midterm = midterm;
        this.finalExam = finalExam;
    }

    public double getFinalAverage() {
        return (termPaper * 0.3 + midterm * 0.3 + finalExam * 0.4) / 3;
    }
}