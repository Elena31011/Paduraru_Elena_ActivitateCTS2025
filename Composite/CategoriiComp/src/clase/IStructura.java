package clase;

public interface IStructura {
    void descriereStructura();

    void adaugaNod(IStructura iStructura);
    void stergeNod(IStructura iStructura);

    IStructura getCopilNod(int index);
}
