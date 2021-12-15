package Controller;

public class Controller {
    private ControllerAuthorization authorization;
    private ControllerOperation operation;
    private ControllerMaintenance maintenance;

    public void initialization() {

    }

    public ControllerAuthorization createControllerAuthorization() {
        return authorization;
    }

    public ControllerMaintenance createControllerMaintenance() {
        return maintenance;
    }

    public ControllerMenu createControllerMenu() {
        return null;
    }
}
