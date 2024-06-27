import java.util.Arrays;
import java.util.List;

class ExeptionMain{
    public static void main(String[] args) {
        int a=2;
        int b=0;

        
        try{
            int c= a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Its not possible to do it");
        }
        
        // ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: "  );
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            int value = arr[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: "  );
        }

        // ArrayStoreException
        try {
            Object[] objArray = new String[5];
            objArray[0] = new Integer(1);
        } catch (ArrayStoreException e) {
            System.out.println("Caught an ArrayStoreException: "  );
        }

        // ClassCastException
        try {
            Object x = new Integer(0);
            System.out.println((String)x);
        } catch (ClassCastException e) {
            System.out.println("Caught a ClassCastException: "  );
        }

        // IllegalArgumentException
        try {
            Thread t = new Thread();
            t.setPriority(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: "  );
        }

        // IllegalMonitorStateException
        try {
            Object obj = new Object();
            obj.notify();
        } catch (IllegalMonitorStateException e) {
            System.out.println("Caught an IllegalMonitorStateException: "  );
        }

        // IllegalStateException
        try {
            throw new IllegalStateException("This is an IllegalStateException");
        } catch (IllegalStateException e) {
            System.out.println("Caught an IllegalStateException: "  );
        }

        // IllegalThreadStateException
        try {
            Thread t = new Thread();
            t.start();
            t.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("Caught an IllegalThreadStateException: "  );
        }

        // IndexOutOfBoundsException
        try {
            String str = "hello";
            char c = str.charAt(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: "  );
        }

        // NegativeArraySizeException
        try {
            int[] arr = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught a NegativeArraySizeException: "  );
        }

        // NullPointerException
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: "  );
        }

        // NumberFormatException
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: "  );
        }

        // SecurityException
        try {
            System.getSecurityManager().checkRead("test.txt");
        } catch (SecurityException e) {
            System.out.println("Caught a SecurityException: "  );
        }

        // StringIndexOutOfBoundsException
        try {
            String str = "hello";
            char c = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException: "  );
        }

        // UnsupportedOperationException
        try {
            List<String> list = Arrays.asList("one", "two");
            list.add("three");
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: "  );
        }
    }
}
