package clase;

public interface IStructura {
    void descriereStruct();

    void adaugaNod(IStructura iStructura);
    void stergereNod(IStructura iStructura);
    IStructura getCopilNod(int index);
}
