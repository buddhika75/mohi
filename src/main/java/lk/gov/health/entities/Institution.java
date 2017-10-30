/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class Institution implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private InstitutionType type;
    private String name;
    private String code;
    @Lob
    private String address;
    private String telephone;
    private String email;
    private String fax;
    @ManyToOne
    private Institution parentInstitution;
    @ManyToOne
    private Area rdhsArea;
    @ManyToOne
    private Area educationalZone;
    @ManyToOne
    private Area mohArea;

    private Long registrationNo;
    private Long populationServed;
    private Long clientsPerSession;
    private Integer sessionsPerMonth;
    @Enumerated(EnumType.STRING)
    private TypeOfClinic typeOfClinic;
    private Boolean ocp;
    private Boolean condoms;
    private Boolean iud;
    private Boolean jadelle;
    private Boolean dmpa;
    private Boolean emergFacilities;
    private Integer uniqueKey;

    @ManyToOne
    private WebUser creater;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date createAt;

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Institution)) {
            return false;
        }
        Institution other = (Institution) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.gov.health.schoolhealth.Institution[ id=" + id + " ]";
    }

    public InstitutionType getType() {
        return type;
    }

    public void setType(InstitutionType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Institution getParentInstitution() {
        return parentInstitution;
    }

    public void setParentInstitution(Institution parentInstitution) {
        this.parentInstitution = parentInstitution;
    }

    public Area getRdhsArea() {
        return rdhsArea;
    }

    public void setRdhsArea(Area rdhsArea) {
        this.rdhsArea = rdhsArea;
    }

    public Area getEducationalZone() {
        return educationalZone;
    }

    public void setEducationalZone(Area educationalZone) {
        this.educationalZone = educationalZone;
    }

    public Area getMohArea() {
        return mohArea;
    }

    public void setMohArea(Area mohArea) {
        this.mohArea = mohArea;
    }

    public Long getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(Long registrationNo) {
        this.registrationNo = registrationNo;
    }

    public Long getPopulationServed() {
        return populationServed;
    }

    public void setPopulationServed(Long populationServed) {
        this.populationServed = populationServed;
    }

    public Long getClientsPerSession() {
        return clientsPerSession;
    }

    public void setClientsPerSession(Long clientsPerSession) {
        this.clientsPerSession = clientsPerSession;
    }

    public Integer getSessionsPerMonth() {
        return sessionsPerMonth;
    }

    public void setSessionsPerMonth(Integer sessionsPerMonth) {
        this.sessionsPerMonth = sessionsPerMonth;
    }

    public TypeOfClinic getTypeOfClinic() {
        return typeOfClinic;
    }

    public void setTypeOfClinic(TypeOfClinic typeOfClinic) {
        this.typeOfClinic = typeOfClinic;
    }

    public Boolean getOcp() {
        return ocp;
    }

    public void setOcp(Boolean ocp) {
        this.ocp = ocp;
    }

    public Boolean getCondoms() {
        return condoms;
    }

    public void setCondoms(Boolean condoms) {
        this.condoms = condoms;
    }

    public Boolean getIud() {
        return iud;
    }

    public void setIud(Boolean iud) {
        this.iud = iud;
    }

    public Boolean getJadelle() {
        return jadelle;
    }

    public void setJadelle(Boolean jadelle) {
        this.jadelle = jadelle;
    }

    public Boolean getDmpa() {
        return dmpa;
    }

    public void setDmpa(Boolean dmpa) {
        this.dmpa = dmpa;
    }

    public Boolean getEmergFacilities() {
        return emergFacilities;
    }

    public void setEmergFacilities(Boolean emergFacilities) {
        this.emergFacilities = emergFacilities;
    }

    public Integer getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(Integer uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    public WebUser getCreater() {
        return creater;
    }

    public void setCreater(WebUser creater) {
        this.creater = creater;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
