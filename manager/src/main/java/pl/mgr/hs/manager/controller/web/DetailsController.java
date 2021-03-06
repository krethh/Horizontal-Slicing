package pl.mgr.hs.manager.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.mgr.hs.manager.constant.Constants;
import pl.mgr.hs.manager.facade.SliceFacade;

/** Created by dominik on 24.10.18. */
@Controller
public class DetailsController {

  public static final String DETAILS_URL = "/details";
  private final SliceFacade sliceFacade;

  @Autowired
  public DetailsController(SliceFacade sliceFacade) {
    this.sliceFacade = sliceFacade;
  }

  @GetMapping(DETAILS_URL + "/{sliceId}")
  String getSliceDetails(@PathVariable("sliceId") int id, Model model) {
    model.addAttribute("slice", sliceFacade.getSlice(id));

    return Constants.Pages.DETAILS;
  }
}
