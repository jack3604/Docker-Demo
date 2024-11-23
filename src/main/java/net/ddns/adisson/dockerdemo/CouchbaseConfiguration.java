package net.ddns.adisson.dockerdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@EnableCouchbaseRepositories
@Configuration
public class CouchbaseConfiguration extends AbstractCouchbaseConfiguration {
    @Value("#{systemEnvironment['DB_CONN_STRING'] ?: 'couchbase://172.17.0.2'}") //make this the ip of the database container
    private String dbConnString;
    @Value("#{systemEnvironment['DB_USERNAME'] ?: 'webuser'}")
    private String dbUsernameString;
    @Value("#{systemEnvironment['DB_PASSWORD'] ?: 'password'}")
    private String dbPasswordString;
    @Value("#{systemEnvironment['DB_BUCKET_NAME'] ?: 'CarBucket'}")
    private String dbBucketNameString;

    @Override
    public String getConnectionString() {
        return dbConnString;
    }

    @Override
    public String getUserName() {
        return dbUsernameString;
    }

    @Override
    public String getPassword() {
        return dbPasswordString;
    }

    @Override
    public String getBucketName() {
        return dbBucketNameString;
    }
}
