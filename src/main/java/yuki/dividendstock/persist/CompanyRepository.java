package yuki.dividendstock.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yuki.dividendstock.persist.entity.CompanyEntity;

@Repository
public interface CompanyRepository extends JpaRepository <CompanyEntity,Long> {
}
