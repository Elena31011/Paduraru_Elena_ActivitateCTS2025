package clase;

public abstract class AMeniu {
    public abstract void descriereMeniu();
    public abstract void adaugaNod(AMeniu item);
    public abstract void stergeNod(AMeniu item);
    public abstract AMeniu getNodCopil(int index);
}
