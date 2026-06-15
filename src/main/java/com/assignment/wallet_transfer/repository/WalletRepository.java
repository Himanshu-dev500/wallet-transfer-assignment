package com.assignment.wallet_transfer.repository;

import com.assignment.wallet_transfer.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WalletRepository extends JpaRepository<com.assignment.wallet_transfer.entity.Wallet, UUID> {
}
