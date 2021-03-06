package com.formation.data;

import android.net.Uri;
import android.provider.BaseColumns;

public final class AnimalContract {

    private AnimalContract() {
    }

    public static abstract class Animals implements BaseColumns {
        public static final String SCHEME = "content://";
        public static final String AUTHORITY = "com.formation.data";
        public static final String SEPARATOR = "/";
        public static final String TABLE_NAME = "animal";
        public static final Uri CONTENT_URI = Uri.parse(Animals.SCHEME + Animals.AUTHORITY + Animals.SEPARATOR + Animals.TABLE_NAME);

        // animalid est recupere depuis un WebService
        public static final String COLUMN_NAME_ANIMAL_ID = "animalid";
        public static final String COLUMN_NAME_DIET = "diet";
        public static final String COLUMN_NAME_FAMILY = "family";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_SEX = "sex";
        public static final String COLUMN_NAME_AGE = "age";
    }
}
