package lk.icoder.securityone.auth;

import com.google.common.collect.Lists;
import lk.icoder.securityone.security.ApplicationUserRole;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static lk.icoder.securityone.security.ApplicationUserRole.*;

/**
 * @Project security-one
 * @Author DILAN on 12/23/2021
 */
@Repository("fake")
public class FakeApplicationUserDaoService implements ApplicationUserDao{

    private final PasswordEncoder passwordEncoder;

    public FakeApplicationUserDaoService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<ApplicationUser> selectApplicationByUsername(String username) {
        return getApplicationUsers()
                .stream()
                .filter(applicationUser -> username.equals(applicationUser.getUsername()))
                .findFirst();
    }

    private List<ApplicationUser> getApplicationUsers() {
        return Lists.newArrayList(
                new ApplicationUser("student",
                        passwordEncoder.encode("student"),
                        STUDENT.getGrantAuthority(),
                        true,
                        true,
                        true,
                        true),
                new ApplicationUser("admin",
                        passwordEncoder.encode("admin"),
                        ADMIN.getGrantAuthority(),
                        true,
                        true,
                        true,
                        true),
                new ApplicationUser("tom",
                        passwordEncoder.encode("tom"),
                        ADMIN_TRAINEE.getGrantAuthority(),
                        true,
                        true,
                        true,
                        true)
        );

    }
}
