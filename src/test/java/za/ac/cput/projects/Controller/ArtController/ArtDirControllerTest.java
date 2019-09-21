package za.ac.cput.projects.Controller.ArtController;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.projects.Domain.Art.ArtDirector;
import za.ac.cput.projects.Factories.ArtFactories.ArtDirectorFactory;
import za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository.ArtRepoImpl;
import za.ac.cput.projects.Services.ArtService.IMPL.ArtDirectServiceImpl;

import java.net.http.HttpHeaders;

import static org.junit.Assert.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class ArtDirControllerTest {
@Autowired
private TestRestTemplate restTemplate;
private String baseURL = "http://localhost:8080/artDirector";
   private ArtDirector artDirector;
   private ArtDirController artDirController;
    @Before
    public void setUp() throws Exception {
         artDirector = ArtDirectorFactory.createArtDirector("Sarah","505",50.00);


    }

    @Test
    public void create() {

     ResponseEntity<ArtDirector> postResponse = restTemplate.postForEntity(baseURL+"/artDirector/1",artDirector,ArtDirector.class);
     assertNotNull(postResponse);
     assertNotNull(postResponse.getBody());


    }

    @Test
    public void update() {

     String id = "Sarah";
     ArtDirector artDirector = restTemplate.getForObject(baseURL +"/artDirector/" +id,ArtDirector.class);
     restTemplate.put(baseURL +"/artDirector/" +id,ArtDirector.class);
     ArtDirector update = restTemplate.getForObject(baseURL +"/ArtDirector/"+id,ArtDirector.class);
     assertNotNull(update);

    }

    @Test
    public void delete() {


    }

    @Test
    public void read() {


    }

    @Test

    public void getAll() {

    }
}