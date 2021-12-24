package lk.icoder.securityone.auth;

import java.util.Optional;

/**
 * @Project security-one
 * @Author DILAN on 12/23/2021
 */
public interface ApplicationUserDao {

    Optional<ApplicationUser> selectApplicationByUsername(String username);
}
