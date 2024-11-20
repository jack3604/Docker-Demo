package net.ddns.adisson.dockerdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@EnableCouchbaseRepositories
@Configuration
public class CouchbaseConfiguration extends AbstractCouchbaseConfiguration {
    @Value("#{systemEnvironment['DB_CONN_STRING'] ?: 'localhost'}")
    private String dbConnString;
    @Value("#{systemEnvironment['DB_USERNAME'] ?: 'user'}")
    private String dbUsernameString;
    @Value("#{systemEnvironment['DB_PASSWORD'] ?: 'pass'}")
    private String dbPasswordString;
    @Value("#{systemEnvironment['DB_BUCKET_NAME'] ?: 'Cars'}")
    private String dbBucketNameString;

    @Override
    public String getConnectionString() {
        return "";
    }

    @Override
    public String getUserName() {
        return "";
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getBucketName() {
        return "";
    }
}
