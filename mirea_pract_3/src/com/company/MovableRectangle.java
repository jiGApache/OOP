package com.company;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString(){
        return "topLeft-" + topLeft + " bottomRight-" + bottomRight;
    }

    private boolean checkSpeed(){
        if(topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed){
            return true;
        } else
            return false;
    }

    public void moveDown() {
        if(checkSpeed()){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    public void moveUp(){
        if(checkSpeed()){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    public void moveLeft(){
        if(checkSpeed()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    public void moveRight(){
        if(checkSpeed()){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
}
