package com.example.pattern.states.impl;

import com.example.pattern.ReservationContext;
import com.example.pattern.states.ReservationState;

public class Processed implements ReservationState {
    //singleton
    private static Processed instance = new Processed();

    private Processed() {
    }

    public static Processed instance() {
        return instance;
    }

    //business logic
    @Override
    public void updateState(ReservationContext reservationContext) {
        System.out.println("Reservation " + reservationContext.getReservationId() + " is processed");
        //change state
        reservationContext.setCurrentState(Confirmed.instance());
    }
}