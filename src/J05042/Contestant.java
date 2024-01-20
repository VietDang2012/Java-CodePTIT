package J05042;

public class Contestant {
    private String name;
    private int correctAnswer, submit;

    public Contestant() {
    }

    public Contestant(String name, int correctAnswer, int submit) {
        this.name = name;
        this.correctAnswer = correctAnswer;
        this.submit = submit;
    }

    public String getName() {
        return name;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public int getSubmit() {
        return submit;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", name, correctAnswer, submit);
    }
}