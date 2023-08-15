public class Main {

    static class bigcat{ //superclass

        void meow(){  //superclass method
            System.out.println("meeeeeeeeeeeow");
        }
    }

    static class smallcat extends bigcat{ //subclass
        void meow(){  //subclass method
            System.out.println("meop");
        }
    }


    public static void main(String[] args) {

        bigcat cat = new bigcat();  //new bigcat object called cat
        smallcat kitten = new smallcat(); //new smallcat object called kitten

        cat.meow();
        kitten.meow();


    }
}