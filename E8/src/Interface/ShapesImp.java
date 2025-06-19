package Interface;

public class ShapesImp implements Shapes {
	
	public void areaOfSquare(int sides)
	{
		int area = sides * sides;
		System.out.println(area);
	}
	public void perimeterOfSquare(int sides)
	{
		int perimeter = 4*sides;
		System.out.println(perimeter);
	}
	public void areaOfCircle(int rad)
	{
		double area = pie *(rad*rad);
		System.out.println(area);
	}

}
