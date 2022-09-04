package roadgraph;

import geography.GeographicPoint;

public class MapEdge {
	// Member variables associated with an edge
	private final GeographicPoint start;
	private final GeographicPoint end;
	private final String roadName;
	private final String roadType;
	private final Double length;
	
	// Constructor
	public MapEdge(GeographicPoint u, GeographicPoint v, String name, String type, double len) {
		start = u;
		end = v;
		roadName = name;
		roadType = type;
		length = len;
	}
	
	// Getters
	public GeographicPoint getStart() {
		return start;
	}
	
	public GeographicPoint getEnd() {
		return end;
	}
	
	public Double getLength() {
		return length;
	}
	
}
