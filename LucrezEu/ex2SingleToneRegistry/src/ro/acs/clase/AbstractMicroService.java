package ro.acs.clase;

public abstract class AbstractMicroService {
    protected String serviceName;
    protected  String  serviceURL;

    public AbstractMicroService(String serviceName, String serviceURL) {
        this.serviceName = serviceName;
        this.serviceURL = serviceURL;
    }
    public abstract void connect();
}
