package io.app.tomay.web.application;

import io.app.tomay.business.domain.RoomReservation;
import io.app.tomay.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Fidel Villanueva
 * TODO: 26/08/17
 */
@Controller
@RequestMapping(value = "/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    /**
     *  Obtiene todas las reservaciones realizadas
     * @param dateString  {Consultar por Fecha}
     * @param model
     * @return
     */
    @RequestMapping(value = "/reservations",method= RequestMethod.GET)
    public String getReservations(@RequestParam(value="date", required=false)String dateString, Model model){
        List<RoomReservation> roomReservationList = this.reservationService.getRoomReservationsForDate(dateString);
        model.addAttribute("roomReservations", roomReservationList);
        return "reservations";
    }
}
