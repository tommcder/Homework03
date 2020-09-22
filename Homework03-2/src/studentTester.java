public class studentTester {
    public static void main(String[] args)
    {
        Student tommy = new Student("Tommy",90);
        System.out.println(tommy.getName());
        tommy.addQuiz(30);
        tommy.addQuiz(29);
        System.out.println(tommy.getAverageScore());
    }
}
