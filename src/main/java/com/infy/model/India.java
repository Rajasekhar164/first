
package com.infy.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="ex_IndiaStaff")
public class India{
    @Id
    private Long teamRank;

    private String teamNickName;

    private String teamPosition;

    private Float teamSalary;

    private Float teamNumber;

}
