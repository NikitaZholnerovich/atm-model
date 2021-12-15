package View;

import Controller.*;

public class OperationWindow {
    private ControllerMoneyTransfer moneyTransfer;
    private ControllerBalanceView balanceView;
    private ControllerChangePinCode changePinCode;
    private ControllerTopUpPhoneAccount topUpPhoneAccount;
    private ControllerWithdrawMoney withdrawMoney;

    public ControllerMoneyTransfer createControllerMoneyTransfer() {
        return moneyTransfer;
    }

    public ControllerBalanceView createControllerBalanceView() {
        return balanceView;
    }

    public ControllerChangePinCode createControllerChangePinCode() {
        return changePinCode;
    }

    public ControllerTopUpPhoneAccount createControllerTopUpPhoneAccount() {
        return topUpPhoneAccount;
    }

    public ControllerWithdrawMoney createControllerWithdrawMoney() {
        return withdrawMoney;
    }
}
