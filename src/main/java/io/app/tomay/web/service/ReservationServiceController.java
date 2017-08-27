package io.app.tomay.web.service;

import io.app.tomay.business.domain.RoomReservation;
import io.app.tomay.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Fidel Villanueva
 * TODO: 26/08/17
 */
@RestController
@RequestMapping(value = "api/reservation/")
public class ReservationServiceController {
    @Autowired
    private ReservationService reservationService;

    @RequestMapping(method= RequestMethod.GET, value="/reservations/{date}")
    public List<RoomReservation> getAllReservationsForDate(@PathVariable(value="date")String dateString){
        return this.reservationService.getRoomReservationsForDate(dateString);
    }
}
