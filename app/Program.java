package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.num.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				Shape temp = new Rectangle(color, width, height);
				list.add(temp);
				
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				Shape temp = new Circle(color, radius);
				list.add(temp);

			}
			
	
		}
		System.out.println("SHAPE AREAS:");
		for(Shape areas: list) {
			System.out.println(String.format("%.2f", areas.area()));
		
		sc.close();
	}

}

}