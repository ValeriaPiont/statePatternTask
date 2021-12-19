package com.example.pattern.states.impl;

import com.example.pattern.ReservationContext;
import com.example.pattern.states.ReservationState;

public class Accepted implements ReservationState {
    //singleton
    private static Accepted instance = new Accepted();

    private Accepted() {
    }

    public static Accepted instance() {
        return instance;
    }

    //business logic
    @Override
    public void updateState(ReservationContext reservationContext) {
        System.out.println("Reservation " + reservationContext.getReservationId() + " is accepted");
        //change state
        reservationContext.setCurrentState(Paid.instance());
    }
}
