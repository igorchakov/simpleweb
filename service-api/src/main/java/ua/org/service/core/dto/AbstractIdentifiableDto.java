package ua.org.service.core.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public abstract class AbstractIdentifiableDto implements Serializable {

    private static final long serialVersionUID = 3751779977686715676L;
    protected Long id;


    @JsonIgnore
    public boolean isNew() {
        return id == null || id <= 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractIdentifiableDto that = (AbstractIdentifiableDto) o;
        if (id == null && that.id == null) return super.equals(o);

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdAsString(String id) {
        this.id = Long.valueOf(id);
    }
}