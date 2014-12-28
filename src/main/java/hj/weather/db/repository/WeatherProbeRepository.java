package hj.weather.db.repository;

import hj.weather.db.entities.WeatherProbe;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by heiko on 27.12.14.
 */
public interface WeatherProbeRepository extends MongoRepository<WeatherProbe, String> {



}
