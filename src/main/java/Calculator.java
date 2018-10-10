import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Calculator {

    private double oper1;
    private double oper2;
    private Character operation;
    private double result;

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public double getOper1() {
        return oper1;
    }

    public void setOper1(double oper1) {
        this.oper1 = oper1;
    }

    public double getOper2() {
        return oper2;
    }

    public void setOper2(double oper2) {
        this.oper2 = oper2;
    }

    public Character getOperation() {
        return operation;
    }

    public void setOperation(Character operation) {
        this.operation = operation;
    }

    public void calculate(double oper1, double oper2,char operation) {

        System.out.println("calculate function");

        switch (operation) {

            case '+' :
                result = oper1 + oper2;
                break;

            case '-' :
                result = oper1 - oper2;
                break;

            case  '*' :
                result = oper1 * oper2;
                break;

            case '/' :
                result = oper1 / oper2;
                break;
        }
        System.out.println("result = " + result);
    }
}
