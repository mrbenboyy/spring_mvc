package org.example.springmvc.repository;

import org.example.springmvc.entities.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Page<Patient> findByNomContains(String kw,Pageable pageable);
}
