package com.patika.kredinbizdenservice.application.model.responsedto;

import com.patika.kredinbizdenservice.application.entity.enums.ApplicationStatus;
import com.patika.kredinbizdenservice.loan.model.responsedto.LoanResponseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ApplicationResponseDTO {
    BigDecimal loanAmount;
    String userId;
    LocalDateTime localDateTime;
    ApplicationStatus applicationStatus;
}
