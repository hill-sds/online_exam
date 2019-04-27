package top.sdszhq.pojo;

//试题类
public class Question {
    private int id;//编号
    private String question;//题目
    private String answer;//答案
    private String optionA;//密码
    private String optionB;//
    private String optionC;//
    private String optionD;//
    private String subject;//所属科目
    private String person;//出题人



    public Question() {
    }

    public Question(String question, String answer, String optionA, String optionB, String optionC, String optionD, String subject, String person) {
        this.question = question;
        this.answer = answer;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.subject = subject;
        this.person = person;
    }

    public Question(int id, String question, String answer, String optionA, String optionB, String optionC, String optionD, String subject, String person) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.subject = subject;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public String getSubject() {
        return subject;
    }

    public String getPerson() {
        return person;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", optionA='" + optionA + '\'' +
                ", optionB='" + optionB + '\'' +
                ", optionC='" + optionC + '\'' +
                ", optionD='" + optionD + '\'' +
                ", subject='" + subject + '\'' +
                ", person='" + person + '\'' +
                '}';
    }
}
