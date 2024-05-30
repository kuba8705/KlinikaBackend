package com.example.System_dla_przychodni_v2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
/*
public interface LekarzRepository extends CrudRepository<Lekarz, Integer>{
}
*/

public interface LekarzRepository extends JpaRepository<Lekarz, Long> {
    @Query("SELECT q FROM Lekarz q WHERE q.id_lekarza LIKE %?1%")
    List<Lekarz> getContainingLekarz(String word);
}