package Protected;
import AccessModifier.Protected;

class ProtectedMain1 extends Protected{
    public static void main(String[] args) {
        Protected o1 =new ProtectedMain();

        System.out.println(o1.name());
        o1.display();
    }
}