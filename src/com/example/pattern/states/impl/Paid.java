package com.example.pattern.states.impl;

import com.example.pattern.ReservationContext;
import com.example.pattern.states.ReservationState;

public class Paid implements ReservationState {
    //singleton
    private static Paid instance = new Paid();

    private Paid() {
    }

    public static Paid instance() {
        return instance;
    }

    //business logic
    @Override
    public void updateState(ReservationContext reservationContext) {
        System.out.println("Reservation " + reservationContext.getReservationId() + " is paid");
        //change state
        reservationContext.setCurrentState(Processed.instance());
    }
}
