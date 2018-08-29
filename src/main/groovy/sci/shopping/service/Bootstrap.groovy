package sci.shopping.service

import com.guitar.model.Location
import com.guitar.repository.LocationRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
//@ContextConfiguration
@Transactional('makTranactionManager')
class Bootstrap{

    @Autowired
    LocationRepository locationRepository


    void bootstrap()
    {
        Location p = new Location()
        locationRepository.create(p)
        println( "${p}")
    }


//    @Autowired
//    final static ProductRepository productRepo = new ProductRepository()
//
//    static void bootstrapProduct()
//    {
//        Product p = new Product()
//        p.name = "Rio" ; p.price = 90
//        productRepo.create(p)
//        println( p + "")
//    }
}
