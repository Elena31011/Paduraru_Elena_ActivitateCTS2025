package clase;

public interface ISectiune {
    void descriereSectiune();

    void adaugaNod(ISectiune iSectiune);
    void stergereNod(ISectiune iSectiune);
    ISectiune getCopilNod(int index);


}
