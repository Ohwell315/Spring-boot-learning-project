package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Customer extends BaseEntity { // Class name is matched to DB name
    @Id // Labels as private key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Delegated ID incrementation to DB
    @Column(name="customer_id")
    private Long customerId;

    private String name;

    private String email;

    @Column(name="mobile_number")
    private String mobileNumber;

}
