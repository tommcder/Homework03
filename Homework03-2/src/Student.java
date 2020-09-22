public class Student {
    private String name;
    private int score;
    private int totalScore;
    private int index;

    public Student(String name, int score)
    {
        this.name = name;
        this.score = score;
        index++;
        totalScore += this.score;
    }

    public String getName()
    {
        return name;
    }

    public void addQuiz(int score)
    {
        index++;
        totalScore = score+totalScore;
    }

    public double getAverageScore()
    {
        double average = totalScore/index;
        return average;
    }
}
