package reservation.repositories;

import org.springframework.data.repository.Repository;

import reservation.entities.Reservation;

import java.util.List;
public interface ReservationRepository extends Repository<Reservation, Integer>{

	
	void delete(Reservation reservation);

    List<Reservation> findAll();

    Reservation findOne(int id);

    Reservation save(Reservation reservation);
}
