package roadgraph;

import java.util.Comparator;

import geography.GeographicPoint;
import javafx.util.Pair;

public class comparator implements Comparator<Pair<GeographicPoint, Double>> {

	@Override
	public int compare(Pair<GeographicPoint, Double> o1, Pair<GeographicPoint, Double> o2) {
		int value = (o1.getValue()).compareTo(o2.getValue());
		return value;
	}
	

}
