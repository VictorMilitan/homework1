package calculatornew;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CalculatorNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. User input
        Scanner keyboardScanner = new Scanner(System.in);
        Geometry geometry = new Geometry();
        System.out.println("Please enter square side");
        int squareSide = keyboardScanner.nextInt();
        int surface = geometry.calculateSquareSurface(squareSide);
        int perimeter = geometry.calculateSquarePerimeter(squareSide);
        System.out.println("Perimeter " + perimeter + " Surface " + surface);
        
        
        System.out.println("Calculating Surface of a triangle");
        System.out.println("Enter the sides of Triangle");
        System.out.println("Enter side A");
        int triangleSideA = keyboardScanner.nextInt();
        System.out.println("Enter side H");
        int triangleSideH = keyboardScanner.nextInt();
        int surfaceTriangle = geometry.calculateTriangleSurface(triangleSideA, triangleSideH);
        System.out.println("Surface = " + surfaceTriangle);
        
        System.out.println("Calculating perimeter of a triangle");
        System.out.println("Enter side A of a triangle");
        int tringlePerimeterSideA = keyboardScanner.nextInt();
        System.out.println("Enter side B of a triangle");
        int tringlePerimeterSideB = keyboardScanner.nextInt();
        System.out.println("Enter side C of a triangle");
        int tringlePerimeterSideC = keyboardScanner.nextInt();
        int perimeterTriangle = geometry.calculateTrianglePerimeter(tringlePerimeterSideA, tringlePerimeterSideB, tringlePerimeterSideC);
        System.out.println("Perimeter = "+ perimeterTriangle);
        
        System.out.println("Calculating surface and perimeter of a rectangle");
        System.out.println("Enter the sides of Rectangle");
        System.out.println("Enter side A");
        int rectangleSideA = keyboardScanner.nextInt();
        System.out.println("Enter side B");
        int rectangleSideB = keyboardScanner.nextInt();
        int surfaceRectangle = geometry.calculateRectangleSurface(rectangleSideA, rectangleSideB);
        int perimeterRectangle = geometry.calculateRectanglePerimeter(rectangleSideA, rectangleSideB);
        System.out.println("Surface " + surfaceRectangle + " Perimeter " + perimeterRectangle);
        
        System.out.println("Calculating surface of a rhombus");
        System.out.println("Enter the sides of Rhpmbus");
        System.out.println("Enter side A");
        int rhombusSideA = keyboardScanner.nextInt();
        System.out.println("Enter side B");
        int rhombusSideB = keyboardScanner.nextInt();
        int surfaceRhombus = geometry.calculateRhombusSurface(rhombusSideA, rhombusSideB);
        System.out.println("Surface = " + surfaceRhombus);
        System.out.println("Calculating perimeter of a rhombus");
        int rhombusSide = keyboardScanner.nextInt();
        int perimeterRhombus = geometry.calculatePhombusPerimeter(rhombusSide);
        System.out.println(" Perimeter " + perimeterRhombus);
        
        
        
        

        // another method
        // System.out.println("Enter your number");
        // int oddOrEven = keyboardScanner.nextInt();
        // String result = oddOrEven % 2 == 0 ? "even" : "false";
        // System.out.println("Result: " + oddOrEven + " is " + result);

        // Calculating is the number odd or even
        System.out.println("Please enter number to check:");
        int number = keyboardScanner.nextInt();
        Algebra algebra = new Algebra();
        algebra.detectOddOrEven(number);
                
        System.out.println("How many Fibonacci numbers to print?");
        int count = keyboardScanner.nextInt();
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        fibonacciGenerator.generateFibonacciList(count);

        }
    }
    

            
        
	
    
    
