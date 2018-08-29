package sci.shopping.service

import com.guitar.model.Location
import com.guitar.repository.LocationRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.lang.NonNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import sci.shopping.domain.Product
import sci.shopping.repo.ProductRepository

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Service
//@ContextConfiguration
@Transactional('makTranactionManager')
class Bootstrap{
    Bootstrap( LocationRepository repo ) {
        locationRepository = repo
    }
//    @PersistenceContext
//    private EntityManager entityManager

//    @Autowired
    final static ProductRepository productRepo = new ProductRepository()

//    @Autowired
    LocationRepository locationRepository

//    @Transactional
    void bootstrap(@NonNull EntityManager em)
    {
        LocationRepository lr = locationRepository
//        lr.entityManager = em
        Location p = new Location()
//        em.transaction.begin()
        lr.create(p)
//        em.transaction.commit()
        println( p + "")
    }
    void bootstrap()
    {
        LocationRepository lr = locationRepository
//        lr.entityManager = em
        Location p = new Location()
//        em.transaction.begin()
        lr.create(p)
//        em.transaction.commit()
        println( "${p}")
    }
    static void bootstrap0()
    {
        Product p = new Product()
        p.name = "Rio" ; p.price = 90
        productRepo.create(p)
        println( p + "")
    }
}
