package com.nevt.gbt32960.repository;

import com.nevt.gbt32960.repository.entiry.PlatformUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface PlatformUserRepository extends JpaRepository<PlatformUser,Integer>,
        JpaSpecificationExecutor<PlatformUser> {

    Optional<PlatformUser> findOneByUsernameAndPassword(String username, String password);

}
