package sci.shopping.config

import com.guitar.repository.LocationRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.transaction.PlatformTransactionManager
import sci.shopping.service.Bootstrap

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Configuration
class ShoppingConfig{

    @PersistenceContext
    private EntityManager entityManager

    @Bean(name = 'locationRepository')
    LocationRepository getLocationRepository() {
        def candidate = privateGetLocationRepository()
        candidate
    }

    private LocationRepository privateGetLocationRepository() {
        LocationRepository candidate = new LocationRepository(entityManager)
    }

   @Bean(name = 'shoppingBootstrap')
    Bootstrap getBootstrap() {
       def locationRepository = privateGetLocationRepository()
       Bootstrap candidate = new Bootstrap(locationRepository)
       candidate
    }

    @Bean(name = 'makTranactionManager')
    PlatformTransactionManager getJpaTransactionManager() {
        def emf = entityManager.getEntityManagerFactory()
        new JpaTransactionManager(emf)
    }


}
