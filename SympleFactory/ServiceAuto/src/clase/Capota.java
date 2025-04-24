package clase;

public class Capota implements IComponenta{
    private String culoare;
    private String tipMaterial;
    private boolean esteDetasabile;

     Capota(String culoare, String tipMaterial, boolean esteDetasabile) {
        this.culoare = culoare;
        this.tipMaterial = tipMaterial;
        this.esteDetasabile = esteDetasabile;
    }

    @Override
    public String getCuloareComponenta() {
        return culoare;
    }

    @Override
    public String tipMaterial() {
        return tipMaterial;
    }

    @Override
    public boolean esteDetasabila() {
        return esteDetasabile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Capota{");
        sb.append("culoare='").append(culoare).append('\'');
        sb.append(", tipMaterial='").append(tipMaterial).append('\'');
        sb.append(", esteDetasabile=").append(esteDetasabile);
        sb.append('}');
        return sb.toString();
    }
}
