package com.gl.ceir.config.repository.app;

import com.gl.ceir.config.model.app.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

    Users getByUsernameAndPasswordAndParentId(String userName, String password, int parentId);

    Users getByUsernameAndPassword(String userName, String password);

}
