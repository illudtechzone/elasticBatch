package com.illud.domain;



import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DrivoData.
 */
@Entity
@Table(name = "drivo_data")
@Document(indexName = "drivodata")
public class DrivoData implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reg_no")
    private String regNo;

    @Column(name = "owner_name")
    private String ownerName;

    @Column(name = "mobile_no")
    private String mobileNo;

    @Column(name = "vehdecscr")
    private String vehdecscr;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegNo() {
        return regNo;
    }

    public DrivoData regNo(String regNo) {
        this.regNo = regNo;
        return this;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public DrivoData ownerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public DrivoData mobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getVehdecscr() {
        return vehdecscr;
    }

    public DrivoData vehdecscr(String vehdecscr) {
        this.vehdecscr = vehdecscr;
        return this;
    }

    public void setVehdecscr(String vehdecscr) {
        this.vehdecscr = vehdecscr;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DrivoData drivoData = (DrivoData) o;
        if (drivoData.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), drivoData.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "DrivoData{" +
            "id=" + getId() +
            ", regNo='" + getRegNo() + "'" +
            ", ownerName='" + getOwnerName() + "'" +
            ", mobileNo='" + getMobileNo() + "'" +
            ", vehdecscr='" + getVehdecscr() + "'" +
            "}";
    }
}
