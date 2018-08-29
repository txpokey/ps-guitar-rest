package sci.shopping

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement
import sci.shopping.service.Bootstrap

@EntityScan(["sci.shopping.domain","com.guitar.model"])
@EnableJpaRepositories(basePackages=["com.guitar.repository", "sci.shopping.repo"])
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = ["sci.security.config","sci.shopping.*", "com.guitar"])

class Main {
    static void main(String[] args) {
        SpringApplication.run(Main.class, args)
    }

    @Autowired
    Bootstrap shoppingBootstrap

    @EventListener(ApplicationReadyEvent.class)
    void EventListenerExecute(){
        println("Application Ready Event is successfully Started")
        shoppingBootstrap.bootstrap()
        println("Application Ready Event:done> bootstrap()")
    }
}
