package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        AbstractRecomandareTransport troleibuz = new RecomandareTroleibuz();
        AbstractRecomandareTransport autobuz = new RecomandaAutobuz();
        AbstractRecomandareTransport tramvai = new RecomandaTramvai();
        AbstractRecomandareTransport metroul = new RecomandaMetroul();

        troleibuz.setUrmatorul(autobuz);
        autobuz.setUrmatorul(tramvai);
        tramvai.setUrmatorul(metroul);

        troleibuz.recomanda(11);
    }
}
