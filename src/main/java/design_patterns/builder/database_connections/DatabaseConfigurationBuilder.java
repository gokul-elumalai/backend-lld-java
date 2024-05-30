package main.java.design_patterns.builder.database_connections;


@WithBuilder
public class DatabaseConfigurationBuilder {
    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    private DatabaseConfigurationBuilder() { }

    public static class Builder {
        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;

        public DatabaseConfigurationBuilder build() {
            DatabaseConfigurationBuilder database = new DatabaseConfigurationBuilder();
            database.databaseUrl = this.databaseUrl;
            database.username = this.username;
            database.password = this.password;
            database.maxConnections = this.maxConnections;
            database.enableCache = this.enableCache;
            database.isReadOnly = this.isReadOnly;
            return database;
        }
    }

}
