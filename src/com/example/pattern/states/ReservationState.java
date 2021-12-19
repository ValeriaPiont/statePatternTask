package com.example.pattern.states;

import com.example.pattern.ReservationContext;

public interface ReservationState {
    void updateState(ReservationContext reservationContext);
}