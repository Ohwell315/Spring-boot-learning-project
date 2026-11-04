package com.eazybytes.accounts.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data // Annotation that combines multiple other annotations like @Getter and @Setter
public class AccountsDto {

    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
