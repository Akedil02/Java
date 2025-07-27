package Day0;

public class Student {
    private String  name;
    private float mathscore;
    private float javascore;
    private float englishscore;

    public String getName() {
        return name;
    }

    public float getMathscore() {
        return mathscore;
    }

    public float getJavascore() {
        return javascore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMathscore(float mathscore) {
        this.mathscore = mathscore;
    }

    public void setJavascore(float javascore) {
        this.javascore = javascore;
    }

    public void setEnglishscore(float englishscore) {
        this.englishscore = englishscore;
    }

    public float getEnglishscore() {
        return englishscore;
    }

    public float getAverage(){
        return (mathscore+javascore+englishscore)/3;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Gpa: " + getAverage();
    }

}
