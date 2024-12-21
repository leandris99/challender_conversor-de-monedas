package Herramientas;

import com.ChallengeUnoBackend.modelos.Moneda;
import com.google.gson.Gson;

public class conversor {
    private String monedaBase;
    private String monedaCambio;
    private double cifraDeCambio;

    public Conversor(String monedaBase, String monedaCambio, double cifraDeCambio) {
        this.monedaBase = monedaBase;
        this.monedaCambio = monedaCambio;
        this.cifraDeCambio = cifraDeCambio;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaCambio() {
        return monedaCambio;
    }

    public double getCifraDeCambio() {
        return cifraDeCambio;
    }

    public double convertir(){
        Api api = new Api();
        Gson gson = new Gson();
        json = api.conexionApi(getMonedaBase().toUpperCase());
        Moneda moneda = gson.fromJson(json, Moneda.class);

        var tasaCambio = moneda.getRadiosConversion().get(getMonedaCambio().toUpperCase());

        return tasaCambio * getCifraDeCambio();
    }
}
