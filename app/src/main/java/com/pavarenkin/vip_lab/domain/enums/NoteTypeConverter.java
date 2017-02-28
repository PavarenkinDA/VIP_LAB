package com.pavarenkin.vip_lab.domain.enums;

import com.pavarenkin.vip_lab.domain.enums.NoteType;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by Дмитрий Паваренкин on 25.02.2017.
 */


public class NoteTypeConverter implements PropertyConverter<NoteType, String> {
    @Override
    public NoteType convertToEntityProperty(String databaseValue) {
        return NoteType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(NoteType entityProperty) {
        return entityProperty.name();
    }
}
