package com.MORTGAGE;

public class TextBox extends UIControl {
    /*
     *we have 1 FIELD
     *at first it was : public String text; but if we do not initialize it we may get problem
     *when creating OBJECTS. see the EXAMPLE OBJECTS
     */
    private String text = "";

    public TextBox(boolean isEnabled, String text) {
        super(isEnabled); // super() keyword to call the constructor of our base class;
        // must be first statement here. if not we get error.
        this.text = text;
        System.out.println("TextBox");
    }

    @Override    // this is an ANNOTATION= a label we attach to a class member. and with this we give
    // extra info to JAVA COMPILER: we are overriding toString() in object class
    public String toString(){
        return text;
    }


    // and 2 methods
    public void setText(String text){
        this.text = text;
    }
    public void clear() {
        text = "";
    }

    public String getText() {
        return text;
    }
}

