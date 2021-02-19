package Generics;

public abstract class GeometricObjectCompare <E> implements Comparable<E> {

	@Override
	public int compareTo(E o) {
		return(Double.compare(this.getArea(),((GeometricObjectCompare<E>) o).getArea()));
	}
	
	public abstract double getArea();
	
	public static GeometricObjectCompare max(GeometricObjectCompare x, GeometricObjectCompare y) {
		//if both are equal, then it returns the first one.
		if(x.compareTo(y) == 1 || x.compareTo(y) == 0) return x;	
		return y;
	}


//	��������� ����� GeometricObject � ���������������
//	���������� Comparable, ����� �� �������� ������ �� ��������.
//	��������� GenericSort � ������� ������ �� ����� Circle �  Rectangle.
//	����������� ���������� �����. �������� ��������, �� ������� toString() ������
//	�� �� overrifde-�� � Circle �  Rectangle, �� �� ������ ������� printList()

}
