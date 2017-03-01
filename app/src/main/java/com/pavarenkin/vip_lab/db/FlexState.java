package com.pavarenkin.vip_lab.db;

import org.greenrobot.greendao.annotation.*;

import com.pavarenkin.vip_lab.domain.enums.Action;
import com.pavarenkin.vip_lab.domain.enums.Kind;
import com.pavarenkin.vip_lab.domain.enums.State;
import com.pavarenkin.vip_lab.domain.enums.Status;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "FLEX_STATE".
 */
@Entity
public class FlexState {

    @Id(autoincrement = true)
    private Long id;

    @Convert(converter = com.pavarenkin.vip_lab.domain.converters.KindConverter.class, columnType = String.class)
    @NotNull
    private Kind kind;

    @Convert(converter = com.pavarenkin.vip_lab.domain.converters.StateConverter.class, columnType = String.class)
    @NotNull
    private State state;

    @Convert(converter = com.pavarenkin.vip_lab.domain.converters.ActionConverter.class, columnType = String.class)
    @NotNull
    private Action action;

    @Convert(converter = com.pavarenkin.vip_lab.domain.converters.StatusConverter.class, columnType = String.class)
    @NotNull
    private Status status;
    private java.util.Date date;
    private java.util.Date dateFrom;
    private java.util.Date dateTo;
    private String name;
    private String caption;
    private String code;
    private String json;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public FlexState() {
    }

    public FlexState(Long id) {
        this.id = id;
    }

    @Generated
    public FlexState(Long id, Kind kind, State state, Action action, Status status, java.util.Date date, java.util.Date dateFrom, java.util.Date dateTo, String name, String caption, String code, String json) {
        this.id = id;
        this.kind = kind;
        this.state = state;
        this.action = action;
        this.status = status;
        this.date = date;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.name = name;
        this.caption = caption;
        this.code = code;
        this.json = json;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public Kind getKind() {
        return kind;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setKind(@NotNull Kind kind) {
        this.kind = kind;
    }

    @NotNull
    public State getState() {
        return state;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setState(@NotNull State state) {
        this.state = state;
    }

    @NotNull
    public Action getAction() {
        return action;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setAction(@NotNull Action action) {
        this.action = action;
    }

    @NotNull
    public Status getStatus() {
        return status;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setStatus(@NotNull Status status) {
        this.status = status;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public java.util.Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(java.util.Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public java.util.Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(java.util.Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
