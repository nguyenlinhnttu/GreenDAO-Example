package com.android.greendao.model;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by nguyenvanlinh on 12/26/17.
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