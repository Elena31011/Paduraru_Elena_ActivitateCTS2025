package clase;

public interface ISectiune {
    void descriereSectiune();

    void adaugaNod(ISectiune iSectiune);
    void stergeNod(ISectiune iSectiune);
    ISectiune getCopilNod(int index);
}
