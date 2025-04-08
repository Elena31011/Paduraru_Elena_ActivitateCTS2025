package ro.acs.clase;

public class MeteoService extends AbstractMicroService{

    MeteoService(String serviceName, String serviceURL) {
        super(serviceName, serviceURL);
    }

    @Override
    public void connect() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MeteoService{");
        sb.append("serviceName='").append(serviceName).append('\'');
        sb.append(", serviceURL='").append(serviceURL).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
