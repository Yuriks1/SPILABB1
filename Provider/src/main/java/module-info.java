import org.labb1.provide.RankineTemperature;
import org.labb1.temperature.Temperature;
import org.labb1.provide.KelvinTemperature;
import org.labb1.provide.FahrenheitTemperature;

module org.labb1.provider {
    requires org.labb1.temperature;
    provides Temperature with KelvinTemperature, FahrenheitTemperature, RankineTemperature;
}
