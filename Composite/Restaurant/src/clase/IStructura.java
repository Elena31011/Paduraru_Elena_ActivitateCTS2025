package clase;

public interface IStructura  {
    //metode specifice
    void descriereStructura();

    //metode pentru frunze
    void adaugaNod(IStructura iStructura);
    void stergeNod(IStructura iStructura);
    IStructura getCopilNod(int index);
}
