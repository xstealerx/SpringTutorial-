package de.oette.course.C01;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class DemoEntity {
  @Id
  @GeneratedValue
  private Long id;
}
