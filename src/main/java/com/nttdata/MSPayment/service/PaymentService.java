package com.nttdata.MSPayment.service;

import com.nttdata.MSPayment.model.Payment;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PaymentService {
    Mono<Payment> createPayment(Payment p);
    Mono<Payment> updatePayment(Payment p);
    Mono<Payment> findByPaymentId(String id);
    Flux<Payment> findAll();
    Flux<Payment> findAllByCreditId(String id);
    Mono<Void> deletePayment(String id);
}
