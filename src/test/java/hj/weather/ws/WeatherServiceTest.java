package hj.weather.ws;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WSConfig.class})
public class WeatherServiceTest {

    @Autowired
    WeatherService weatherService;

    @Test
    public void testGetForecast() {

        ForecastData data = weatherService.getForecast("de","Hamburg");

        System.out.println(data);

    }

}