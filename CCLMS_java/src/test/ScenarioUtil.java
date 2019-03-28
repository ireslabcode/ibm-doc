package test;

import ilog.odm.datasvc.IloDataException;
import ilog.odm.datasvc.IloDataService;
import ilog.odm.datasvc.IloLock;
import ilog.odm.datasvc.IloLockable;
import ilog.odm.datasvc.IloScenario;
import ilog.odm.datasvc.IloScenarioLink;
import ilog.odm.datasvc.IloWorkspaceFolder;
import ilog.odm.datasvc.IloWorkspaceItem;
import ilog.odm.service.IloApplicationContext;
import ilog.odm.studio.workspacesvc.IloWorkspaceService;

public class ScenarioUtil {

  public static void changeCurrentScenario(IloApplicationContext context, IloScenarioLink scenarioLink) {
   System.out.println("changeCurrent Scenario");
	  IloWorkspaceService workspaceService = context.getService(IloWorkspaceService.class);
    workspaceService.setKeyScenarioLink(IloWorkspaceService.CURRENT_KEY, scenarioLink);
    workspaceService.clearTag(IloWorkspaceService.SELECTED_TAG);
    workspaceService.addTag(scenarioLink, IloWorkspaceService.SELECTED_TAG);
  }

  public static void changeReferenceScenario(IloApplicationContext context, IloScenarioLink scenarioLink) {
    System.out.println("change Reference");
	  IloWorkspaceService workspaceService = context.getService(IloWorkspaceService.class);
    workspaceService.setKeyScenarioLink(IloWorkspaceService.REFERENCE_KEY, scenarioLink);
  }

  //--------------------
  // Scenario management
  //--------------------

  /** 
   * Name must be unique in folder (see getUniqueName function)
   * @param dataService
   * @param folder
   * @param name
   * @return
   */
  public static IloScenarioLink createScenario(IloDataService dataService, IloWorkspaceFolder folder, String name) {
    // Create a scenario
	  System.out.println("create scenario");
    IloScenarioLink link = null;
    IloScenario scenario = null;
    IloLock scLock = null;
    try {
      // duplicate reference
      link = folder.createChildScenario(-1);
      scenario = link.getScenario();
      scLock = scenario.addLock(IloLockable.EXCLUSIVE_WRITE_LOCK);
      // name scenario
      scenario.setName(name);
      scenario.save();
      scenario.removeLock(scLock);
      scLock = null;
    } catch (IloDataException e) {
      e.printStackTrace();
    } finally {
      if (scLock != null) scenario.removeLock(scLock);
    }
    return link;
  }

 public static IloScenarioLink getScenario(IloWorkspaceFolder folder, String name) {
    for (IloWorkspaceItem item : folder.getChildren()) {
    System.out.println("get scenario");
    }
	return null;
    }

  //--------------------
  // Folder management
  //--------------------
    
 
}
 