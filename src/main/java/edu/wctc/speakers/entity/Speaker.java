package edu.wctc.speakers.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name="Speaker")
public class Speaker {
    @Id
    @Column(name="speaker_id")
    private int id;
    @Column(name="brand")
    private String brand;
    @Column(name="store")
    private String store;
    @Column(name="image_file_name")
    private String imageFileName;
}
