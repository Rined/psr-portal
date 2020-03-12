package com.rined.psr.portal.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Статусы ПСР
 */
@Getter
@NoArgsConstructor
@Entity(name = "psrStates")
@Table(name = "psr_states")
public class PsrState {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Наименование статуса
     */
    @Column(name = "name")
    private String name;

    public PsrState(String name) {
        this.name = name;
    }
}
