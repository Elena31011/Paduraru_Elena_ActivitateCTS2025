package clase;

public class FactorySupa {
   public ISupe getSupe(EnumSupa enumSupa, String nume, int cantitate){
       switch (enumSupa){
           case SUPACIUPERCI -> {
               return new SupaCiuperci("ciup", 2);
           }
           case SUPALEGUME -> {
               return new SupaLegume("sjdn", 20);
           }

           case SUPAVITA -> {
               return new SupaVita("ce", 30);
           }
       }
       return null;
   }
}
