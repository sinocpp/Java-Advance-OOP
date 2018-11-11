package com.example.java;

public class Robot {
    private String name;
    private String colour;
    private Hand leftHand;
    private Hand rightHand;
    private String handContent;

    public Robot(String _name, String _colour){
        this.setName(_name);
        this.setColour(_colour);
        this.rightHand = new Hand();
        this.leftHand = new Hand();
        this.handContent = "Nothing";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName(){
        return this.name;
    }

    public String getColour() {
        return colour;
    }

    public String getHandContent() {
        return handContent;
    }

    public void closeLeftHand(){
        System.out.println(this.name + ": Close Left Hand!");
        this.leftHand.Close();
    }

    public void closeRightHand(){
        System.out.println(this.name + ": Close Right Hand!");
        this.rightHand.Close();
    }

    public void openLeftHand(){
        System.out.println(this.name + ": Open Left Hand!");
        this.leftHand.Open();
    }

    public void openRightHand(){
        System.out.println(this.name + ": Open Right Hand!");
        this.rightHand.Open();
    }

    public void setHandContent(String handContent) {
        this.handContent = handContent;
    }

    public void takeContant(String content){
        if(leftHand.isClosed() || rightHand.isClosed()){
            this.handContent = content;
            System.out.println(this.name + ": Robot Take " + content);
        } else {
            System.out.println(this.name + ": Cant take content! " + content);
        }
    }
}
