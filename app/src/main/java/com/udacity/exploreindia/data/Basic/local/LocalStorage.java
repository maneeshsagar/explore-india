package com.udacity.exploreindia.data.Basic.local;

import com.udacity.exploreindia.data.Basic.BaseStorage;

/**
 * Created by Kautilya on 24-04-2018.
 */
public class LocalStorage implements BaseStorage {

    private static LocalStorage INSTANCE;

    private LocalStorage(){}

    public static LocalStorage getInstance() {
        if (INSTANCE == null) {
            synchronized (LocalStorage.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LocalStorage();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void storageUsser() {
        // TODO: 24-04-2018 Store in the phone data
    }
}
