package sci.shopping.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import sci.shopping.domain.Product
@Repository
interface ProductJpaRepository extends JpaRepository<Product, Long> {
}