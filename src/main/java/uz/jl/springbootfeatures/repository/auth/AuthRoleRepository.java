package uz.jl.springbootfeatures.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jl.springbootfeatures.domains.AuthRole;


public interface AuthRoleRepository extends JpaRepository<AuthRole, Long> {
}
