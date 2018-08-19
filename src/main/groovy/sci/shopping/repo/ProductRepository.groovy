package sci.shopping.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import sci.shopping.domain.Product

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
class ProductRepository {
    @PersistenceContext
    private EntityManager entityManager


    /**
     * Create
     */
    public Product create(Product loc) {
        entityManager.persist(loc)
        entityManager.flush()
        return loc
    }

    /**
     * Update
     */
    public Product update(Product loc) {
        loc = entityManager.merge(loc)
        entityManager.flush()
        return loc
    }

    /**
     * Delete
     */
    public void delete(Product loc) {
        entityManager.remove(loc)
        entityManager.flush()
    }

    /**
     * Find
     */
    public Product find(Long id) {
        return entityManager.find(Product.class, id)
    }

}


