package com.demo.payment.repository;

import com.demo.payment.domain.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class TransactionRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Transaction transaction) {
        em.persist(transaction);
    }
}
