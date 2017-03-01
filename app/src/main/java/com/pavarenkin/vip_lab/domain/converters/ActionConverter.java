package com.pavarenkin.vip_lab.domain.converters;

import com.pavarenkin.vip_lab.domain.enums.Action;
import com.pavarenkin.vip_lab.domain.enums.Status;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by Дмитрий Паваренкин on 28.02.2017.
 */

public class ActionConverter implements PropertyConverter<Action, String> {
    @Override
    public Action convertToEntityProperty(String databaseValue) {
        return Action.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(Action entityProperty) {
        return entityProperty.name();
    }
}

