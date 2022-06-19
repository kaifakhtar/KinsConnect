package com.kaif;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {TableUser.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDaO userDao();
}
