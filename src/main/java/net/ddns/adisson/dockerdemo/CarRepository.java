package net.ddns.adisson.dockerdemo;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CouchbaseRepository<Car, String> {
}
