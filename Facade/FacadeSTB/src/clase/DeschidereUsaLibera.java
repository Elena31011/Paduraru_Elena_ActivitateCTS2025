package clase;

public class DeschidereUsaLibera {
    public boolean usaFDeschisaLib(Autobuz autobuz){
        return autobuz.getUsaF().length() % 2 == 0;
    }

public boolean usaMDeschisaLib(Autobuz autobuz){
        return autobuz.getUsaM().length() % 2 == 0;
    }

public boolean usaSDeschisaLib(Autobuz autobuz){
        return autobuz.getUsaS().length() % 2 == 0;
    }
}
