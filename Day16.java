class Demo {

    Demo(){  // ik constructor banaya default wala
        System.out.println("Hello I am Base Constructor !!! ");
    }
    Demo (int a ){ // Ik constructor banaaya Parameterezied ke satth ...
        this(); // thhis isiliye use kiya kyunki kyunki ik he class me ...
        System.out.println(a);
    }
}
class Main extends Demo { // class Main Extend karaiye Demo se 

    Main(int a ){ // Main constructor parameterised wala 
        super(a); // Super tab use hoga Jab dusre class se Extend krke use karna ha 
        // yaha int a dusre class se use kiya isiliye Super use kiya 
    }

    public static void main(String[] args) {
        new Main(20); // yaha pe maine 
    }
}
