package com.pragma.statusprogression;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<String> processTransaction(@RequestBody Transaction transaction) {
        transactionService.processTransaction(transaction);
        return ResponseEntity.ok("Transaction processed");
    }
}