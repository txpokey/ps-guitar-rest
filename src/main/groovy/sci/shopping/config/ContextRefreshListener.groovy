package sci.shopping.config

import org.springframework.boot.context.event.ApplicationStartedEvent
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component

@Component
/**
 * @deprecated
 */
class ContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent>{

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("Context Event Received:> " + contextRefreshedEvent )
    }
}


@Component
/**
 * @deprecated
 */
class ApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent>{

    @Override
    void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("Application Started Event :> " + event )
    }
}
