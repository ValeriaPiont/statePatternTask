package com.example.pattern.states.impl;

import com.example.pattern.ReservationContext;
import com.example.pattern.states.ReservationState;

public class Confirmed implements ReservationState {
    //singleton
    private static final Confirmed instance = new Confirmed();

    private Confirmed() {
    }

    public static Confirmed instance() {
        return instance;
    }

    //business logic
    @Override
    public void updateState(ReservationContext reservationContext) {
        System.out.println("Reservation " + reservationContext.getReservationId() + " is confirmed");
    }
}