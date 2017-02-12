package modul03.task033;

/**
 * Created by MYKOLA.GOROKHOV on 08.02.2017.
 */
public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group, long secretKey, String email) {
        super(firstName, lastName, group);
        this.secretKey = secretKey;
        this.email = email;
    }

    public SpecialStudent(String lastName, Course[] coursesTaken, long secretKey, String email) {
        super(lastName, coursesTaken);
        this.secretKey = secretKey;
        this.email = email;
    }

    public SpecialStudent(long secretKey) {
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
