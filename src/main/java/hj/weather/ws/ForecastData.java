package hj.weather.ws;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by heiko on 28.12.14.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastData {

    private Main main;
    private Wind wind;
    private Clouds clouds;
    private String name;
    private String country;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ForecastData{" +
                "main=" + main +
                ", wind=" + wind +
                ", clouds=" + clouds +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
