
public abstract class GUI {

    /**
     This is used to define the user interface
     */
    static userInterface DEFAULT_UI;
    abstract void gShow();
    abstract void gEnter();
    /**
     this is used to switch the GUI
     */
    static void toggle(){
        if(DEFAULT_UI==userInterface.GRAPHICAL)
            DEFAULT_UI=userInterface.TERMINAL;
        else
            DEFAULT_UI=userInterface.GRAPHICAL;
    }
}

