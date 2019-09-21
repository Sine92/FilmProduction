package za.ac.cput.projects.Controller.ProductionController;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.projects.Domain.Production.FirstAD;
import za.ac.cput.projects.Factories.ProductionFactories.FirstADFactory;

import static org.junit.Assert.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class FirstADControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/FirstAD";

    @Before
    public void setUp() throws Exception {
    }

    @Test(expected = NullPointerException.class)
    public void create() {
        FirstAD firstAD = FirstADFactory.createFD("TEmba","5225",250.0);

        ResponseEntity<FirstAD> postResponse = restTemplate.postForEntity(baseURL +"/create", firstAD,FirstAD.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = NullPointerException.class)
    public void update() {

        String id = "Temba";
        FirstAD firstAD = restTemplate.getForObject(baseURL +"/firstAD/"+id,FirstAD.class);
        restTemplate.put(baseURL +"/FirstAD/" + id,firstAD );
        FirstAD updatedFAD= restTemplate.getForObject(baseURL +"/FirstAD/" + id, FirstAD.class);
        assertNotNull(updatedFAD);

    }

    @Test(expected = NullPointerException.class)
    public void delete() {
        String id = "Percry";
        FirstAD firstAD = restTemplate.getForObject(baseURL + "/firstAD/"+id,FirstAD.class);
        assertNotNull(firstAD);
        restTemplate.delete(baseURL+"/FirstAD/"+id);
        try{
            firstAD = restTemplate.getForObject(baseURL+"/firstAD/"+id , FirstAD.class);

        }catch(final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void read() {
    }

    @Test(expected = NullPointerException.class)
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",HttpMethod.GET,entity,String.class);
        assertNotNull(response.getBody());

    }
}