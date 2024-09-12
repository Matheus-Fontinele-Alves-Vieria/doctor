package com.mathvieira.doctor.api.entity;

import java.util.UUID;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Table(name="medications")
@Entity(name="medications")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Medications {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;

    private String name;
    private String dosage;
    private String frenquency;
    private String duration;
    private String notes;
}
