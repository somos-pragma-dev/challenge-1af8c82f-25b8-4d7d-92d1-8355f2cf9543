package com.pragma.statusprogression;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TransactionServiceTest {
    @Autowired
    private TransactionService transactionService;

    @Test
    void testProcessTransactionFromPendingToProcessing() {
        Transaction transaction = new Transaction("test-transaction", State.PENDING);
        transactionService.processTransaction(transaction);
        assertEquals(State.PROCESSING, transaction.getState());
    }

    @Test
    void testProcessTransactionFromProcessingToCompleted() {
        Transaction transaction = new Transaction("test-transaction", State.PROCESSING);
        transactionService.processTransaction(transaction);
        assertEquals(State.COMPLETED, transaction.getState());
    }

    @Test
    void testProcessTransactionAlreadyCompleted() {
        Transaction transaction = new Transaction("test-transaction", State.COMPLETED);
        transactionService.processTransaction(transaction);
        assertEquals(State.COMPLETED, transaction.getState());
    }
}