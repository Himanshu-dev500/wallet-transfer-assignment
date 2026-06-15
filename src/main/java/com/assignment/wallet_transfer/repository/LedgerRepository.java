package com.assignment.wallet_transfer.repository;

import com.assignment.wallet_transfer.entity.LedgerEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LedgerRepository  extends JpaRepository<com.assignment.wallet_transfer.entity.LedgerEntry, UUID> {


}
