package com.erickjvallejo.mvp;

import javax.swing.*;

public class ViewImpl implements View {

    private String label;
    private Presenter presenter;

    public ViewImpl() {

    }

    public void initOnlyWithView() {
        presenter = new Presenter(this);
        showProgressBar();
        hideProgressBar();
        presenter.updateName("John");
        showProgressBar();
        hideProgressBar();
        presenter.updateLastname("Doe");
    }


    public void initWithViewAndModel() {
        presenter = new Presenter(this, new Model());
        showProgressBar();
        hideProgressBar();
        presenter.updateName("Jane");
        showProgressBar();
        hideProgressBar();
        presenter.updateLastname("Doe");
    }

    public void updateUserInfoTextView(String user) {
        label = user;
        updateGui();
    }

    private void updateGui() {
        JOptionPane.showMessageDialog(null, this.label);
    }

    public void showProgressBar() {
        System.out.println("Processing....");

    }

    public void hideProgressBar() {
        System.out.println("Ok!");

    }


}

