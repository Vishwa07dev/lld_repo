package org.design.creationalDP.dal;

public class UserDatabase {
    private static UserDatabase instance;
    // Other attributes and methods for managing user data

    private UserDatabase() {
        // Private constructor to prevent external instantiation
    }

    public static synchronized UserDatabase getInstance() {
        if (instance == null) {
            instance = new UserDatabase();
        }
        return instance;
    }
}
