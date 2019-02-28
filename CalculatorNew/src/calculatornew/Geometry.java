package calculatornew;


public class Geometry {
    
    public int calculateSquarePerimeter(int sideLenght) {
        
        int perimeter = sideLenght * 4;
        return perimeter;
    }
    
    public int calculateSquareSurface(int sideLenght) {
        int surface = sideLenght * sideLenght;
        return surface;
    }
    public int calculateTriangleSurface(int triangleSideA, int triangleSideH) {
        int surfaceTriangle = (triangleSideA * triangleSideH) / 2;
        return surfaceTriangle;
    }
    public int calculateTrianglePerimeter(int triangleSideA, int triangleSideB, int triangleSideC){
        int perimeterTriangle = triangleSideA + triangleSideB + triangleSideC;
        return perimeterTriangle;
    }
    public int calculateRectangleSurface(int rectangleSideA, int rectangleSideB) {
        int surfacePerimeter = rectangleSideA * rectangleSideB;
        return surfacePerimeter;
    }  
    public int calculateRectanglePerimeter(int rectangleSideA, int rectangleSideB) {
        int perimeterRectangle = 2 * (rectangleSideA + rectangleSideB);
        return perimeterRectangle;
    }
    public int calculateRhombusSurface(int rhombusSideA, int rhombusSideB) {
        int surfaceRhombus = rhombusSideA * rhombusSideB;
        return surfaceRhombus;
    }
    public int calculatePhombusPerimeter(int sideLenght) {
        int perimeterRhombus = sideLenght * 4;
        return perimeterRhombus;
    }

    }
    
    
    //rectangle surface
    //rectangle perimeter
//        System.out.println("Please enter square side lenght:");
//        int squareSide = keyboardScanner.nextInt();
//        // 2. Calculate perimeter
//        int perimeter = 4 * squareSide;
//        // 3. Calculate surface
//        int surface = squareSide * squareSide;
//        // 4. Display the result
//        System.out.println("Surface " + surface + "; Perimeter:" + perimeter);
//
//        System.out.println("Please enter square rectangle size;");
//        System.out.println("Lenght:");
//        // 5. Calculating Rectangle
//        int lenght = keyboardScanner.nextInt();
//        System.out.println("Width");
//        int width = keyboardScanner.nextInt();
//        int rectPerimeter = (lenght + width) * 2;
//        int rectSurface = lenght * width;
//        System.out.println("Rectangle: Surface " + rectSurface + "; Perimeter:" + rectPerimeter);
    

