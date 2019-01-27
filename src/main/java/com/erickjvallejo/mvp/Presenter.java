package com.erickjvallejo.mvp;

public class Presenter {

    private View view;
    private Model model;

    //Option 1
    public Presenter(View view) {
        this.view = view;
        model = new Model();
    }

    //Option 2:
    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void updateName(String name) {
        model.setName(name);
        view.updateUserInfoTextView(model.toString());
    }

    public void updateLastname(String lastname) {
        model.setApellido(lastname);
        view.updateUserInfoTextView(model.toString());
    }


}