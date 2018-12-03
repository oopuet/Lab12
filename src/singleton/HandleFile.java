package singleton;

public class HandleFile {
    private HandleFile(){}

    private static HandleFile instance;

    public static HandleFile getInstance() {
        if (instance == null)
            instance = new HandleFile();
        return instance;
    }

    private boolean _isOpen = false;
    public boolean isOpened() {
        return _isOpen;
    }

    /**
     * long task
     * only allow one request at specific time
     */
    public void process() {
        if (isOpened())
            // waiting
            return;
        else
            _isOpen = true;
            ;
        // working with file

    }



}

