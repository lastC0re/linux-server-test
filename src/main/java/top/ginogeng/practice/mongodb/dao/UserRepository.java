package top.ginogeng.practice.mongodb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import top.ginogeng.practice.mongodb.entity.User;

/**
 * @author jipin.geng
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
