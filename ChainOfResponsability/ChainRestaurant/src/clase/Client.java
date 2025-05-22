package clase;

import java.util.StringJoiner;

public class Client {
    private boolean areNrTel;
    private boolean areEmail;
    private String nume;

    public Client(boolean areNrTel, boolean areEmail, String nume) {
        this.areNrTel = areNrTel;
        this.areEmail = areEmail;
        this.nume = nume;
    }

    public boolean isAreNrTel() {
        return areNrTel;
    }

    public void setAreNrTel(boolean areNrTel) {
        this.areNrTel = areNrTel;
    }

    public boolean isAreEmail() {
        return areEmail;
    }

    public void setAreEmail(boolean areEmail) {
        this.areEmail = areEmail;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Client.class.getSimpleName() + "[", "]")
                .add("areNrTel=" + areNrTel)
                .add("areEmail=" + areEmail)
                .add("nume='" + nume + "'")
                .toString();
    }
}
