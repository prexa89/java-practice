package Methods;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ParameterizedMethod p = new ParameterizedMethod();
        p.add(100, 500);//method is not declared as a static so call this method by object creation
    }


    public  void add(int a, int b){
        System.out.println(a+b);
    }
    }

