package homeWork2;
public class BankAccount {
    double amount;
    double withDraw;
    double deposit;

    public double getWithDraw() {
        return withDraw;
    }

    public void setWithDraw(int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("Сумма на снятие больше чем остаток денег на счету",amount);

        }else {
            amount =- sum;}
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }


}
