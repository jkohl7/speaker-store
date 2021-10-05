package edu.wctc.speakers.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Sale")
public class Sale {
    @Id
    @Column(name = "sale_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "speaker_id")
    private int speakerId;

    @NotBlank
    @Column(name = "buyer_name")
    private String buyerName;

    //@Column(name = "location_id")
    //private int locationId;
    @ManyToOne
    @JoinColumn(name="location_id")
    private Location location;

    @Min(1)
    @Max(20)
    @Column(name = "count")
    private int count;

    @Column(name = "bought_at")
    private LocalDateTime boughtAt;

    @PrePersist
    void boughtAt() {
        this.boughtAt = LocalDateTime.now();
    }
}
