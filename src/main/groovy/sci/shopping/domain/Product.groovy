package sci.shopping.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id
    @Column
    String name
    @Column
    Double price

}