public class Main {
            public static void main(String[] args) {
                // Create objects
                SHAPE circle = new circle(5.0);
                SHAPE rectangle = new rectangle(4.0, 6.0);

                // Call methods
                circle.displayShapeType();
                System.out.println("Area of circle: " + circle.calculateArea());

                rectangle.displayShapeType();
                System.out.println("Area of rectangle: " + rectangle.calculateArea());
                System.out.printf("Repot");
            }

        }
