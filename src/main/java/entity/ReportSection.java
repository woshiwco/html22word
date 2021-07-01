package entity;

public class ReportSection {
    private String firstTitle;
    private String secondTitle;
    private String content;

    public ReportSection(String firstTitle, String secondTitle, String content) {
        this.firstTitle = firstTitle;
        this.secondTitle = secondTitle;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ReportSection{" +
                "firstTitle='" + firstTitle + '\'' +
                ", secondTitle='" + secondTitle + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getFirstTitle() {
        return firstTitle;
    }

    public void setFirstTitle(String firstTitle) {
        this.firstTitle = firstTitle;
    }

    public String getSecondTitle() {
        return secondTitle;
    }

    public void setSecondTitle(String secondTitle) {
        this.secondTitle = secondTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
