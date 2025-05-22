package clase;

public class ControlBilet {
    public void verificareFinalaBilet(IBiletMetrou bilet){
        System.out.println("Controlorul a verificat biletul ");
        bilet.validareBilet();
    }
}
