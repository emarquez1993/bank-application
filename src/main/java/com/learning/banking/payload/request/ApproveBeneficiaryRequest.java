package com.learning.banking.payload.request;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApproveBeneficiaryRequest {
	@Positive
	@NotNull
	private Long customerId;
	@Positive
	@NotNull
	private Long beneficiaryAccountNumber;
	@NotNull
	private LocalDate dateOfApproval;
	@NotBlank
	private String isApproved;
}
