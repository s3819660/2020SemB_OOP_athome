package Model;

import java.io.Serializable;

public class Journal extends Item implements Serializable {
    private String ISSN;

    public Journal() {
    }

    public Journal(String type, String title, String publication, String year, String language, String subject, int total, String ISSN) {
        super(type, title, publication, year, language, subject, total);
        this.ISSN = ISSN;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    @Override
    public String toString() {
        return "Model.Journal{" +
                "ISSN='" + ISSN + '\'' +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", publication='" + publication + '\'' +
                ", year=" + year +
                ", language='" + language + '\'' +
                ", subject='" + subject + '\'' +
                ", total=" + total +
                ", onLoan=" + onLoan +
                '}';
    }
}
