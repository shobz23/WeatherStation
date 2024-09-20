import java.util.Observer;

public class DisplayDevice implements Observer  {
    private WeatherStation weatherStation;

    public DisplayDevice(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Temperature updated to: " + weatherStation.getTemperature());
    }
}

