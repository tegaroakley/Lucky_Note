package com.example.luckynote.db;

import android.provider.BaseColumns;

public class DatabaseContract {
    static final class NoteColumns implements BaseColumns {
        static final String TABLE_NAME = "note";

        //Note title
        static final String TITLE = "title";
        //Note description
        static final String DESCRIPTION = "description";
        //Note date
        static final String DATE = "date";

    }
}
