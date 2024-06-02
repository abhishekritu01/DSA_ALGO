package assignments.assign03;

import java.util.Scanner;

public class Area {
    private static Scanner scanner = new Scanner(System.in);

    private static void circleArea() {
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }

    public static void triangleArea() {
        System.out.print("Enter the base of the triangle: ");
        int base = scanner.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);
    }

    private static void rectangleArea() {
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }

    public static void isoscelesTriangleArea() {
        System.out.print("Enter the base of the isosceles triangle: ");
        int base = scanner.nextInt();
        System.out.print("Enter the height of the isosceles triangle: ");
        int height = scanner.nextInt();
        double area = 0.5 * base * height;
        System.out.println("The area of the isosceles triangle is: " + area);
    }

    public static void parallelogramArea() {
        System.out.println("Enter the base of Parallelogram: ");
        int base = scanner.nextInt();
        System.out.println("Enter the height of Parallelogram: ");
        int height = scanner.nextInt();
        double area = base * height;
        System.out.println("The area of the parallelogram is: " + area);
    }

    public static void rhombusArea() {
        System.out.println("Enter the base of Rhombus: ");
        int base = scanner.nextInt();
        System.out.println("Enter the height of Rhombus: ");
        int height = scanner.nextInt();
        double area = base * height;
        System.out.println("The area of the rhombus is: " + area);
    }

    public static void equilateralArea() {
        //equilateral triangle area = √3/4 * side^2
        System.out.print("Enter the side of the equilateral triangle: ");
        int side = scanner.nextInt();
        double area = (Math.sqrt(3) / 4) * side * side;  //√3/4 * side^2
        System.out.println("The area of the equilateral triangle is: " + area);
    }

    private static void totalSurfaceAreaCube() {
        //surface area of cube = 6a^2
        System.out.println("Enter the side of the cube: ");
        int side = scanner.nextInt();
        double area = 6 * side * side;
        System.out.println("The total surface area of the cube is: " + area);
    }

    private static void curvedSurfaceAreaCylinder() {
        //curved surface area of cylinder = 2πrh
        System.out.println("Enter the radius of the cylinder: ");
        int radius = scanner.nextInt();
        System.out.println("Enter the height of the cylinder: ");
        int height = scanner.nextInt();
        double area = 2 * Math.PI * radius * height;
        System.out.println("The curved surface area of the cylinder is: " + area);
    }

    private static void volumePyramid() {
        //volume of pyramid = 1/3 * base area * height
        System.out.println("Enter the base area of the pyramid: ");
        int baseArea = scanner.nextInt();
        System.out.println("Enter the height of the pyramid: ");
        int height = scanner.nextInt();
        double volume = (1.0 / 3) * baseArea * height;
        System.out.println("The volume of the pyramid is: " + volume);
    }

    private static void volumePrism() {
        //volume of prism = base area * height
        System.out.println("Enter the base area of the prism: ");
        int baseArea = scanner.nextInt();
        System.out.println("Enter the height of the prism: ");
        int height = scanner.nextInt();
        double volume = baseArea * height;
        System.out.println("The volume of the prism is: " + volume);
    }

    private static void volumeCone() {
        //volume of cone = 1/3 * πr^2h
        System.out.println("Enter the radius of the cone: ");
        int radius = scanner.nextInt();
        System.out.println("Enter the height of the cone: ");
        int height = scanner.nextInt();
        double volume = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.println("The volume of the cone is: " + volume);
    }

    private static void volumeSphere() {
        //volume of sphere = 4/3 * πr^3
        System.out.println("Enter the radius of the sphere: ");
        int radius = scanner.nextInt();
        double volume = (4.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("The volume of the sphere is: " + volume);
    }

    private static void volumeCylinder() {
        //volume of cylinder = πr^2h
        System.out.println("Enter the radius of the cylinder: ");
        int radius = scanner.nextInt();
        System.out.println("Enter the height of the cylinder: ");
        int height = scanner.nextInt();
        double volume = Math.PI * radius * radius * height;
        System.out.println("The volume of the cylinder is: " + volume);
    }

    private static void volumeCube() {
        //volume of cube = a^3
        System.out.println("Enter the side of the cube: ");
        int side = scanner.nextInt();
        double volume = side * side * side;
        System.out.println("The volume of the cube is: " + volume);
    }

    private static void volumeCuboid() {
        //volume of cuboid = l * b * h
        System.out.println("Enter the length of the cuboid: ");
        int length = scanner.nextInt();
        System.out.println("Enter the breadth of the cuboid: ");
        int breadth = scanner.nextInt();
        System.out.println("Enter the height of the cuboid: ");
        int height = scanner.nextInt();
        double volume = length * breadth * height;
        System.out.println("The volume of the cuboid is: " + volume);
    }

    private static void perimeterRhombus() {
        // perimeter of rhombus = 4 * side
        System.out.println("Enter the side of the rhombus: ");
        int side = scanner.nextInt();
        double perimeter = 4 * side;
        System.out.println("The perimeter of the rhombus is: " + perimeter);
    }

    private static void perimeterSquare() {
        // perimeter of square = 4 * side
        System.out.println("Enter the side of the square: ");
        int side = scanner.nextInt();
        double perimeter = 4 * side;
        System.out.println("The perimeter of the square is: " + perimeter);
    }

    private static void perimeterRectangle() {
        // perimeter of rectangle = 2 * (length + breadth)
        System.out.println("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();
        double perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

    private static void perimeterParallelogram() {
        // perimeter of parallelogram = 2 * (length + breadth)
        System.out.println("Enter the length of the parallelogram: ");
        int length = scanner.nextInt();
        System.out.println("Enter the breadth of the parallelogram: ");
        int breadth = scanner.nextInt();
        double perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of the parallelogram is: " + perimeter);
    }

    private static void perimeterEquilateral() {
        // perimeter of equilateral triangle = 3 * side
        System.out.println("Enter the side of the equilateral triangle: ");
        int side = scanner.nextInt();
        double perimeter = 3 * side;
        System.out.println("The perimeter of the equilateral triangle is: " + perimeter);
    }

    private static void circumeFerence() {
        // circumference of circle = 2 * π * radius
        System.out.println("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of the circle is: " + circumference);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("4. Isosceles Triangle");
        System.out.println("5. Parallelogram");
        System.out.println("6. Rhombus");
        System.out.println("7. Equilateral Triangle");
        System.out.println("8. Circumference of Circle");
        System.out.println("9. Perimeter of Equilateral Triangle");
        System.out.println("10. Perimeter of Parallelogram");
        System.out.println("11. Perimeter of Rectangle");
        System.out.println("12. Perimeter of Square");
        System.out.println("13. Perimeter of Rhombus");
        System.out.println("14. Perimeter of Isosceles Triangle");
        System.out.println("15. Perimeter of Triangle");
        System.out.println("16. Perimeter of Circle");
        System.out.println("17. Perimeter of Regular Polygon");
        System.out.println("18. Perimeter of Circle Sector");
        System.out.println("19. Volume of Cuboid");
        System.out.println("20. Volume of Cube");
        System.out.println("21. Volume of Cylinder");
        System.out.println("22. Volume of Sphere");
        System.out.println("23. Volume of Cone");
        System.out.println("24. Volume of Prism");
        System.out.println("25. Volume of Pyramid");
        System.out.println("26. Curved Surface Area of Cylinder");
        System.out.println("27. Total Surface Area of Cube");


        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

                circleArea();
                break;
            case 2:

                triangleArea();
                break;
            case 3:

                rectangleArea();
                break;
            case 4:
                isoscelesTriangleArea();
                break;
            case 5:
                parallelogramArea();
                break;
            case 6:
                rhombusArea();
                break;
            case 7:
                equilateralArea();
                break;

            case 8:
                circumeFerence();
                break;

            case 9:
                perimeterEquilateral();
                break;
            case 10:
                perimeterParallelogram();
                break;
            case 11:
                perimeterRectangle();
                break;
            case 12:
                perimeterSquare();
                break;
            case 13:
                perimeterRhombus();
                break;

            case 19:
                volumeCuboid();
                break;

            case 20:
                volumeCube();
                break;

            case 21:
                volumeCylinder();
                break;

            case 22:
                volumeSphere();
                break;

            case 23:
                volumeCone();
                break;

            case 24:
                volumePrism();
                break;

            case 25:
                volumePyramid();
                break;

            case 26:
                curvedSurfaceAreaCylinder();
                break;

            case 27:
                totalSurfaceAreaCube();
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }

}
