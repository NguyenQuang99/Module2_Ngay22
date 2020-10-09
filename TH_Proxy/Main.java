package TH_Proxy;

public class Main {
    public static void main(String[] args) {
        MathProxy mathProxy = new MathProxy();
        double result = mathProxy.add(1,2);
        System.out.println("1+2 = " + result);
        result = mathProxy.add(2,Double.MAX_VALUE);
        System.out.println(result);

    }
}
