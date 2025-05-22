package clase;

public class DeschidereUsaFortata {

    public boolean usaFDeschisaFortata(Autobuz autobuz){
        return autobuz.getUsaF().length() % 2 == 0;
    }

    public boolean usaMDeschisaFortata(Autobuz autobuz){
        return autobuz.getUsaM().length() % 2 == 0;
    }

    public boolean usaSDeschisaFortata(Autobuz autobuz){
        return autobuz.getUsaS().length() % 2 == 0;
    }
}

