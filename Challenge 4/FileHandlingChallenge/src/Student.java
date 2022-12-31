class Student {
    private String firstName;
    private String lastName;
    private String course;

    // constructor to initialize member variables
    public Student(String firstName, String lastName, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    // public member functions to access private member variables
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCourse() { return course; }

    public double getFinalAverage() {
        // Compute and return the student's final average based on stored grades
        return 0.0;
    }
}
