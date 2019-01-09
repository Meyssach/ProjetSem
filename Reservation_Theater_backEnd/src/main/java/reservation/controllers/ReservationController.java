package reservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import reservation.entities.Reservation;
import reservation.services.ReservationService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/reservations"})
public class ReservationController {

	@Autowired
    private ReservationService reservationService;

    @PostMapping
    public Reservation create(@RequestBody Reservation reservation){
        return reservationService.create(reservation);
    }

    @GetMapping(path = {"/{id}"})
    public Reservation findOne(@PathVariable("id") int id){
        return reservationService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Reservation update(@PathVariable("id") int id, @RequestBody Reservation reservation){
    	reservation.setId(id);
        return reservationService.update(reservation);
    }

    @DeleteMapping(path ={"/{id}"})
    public Reservation delete(@PathVariable("id") int id) {
        return reservationService.delete(id);
    }

    @GetMapping
    public List<Reservation> findAll(){
        return reservationService.findAll();
    }
}
