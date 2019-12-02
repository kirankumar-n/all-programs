public interface FlyBehavior {
    public void fly();
}

class FlyWithWings implements FlyBehavior{
    public void fly(){
        System.out.println("I am flying with wings");
    }
}

class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("I cant fly");
    }
}

class FlyRocketPowered implements FlyBehavior{
    public void fly(){
        System.out.println("Flying with rocket power");
    }
}
