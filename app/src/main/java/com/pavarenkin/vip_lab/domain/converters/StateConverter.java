package com.pavarenkin.vip_lab.domain.converters;

import com.pavarenkin.vip_lab.domain.enums.State;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by Дмитрий Паваренкин on 28.02.2017.
 */

public class StateConverter implements PropertyConverter<State, String> {
    @Override
    public State convertToEntityProperty(String databaseValue) {
        return State.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(State entityProperty) {
        return entityProperty.name();
    }
}

