package com.qr_tecno_moviles.demo_qr.persistence;

import com.qr_tecno_moviles.demo_qr.model.ItemMuseo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemMuseoRepository extends JpaRepository<ItemMuseo, Long> {

    Optional<ItemMuseo> findFirstById(Long id);
}
