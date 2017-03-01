package com.pavarenkin.vip_lab.domain.converters;

import com.pavarenkin.vip_lab.domain.enums.Status;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by Дмитрий Паваренкин on 28.02.2017.
 */

public class StatusConverter implements PropertyConverter<Status, String> {
    @Override
    public Status convertToEntityProperty(String databaseValue) {
        return Status.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(Status entityProperty) {
        return entityProperty.name();
    }
}

