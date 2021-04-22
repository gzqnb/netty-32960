package com.nevt.gbt32960.service;

import com.nevt.gbt32960.repository.PlatformUserRepository;
import com.nevt.gbt32960.repository.entiry.PlatformUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Optional;

@Slf4j
@Component
public class PlatformService {

    @Resource
    private PlatformUserRepository platformUserRepository;

    public boolean saveOne(String username, String password) {
        if (username.length() == 12 && password.length() == 20) {
            PlatformUser platformUser = new PlatformUser();
            platformUser.setUsername(username);
            platformUser.setPassword(password);
            platformUserRepository.save(platformUser);
            log.info("add platform user success!");
            return true;
        } else {
            log.error("username or password length not expection:  username's length 12 and password's lengthh 20");
            return false;
        }

    }

    public boolean findOne(String username, String password) {
        if (username.length() == 12 && password.length() == 20) {
            Optional<PlatformUser> result = platformUserRepository.findOneByUsernameAndPassword(username, password);
            return result.isPresent();
        }
        return false;
    }

}
