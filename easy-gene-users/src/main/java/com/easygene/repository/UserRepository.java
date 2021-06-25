package com.easygene.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easygene.entity.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

}
