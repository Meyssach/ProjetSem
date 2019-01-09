package reservation.services;

import java.util.List;

import reservation.entities.Reservation;

public interface ReservationService {

	
	Reservation create(Reservation reservation);

	Reservation delete(int id);

    List<Reservation> findAll();

    Reservation findById(int id);

    Reservation update(Reservation reservation);
}
