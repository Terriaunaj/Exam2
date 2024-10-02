
public class Cone implements Shape3D{

	private double radius;
	private double height;
	
	public Cone(double radius, double height){
		this.radius = radius;
		this.height = height;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		if(radius < 0 || height < 0) {
			return 0;
		}
		return Math.PI * radius * radius * (height/3);
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
	}

	
	
}
