package gui;

public class Room1 {
    private String area;
    private String title;

    private Room1 forward;
    private Room1 left;
    private Room1  right;


    public Room1 getLeft() {
        return left;
    }

    public void setLeft(Room1 left) {
        this.left = left;
    }

    public Room1 getRight() {
        return right;
    }

    public void setRight(Room1 right) {
        this.right = right;
    }

    public Room1 getForward() {
        return forward;
    }

    public void setForward(Room1 forward) {
        this.forward = forward;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
