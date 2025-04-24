package clase;

import java.util.HashMap;
import java.util.Map;

public class ProtoypeFisaPacient {
  private static Map<String , FisaPacient> map = new HashMap<>();

  static {
      Pacient p1 = new Pacient("Ana", 20, "au");
      Pacient p2 = new Pacient("Anica", 21, "amu");

      map.put(p1.getAfectiunePrincipala(), new FisaPacient(p1, 2));
      map.put(p2.getAfectiunePrincipala(), new FisaPacient(p2, 4));
  }

  public static FisaPacient getFP(String cheie)
  {
      if(map.containsKey(cheie)){
          return map.get(cheie);
      }
      else throw new RuntimeException("nup");
  }

}
