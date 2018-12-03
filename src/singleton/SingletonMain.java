package singleton;

public class SingletonMain{
    public static void main(String[] args) {

        HandleFile handleFile = HandleFile.getInstance();
        handleFile.process();

        HandleFile handleFile1 = HandleFile.getInstance();
        handleFile1.process();


//        HandleFile handleFile = new HandleFile();
//        handleFile.process();
//
//        HandleFile handleFile1 = new HandleFile();
//        handleFile1.process();
    }
}
