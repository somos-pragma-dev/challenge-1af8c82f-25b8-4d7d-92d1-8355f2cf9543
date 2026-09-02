package com.pragma.statusprogression;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    public void processTransaction(Transaction transaction) {
        // Simulate state transitions
        if (transaction.getState() == State.PENDING) {
            transaction.setState(State.PROCESSING);
        } else if (transaction.getState() == State.PROCESSING) {
            transaction.setState(State.COMPLETED);
        }
    }
}