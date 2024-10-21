package org.example.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import org.example.enums.Availability;

@EqualsAndHashCode(callSuper = true)
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DeliveryExecutive extends User {
    @Builder.Default
    @Enumerated(EnumType.STRING)
    @Column
    private Availability availability = Availability.AVAILABLE;
}