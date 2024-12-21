package Modelos;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class monedas {

    @SerializedName("base_code")
    private String codigoMoneda;

    @SerializedName("conversion_rates")
    private Map<String, Double> radiosConversion = new HashMap<>();

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public Map<String, Double> getRadiosConversion() {
        return radiosConversion;
    }
}
