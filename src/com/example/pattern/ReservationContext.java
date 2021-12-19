package com.example.pattern;

import com.example.pattern.states.ReservationState;
import com.example.pattern.states.impl.Accepted;

public class ReservationContext {

    private ReservationState currentState;
    private final long reservationId;

    public ReservationContext(ReservationState currentState, long reservationId) {

        this.currentState = currentState;
        this.reservationId = reservationId;

        if (currentState == null) {
            this.currentState = Accepted.instance();
        }
    }

    public void setCurrentState(ReservationState currentState) {
        this.currentState = currentState;
    }

    public long getReservationId() {
        return reservationId;
    }

    public void update() {
        currentState.updateState(this);
    }
}
