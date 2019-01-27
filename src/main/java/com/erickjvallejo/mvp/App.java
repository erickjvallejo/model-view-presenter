package com.erickjvallejo.mvp;

public class App {

    //How to work the MVP: Model View Controller

    public static void main(String[] args) {

        //Sample when I have only the presenter manage the model
        System.out.println("Sample when I have only the presenter manage the model");
        ViewImpl view1 = new ViewImpl();
        view1.initOnlyWithView();

        //Sample when I have the presenter and model, and I am creating and sending the model
        System.out.println("Sample when I have the presenter and model, and I am creating and sending the model");
        ViewImpl view2 = new ViewImpl();
        view2.initWithViewAndModel();

        System.exit(0);

    }
}
