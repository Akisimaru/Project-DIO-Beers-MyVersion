package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDate;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FabricationDateIsInTheFuture extends Exception {

    public FabricationDateIsInTheFuture(Long id) {
        super(String.format("Beers with %s ID fabrication date is currently in the future", id));
    }
}
