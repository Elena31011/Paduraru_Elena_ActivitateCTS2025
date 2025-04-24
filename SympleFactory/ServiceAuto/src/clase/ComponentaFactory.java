package clase;


public class ComponentaFactory {

public IComponenta getComponenta(EnumComponente componenteType, String culoare, String tip, boolean esteDetasabil){
    switch (componenteType){
        case USA -> {return new Usa(culoare, tip, esteDetasabil);}
        case CAPOTA -> {return new Capota(culoare, tip, esteDetasabil);}
        default -> {return null;}
    }
}

}
