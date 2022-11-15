/* --------------------------------------------------------------------------------
 * Projet HCERES
 * 
 * Gestion de données pour l'HCERES
 * 
 * Ecole Centrale Nantes - laboratoire CRTI
 * Avril 2021
 * L LETERTRE, S LIMOUX, JY MARTIN
 * -------------------------------------------------------------------------------- */
package org.centrale.hceres.repositories;

import org.centrale.hceres.items.TypeActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ECN
 */
@Repository
public interface TypeActivityRepository extends JpaRepository<TypeActivity, Integer>{
    
}
