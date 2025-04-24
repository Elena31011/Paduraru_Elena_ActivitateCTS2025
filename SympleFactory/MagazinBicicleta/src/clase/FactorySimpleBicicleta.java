package clase;

public class FactorySimpleBicicleta {
    public IBicicleta getBicicleta(EnumBicicleta enumBicicleta, String tip, double diametru, String tipFrana, boolean areCasca, boolean areOchelari){
     switch (enumBicicleta){
         case TREKKING -> {
             return new Trekking(tip, diametru, tipFrana, areCasca, areOchelari);
         }
         case MTB -> {
             return new MTB(tip, diametru, tipFrana, areCasca, areOchelari);
         }
         case ELECTRICA -> {
             return new Electrica(tip, diametru, tipFrana, areCasca, areOchelari);
         }
     }
     return null;
    }
}
