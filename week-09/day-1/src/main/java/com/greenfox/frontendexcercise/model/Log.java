package com.greenfox.frontendexcercise.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String createdAt;
    private String endpoint;
    private String data;

    public Log(String endpoint, String data) {
        this.createdAt = new SimpleDateFormat("yyyy. MM dd. hh:mm:ss").format(new Date());
        this.endpoint = endpoint;
        this.data = data;
    }

    public Log() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @JsonIgnore
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }



}
