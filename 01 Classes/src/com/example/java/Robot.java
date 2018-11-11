package com.example.java;

public class Robot {
    public static final String nothing = "Nothing";

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
        this.handContent = nothing;
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

    private void checkHandState(Hand hand){
        if(hand.isOpen()){
            System.out.println(this.name + " is drop " + this.handContent);
            this.handContent = nothing;
        }
    }

    public void openLeftHand(){
        System.out.println(this.name + ": Open Left Hand!");
        this.leftHand.Open();

        checkHandState(leftHand);
    }

    public void openRightHand(){
        System.out.println(this.name + ": Open Right Hand!");
        this.rightHand.Open();

        checkHandState(rightHand);
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

    private String robotBothHandOpen(){
        return  "   O    \n" +
                "-- | -- \n" +
                "        \n" +
                "  / \\  \n" ;
    }

    private String robotBothHandClosed(){
        return  "   O    \n" +
                " | | |  \n" +
                "        \n" +
                "  / \\  \n" ;
    }

    private String robotRightHandClosed(){
        return  "   O     \n" +
                " | | --@ \n" +
                "         \n" +
                "  / \\   \n" ;
    }

    private String robotLeftHandClosed(){
        return  "   O     \n" +
                "@-- | |  \n" +
                "         \n" +
                "  / \\   \n" ;
    }

    private String getRobotASCIIArt(){
        if(leftHand.isClosed() && rightHand.isClosed()){
            return robotBothHandClosed();
        }

        if(leftHand.isClosed()){
            return robotRightHandClosed();
        }

        if(rightHand.isClosed()){
            return robotRightHandClosed();
        }

        return robotBothHandOpen();
    }

    @Override
    public String toString(){
        String robotASCII = getRobotASCIIArt();

        if(handContent.equals(nothing)){
            robotASCII.replace("@", "");
        }

        return robotASCII;
    }
}
