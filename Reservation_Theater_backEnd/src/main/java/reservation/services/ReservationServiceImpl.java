package reservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reservation.entities.Reservation;
import reservation.repositories.ReservationRepository;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
    private ReservationRepository repository;

	@Override
    public Reservation create(Reservation reservation) {
        return repository.save(reservation);
    }

    @Override
    public Reservation delete(int id) {
    	Reservation reservation = findById(id);
        if(reservation != null){
            repository.delete(reservation);
        }
        return reservation;
    }

    @Override
    public List<Reservation> findAll() {
        return repository.findAll();
    }

    @Override
    public Reservation findById(int id) {
        return repository.findOne(id);
    }

    @Override
    public Reservation update(Reservation reservation) {
        return repository.save(reservation);
    }
}
