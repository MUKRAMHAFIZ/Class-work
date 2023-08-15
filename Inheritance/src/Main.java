public class Main {


    public static class Animal{ //superclass to be inherited from
        String sound = "MEOW!";
    }

    public static class cat extends Animal{ //subclass inherited from Animal
        void catting(){
            System.out.println("Hello i am a cat " +this.sound);    //method that prints text
        }


    }

    public static void main(String[] args) {

        cat moo = new cat(); //object creation from cat class
        moo.catting();      //method call catting

    }

    }
