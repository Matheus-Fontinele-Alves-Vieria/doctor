package com.mathvieira.doctor.api.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Table(name="prescriptions")
@Entity(name="prescriptions")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Prescriptions {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;

    private UUID doctorId;
    private UUID patientId;
    private LocalDateTime issueDate;
    private LocalDateTime validityDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    private PrescriptionStatus prescriptionStatus;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="prescription_id")
    private List<Medications> medicationses;
    
    private String notes;
}
