package nl.ordina.app;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/calc")
public class AlgorithmController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String calc() throws InterruptedException {
        Thread.sleep(3000);
        String algorithmOutcome =  String.valueOf(Math.abs(Math.random() * 1000000L));
        return "The outcome of the complex algorithm is: " + algorithmOutcome;
    }

}
