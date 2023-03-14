package ua.net.maxx.actionregister.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.NoSuchElementException;

/*import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;*/

public class LiquibaseSync {
    private static final String CHANGELOG_MASTER = "master";

    public static void runLiquibase() {
        Connection conn = null;
        /*try {
            conn = DbConnection.getInstance();

            Database database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new JdbcConnection(conn));
            //log.info(DataSources.CHANGELOG_MASTER);
            Liquibase liquibase = new Liquibase(CHANGELOG_MASTER, new ClassLoaderResourceAccessor(), database);
            liquibase.update("main");
        } catch (SQLException | LiquibaseException e) {
            e.printStackTrace();
            throw new NoSuchElementException(e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.rollback();
                    conn.close();
                } catch (SQLException e) {
                    //nothing to do
                }
            }
        }*/
    }
}
