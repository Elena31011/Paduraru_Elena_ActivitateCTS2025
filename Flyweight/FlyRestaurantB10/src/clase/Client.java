package clase;

import java.util.StringJoiner;

public class Client implements IClient{

    private String nume;
    private String email;

    public Client(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Client.class.getSimpleName() + "[", "]")
                .add("nume='" + nume + "'")
                .add("email='" + email + "'")
                .toString();
    }

    @Override
    public void afiseazaInformatii(Rezervare r) {
        System.out.println(r.toString());
    }
}
