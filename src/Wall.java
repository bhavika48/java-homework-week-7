public class Wall {
    double width;          // instance variable
    double height;

    public Wall() {
    }

    public Wall(double w, double h) {       //constructor with parameters
        if (w < 0) {
            this.width = 0;
        } else {
            this.width = w;
        }

        if (h < 0) {
            this.height = 0;
        } else {
            this.height = h;
        }
    }

    public double getWidth() {      //method without parameter
        return width;
    }

    public double getHeight() {
        return height;
    }   // method without return type

    public void setWidth(double w) {        //method with parameter
        if (w < 0) {
            this.width = 0;
        } else {
            this.width = w;
        }
    }

    public void setHeight(double h) {   //method with parameter
        if (h < 0) {
            this.height = 0;
        } else {
            this.height = h;
        }
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);               //method calling in main method
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}
