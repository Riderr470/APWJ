package com.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

public class LeaveType {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "Category")
    private String category;

    @NotNull
    @Column(name = "Total_days")
    @ManyToOne
    @JoinColumn(name = "fk_totalDays")
    private int totalDays;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }
}
