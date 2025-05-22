package clase;

public class Facade {
    public String verificareMasa(Masa masa){
        Ospatar ospatar = new Ospatar();
        Picolo picolo =new Picolo();
        if(masa.isEsteLibera()){
            if(picolo.esteDebarasata(masa)){
                if(ospatar.EsteAranjata(masa)){
                    return "Luati loc la masa cu nr "+masa.getNrMasa();
                }
                else {
                    return "Masa cu nr"+masa.getNrMasa()+" nu e aranjata";
                }
            }
            else {
                return "Masa cu nr"+masa.getNrMasa()+" nu e debarasata";
            }
        }
        else {
            return "Masa cu nr "+masa.getNrMasa()+" nu e libera";
        }
    }
}
