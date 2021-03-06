package pl.mgr.hs.manager.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** Created by dominik on 25.10.18. */
@Data
@Entity
public class Application {
  @Id @GeneratedValue private Integer id;
  private String image;
  private Integer publishedPort;
  private String command;
  private Boolean useLocalRegistry;
}
