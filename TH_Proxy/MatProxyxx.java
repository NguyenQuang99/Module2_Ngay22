package TH_Proxy;

public class MathProxy implements Calculator {
    private TH_Proxy.MathProxy mathProxy;

    public MathProxy() {
        this.mathProxy = new TH_Proxy.MathProxy();
    }

    @Override
    public double add(double first, double second) {
        if(first /2 + second / 2 >= Double.MAX_VALUE /2) {
            throw new RuntimeException("Out of range");
        }
        if(first /2 + second /2 <= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        return mathProxy.add(first,second);
    }

    @Override
    public double sub(double first, double second) {
        if(first / 2 - second / 2 >= Double.MAX_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
        if(first / 2 - second / 2 <= Double.MIN_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
        return mathProxy.sub(first, second);
    }

    @Override
    public double mul(double first, double second) {
        double result = mathProxy.mul(first, second);
        if(first != 0 && result / first != second){
            throw new RuntimeException("Out of range");
        }
        return result;
    }

    @Override
    public double div(double first, double second) {
        if(second == 0){
            throw new RuntimeException("Can't divide by zero");
        }
        return mathProxy.div(first, second);
    }

}
