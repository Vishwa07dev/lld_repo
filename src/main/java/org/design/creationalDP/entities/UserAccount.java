package org.design.creationalDP.entities;

public class UserAccount {
    private String username;
    private String password;
    // Other user account attributes and methods

    private UserAccount(UserAccountBuilder builder) {
        this.username = builder.username;
        this.password = builder.password;
        // Other attributes initialization
    }

    // Getters for attributes

    public static class UserAccountBuilder {
        private final String username;
        private final String password;
        // Other builder attributes

        public UserAccountBuilder(String username, String password) {
            this.username = username;
            this.password = password;
            // Other attributes initialization
        }

        // Methods for setting other attributes

        public UserAccount build() {
            return new UserAccount(this);
        }
    }
}
