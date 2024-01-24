package at.htlklu.springboottemplate.repositories;

import at.htlklu.springboottemplate.model.Lebensmittel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LebensmittelRepository extends JpaRepository<Lebensmittel,Integer> {
}
