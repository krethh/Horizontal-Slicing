package pl.mgr.hs.client.cli;

import pl.mgr.hs.client.cli.rest.data.slice.SliceListResponse;

/** Created by dominik on 18.11.18. */
public class MenuService {

  private static final String LIST_FORMAT = "%-30.30s %-60.60s \n";

  public void showUsage() {
    System.out.println(
        " Commands: \n"
            + " list - list of available slices \n"
            + " connect <slice name> - connect to slice \n"
            + " disconnect - disconnect from slice \n"
            + " service - attach to service application served by slice \n"
            + " exit - exit");
  }

  public void showList(SliceListResponse response) {
    System.out.printf(LIST_FORMAT, "NAME", "DESCRIPTION");

    response
        .getSlices()
        .forEach(
            sliceData ->
                System.out.printf(LIST_FORMAT, sliceData.getName(), sliceData.getDescription()));
  }

  public void showCommand() {
    System.out.println("Usage: \n" + " sliceclient <manager ip:port> \n");
  }
}