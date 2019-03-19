package cclms.app.util;

import ilog.odm.datasvc.IloLock;
import ilog.odm.datasvc.IloLockable;
import ilog.odm.datasvc.IloScenario;
import ilog.odm.processingsvc.IloProcessingService;
import ilog.odm.processingsvc.action.IloPostProcessSolveJobOutputs;
import ilog.odm.processingsvc.action.IloPrepareJobSubmission;
import ilog.odm.service.IloService;
import ilog.odm.service.IloServiceInitHook;

public class ServiceHook extends IloServiceInitHook {
  @Override
  public void postInitialize(IloService service) {
    if (service instanceof IloProcessingService) {
      // Post processing
      ((IloProcessingService)service).registerServiceHook(IloPostProcessSolveJobOutputs.class,
          new IloPostProcessSolveJobOutputs() {
            @Override
            public void invoke(Parameters params) {
              IloScenario sc = params.getScenario();
              System.out.println("Iam Service Hook Post processing["+"cclms.app.util.ServiceHook"+"]...");
            }
          });

      // Pre processing
      ((IloProcessingService) service).registerServiceHook(IloPrepareJobSubmission.class,
          new IloPrepareJobSubmission() {
            @Override
            public void invoke(Parameters params) {
              IloScenario sc = params.getScenario();
              IloLock scLock = null;
              try {
                scLock = sc.addLock(IloLockable.EXCLUSIVE_WRITE_LOCK);
                System.out.println("Pre processing["+"cclms.app.util.ServiceHook"+"]...1");
              } catch (Exception e) {
                e.printStackTrace();
              } finally {
                if (scLock != null) sc.removeLock(scLock);
              }
            }
          });
    }
  }
}
