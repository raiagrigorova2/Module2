package Generics;

public abstract class GeometricObjectCompare<E> implements Comparable<E> {

	@Override
	public int compareTo(E o) {
		if(this.getArea() > ((GeometricObjectCompare) o).getArea()) {
			return 1;
		}
		if(this.getArea() == ((GeometricObjectCompare) o).getArea()) {
			return 0;
		}
		return -1;
	}
	
	public abstract double getArea();
	
	public static GeometricObjectCompare max(GeometricObjectCompare x, GeometricObjectCompare y) {
		//if both are equal, then it returns the first one.
		if(x.compareTo(y) == 1 || x.compareTo(y) == 0) return x;	
		return y;
	}




}
