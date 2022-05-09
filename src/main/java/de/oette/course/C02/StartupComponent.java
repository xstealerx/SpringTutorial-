package de.oette.course.C02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.annotation.Transactional;

public class StartupComponent {
  @Autowired
  private PersistDemoComponent persistDemoComponent;

  @EventListener(ApplicationReadyEvent.class)
  public void onStartup() {
    try {
      persistDemoComponent.persistEntitie();
      persistDemoComponent.persistEntitie();
      persistDemoComponent.persistEntitie();
      persistDemoComponent.persistEntitie();
    } catch (RuntimeException ex) {
      System.err.println(ex);
    }
  }
}
