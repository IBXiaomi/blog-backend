package com.jamiewang.repository;

import com.jamiewang.model.User;
import com.jamiewang.repository.base.BaseRepository;
import org.springframework.lang.NonNull;

import java.util.Optional;

/**
 * user repository
 *
 * @author jamiewang
 * @date 16/3/2021
 */
public interface UserRepository extends BaseRepository<User, Integer> {

    /**
     * Gets user by username.
     *
     * @param username username must not be blank
     * @return an optional user
     */
    @NonNull
    Optional<User> findByUsername(@NonNull String username);
}
