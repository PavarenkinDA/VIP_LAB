package com.pavarenkin.vip_lab.domain.converters;

import com.pavarenkin.vip_lab.domain.enums.Kind;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by Дмитрий Паваренкин on 25.02.2017.
 */

public class KindConverter implements PropertyConverter<Kind, String> {
    @Override
    public Kind convertToEntityProperty(String databaseValue) {
        return Kind.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(Kind entityProperty) {
        return entityProperty.name();
    }
}
