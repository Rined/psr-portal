package com.rined.psr.portal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Статусы добровольцев
 */
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "volunteerStatus")
@Table(name = "volunteer_status")
public class VolunteerStatus {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Наименование статуса добровольца
     */
    @Column(name = "name")
    private String name;

    public VolunteerStatus(String name) {
        this.name = name;
    }
}
