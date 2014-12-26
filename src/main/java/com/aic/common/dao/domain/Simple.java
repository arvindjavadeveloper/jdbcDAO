package com.aic.common.dao.domain;

public class Simple {

    private Long id;
    private String uuid;

    public Simple() {

    }

    public Simple(Long id) {
	this.id = id;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getUuid() {
	return uuid;
    }

    public void setUuid(String uuid) {
	this.uuid = uuid;
    }

    @Override
    public String toString() {
	return id + " " + uuid;
    }

}
