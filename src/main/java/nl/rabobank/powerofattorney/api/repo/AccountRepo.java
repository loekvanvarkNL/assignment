package nl.rabobank.powerofattorney.api.repo;

import nl.rabobank.powerofattorney.api.model.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AccountRepo extends CrudRepository<Account, Long> {

    @Query("SELECT a FROM Account a WHERE a.owner = :owner")
    public Optional<Account> findByOwner(@Param("owner") String owner);

}
