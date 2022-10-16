package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private String cliente;
    private Date fechainicio;
    private Date fechafin;
    private String status = "created";
    private Integer nube;
    @ManyToOne
    @JoinColumn(name = "idCloud")
    @JsonIgnoreProperties("reservation")
    public Category cloud;

    @OneToOne
    @JsonIgnoreProperties("reservation")
    public Score score;

    @ManyToOne
    @JsonIgnoreProperties("reservation")
    public Category category;
//
//    @ManyToOne
//    @JsonIgnoreProperties("reservation")
//    public Message message ;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    @JsonIgnoreProperties("reservation")
    public Client client;

    public Integer getIdReservation() {
    return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public Category getCloud() {
        return cloud;
    }

    public void setCloud(Category cloud) {
        this.cloud = cloud;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNube() {
        return nube;
    }

    public void setNube(Integer nube) {
        this.nube = nube;
    }

    }



