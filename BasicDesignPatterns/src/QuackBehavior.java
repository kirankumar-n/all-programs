public interface QuackBehavior {
    public void quack();
}

class Quack implements QuackBehavior{
    public void quack() {
        System.out.println("I am quacking");
    }
}

class Squeak implements QuackBehavior{
    public void quack(){
        System.out.println("I am squeaking");
    }
}

class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("Silence");
    }
}