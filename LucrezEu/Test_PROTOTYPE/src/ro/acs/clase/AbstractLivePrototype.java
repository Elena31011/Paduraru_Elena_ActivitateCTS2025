package ro.acs.clase;

public abstract class AbstractLivePrototype implements ILive,Cloneable{

    @Override
    public AbstractLivePrototype clone() {
        try {
            return (AbstractLivePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("NU MERGE");
        }
    }
}
