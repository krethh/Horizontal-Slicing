package pl.mgr.hs.docker.util.service.remote;

import com.spotify.docker.client.messages.Container;
import com.spotify.docker.client.messages.swarm.Node;
import com.spotify.docker.client.messages.swarm.Service;
import com.spotify.docker.client.messages.swarm.Swarm;
import com.spotify.docker.client.messages.swarm.Task;
import pl.mgr.hs.docker.util.service.DockerMachineEnv;

import java.util.List;
import java.util.Optional;

/** Created by dominik on 24.10.18. */
public interface DockerIntegrationService {
  List<Node> getNodes(DockerMachineEnv machineEnv);

  List<Node> getNodes();

  List<Task> getTasksForNode(DockerMachineEnv machineEnv, String nodeId);

  List<Task> getTasksForNode(String nodeId);

  Optional<Swarm> getSwarmConfiguration(DockerMachineEnv machineEnv);

  Optional<Swarm> getSwarmConfiguration();

  List<Service> getServices(DockerMachineEnv machineEnv);

  List<Service> getServices();

  List<Container> getContainers(DockerMachineEnv machineEnv, boolean onlyRunningContainers);

  List<Container> getContainers(boolean onlyRunningContainers);

  void removeNodesFromSwarm(DockerMachineEnv machineEnv, List<String> nodeIds);

  void removeNodesFromSwarm(List<String> nodeIds);

  void joinSwarm(String joinToken, String advertiseAddress);

  void leaveSwarm(DockerMachineEnv machineEnv);

  void leaveSwarm();

  void initSwarm(DockerMachineEnv machineEnv);

  void initSwarm(DockerMachineEnv machineEnv, String advertiseAddress);

  void initSwarm(String advertiseAddress);

  void createSliceService(DockerMachineEnv machineEnv, String imageId, Integer port);

  void createSliceService(String imageId);

  void createSliceService(String imageId, Integer port);

  void removeServerContainer(DockerMachineEnv machineEnv);

  void removeServerContainer();

  void restartServerContainer(DockerMachineEnv machineEnv);

  void restartServerContainer();

  void createServerContainer(
      DockerMachineEnv machineEnv, String imageId, Integer publishedPort, List<String> command);

  void createServerContainer(String imageId, Integer publishedPort, List<String> command);

  void rotateWorkerJoinToken(DockerMachineEnv machineEnv);

  void rotateWorkerJoinToken();

  Optional<Container> getClientAppContainer();
}
