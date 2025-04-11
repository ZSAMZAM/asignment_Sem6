class Circle extends SHAPE {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        // Implement calculateArea
        @Override
        double calculateArea() {
            return Math.PI * radius *radius;
}
    }

