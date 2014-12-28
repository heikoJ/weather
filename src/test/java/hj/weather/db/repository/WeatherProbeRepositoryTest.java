package hj.weather.db.repository;

import hj.weather.db.MongoDatabaseConfig;
import hj.weather.db.entities.WeatherProbe;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MongoDatabaseConfig.class)
public class WeatherProbeRepositoryTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Autowired
    private WeatherProbeRepository repository;

    @Test
    public void testCreateProbe() {
        WeatherProbe probe = new WeatherProbe();
        probe.setTemperature(10.2d);
        probe.setHumidity(3.4d);
        repository.save(probe);
        String id = probe.getId();

        Assert.assertNotNull(id);


        probe = repository.findOne(id);

        Assert.assertNotNull(probe);

        System.out.println(probe);

    }


}