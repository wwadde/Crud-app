package com.CRUD.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.CRUD.App.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
