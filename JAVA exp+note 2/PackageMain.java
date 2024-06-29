package p1;

class Package{
    void Display(){
        System.out.println("Package class Example");
    }
}

class PackageMain{
    public static void main(String[] args) {
        Package obj = new Package();
        obj.Display();
    }
}

//package class file is complie with javac -d . Objectfile.java
//java package_name. onjectfile