package pl.mgr.hs.docker.util.service.dockercli;

import pl.mgr.hs.docker.util.service.CliExecutorService;

/** Created by dominik on 20.11.18. */
public class DefaultDockerCliService extends CliExecutorService implements DockerCliService {
  // TODO
  private static final String DOCKER_START_COMMAND = "docker start -ai %s %s";

  @Override
  public void startContainerInteractive(String containerId, String containerCommand) {
    executeCommandInteractive(String.format(DOCKER_START_COMMAND, containerId, containerCommand));
  }
}
