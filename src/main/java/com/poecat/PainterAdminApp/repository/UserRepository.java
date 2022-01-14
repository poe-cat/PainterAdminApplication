package com.poecat.PainterAdminApp.repository;

import com.poecat.PainterAdminApp.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
