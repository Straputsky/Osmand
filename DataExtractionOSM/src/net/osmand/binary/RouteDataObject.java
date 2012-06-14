package net.osmand.binary;

import net.osmand.binary.BinaryMapRouteReaderAdapter.RouteRegion;
import net.osmand.binary.BinaryMapRouteReaderAdapter.RouteTypeRule;

public class RouteDataObject {
	/*private */static final int RESTRICTION_SHIFT = 3;
	/*private */static final int RESTRICTION_MASK = 7;
	
	public final RouteRegion region;
	// all these arrays supposed to be immutable!
	// These feilds accessible from C++
	public int[] types;
	public int[] pointsX;
	public int[] pointsY;
	public long[] restrictions;
	public int[][] pointTypes;
	public long id;

	public RouteDataObject(RouteRegion region) {
		this.region = region;
	}

	public RouteDataObject(RouteDataObject copy) {
		this.region = copy.region;
		this.pointsX = copy.pointsX;
		this.pointsY = copy.pointsY;
		this.types = copy.types;
		this.restrictions = copy.restrictions;
		this.pointTypes = copy.pointTypes;
		this.id = copy.id;
	}

	public long getId() {
		return id;
	}

	public int getPoint31XTile(int i) {
		return pointsX[i];
	}

	public int getPoint31YTile(int i) {
		return pointsY[i];
	}

	public int getPointsLength() {
		return pointsX.length;
	}

	public int getRestrictionLength() {
		return restrictions == null ? 0 : restrictions.length;
	}

	public int getRestrictionType(int i) {
		return (int) (restrictions[i] & RESTRICTION_MASK);
	}

	public long getRestrictionId(int i) {
		return restrictions[i] >> RESTRICTION_SHIFT;
	}

	public void insert(int pos, int x31, int y31) {
		int[] opointsX = pointsX;
		int[] opointsY = pointsY;
		int[][] opointTypes = pointTypes;
		pointsX = new int[pointsX.length + 1];
		pointsY = new int[pointsY.length + 1];
		boolean insTypes = this.pointTypes != null && this.pointTypes.length > pos;
		if (insTypes) {
			pointTypes = new int[opointTypes.length + 1][];
		}
		int i = 0;
		for (; i < pos; i++) {
			pointsX[i] = opointsX[i];
			pointsY[i] = opointsY[i];
			if (insTypes) {
				pointTypes[i] = opointTypes[i];
			}
		}
		pointsX[i] = x31;
		pointsY[i] = y31;
		if (insTypes) {
			pointTypes[i] = null;
		}
		for (i = i + 1; i < pointsX.length; i++) {
			pointsX[i] = opointsX[i - 1];
			pointsY[i] = opointsY[i - 1];
			if (insTypes && i < pointTypes.length) {
				pointTypes[i] = opointTypes[i - 1];
			}
		}

	}

	public int[] getPointTypes(int ind) {
		if (pointTypes == null || ind >= pointTypes.length) {
			return null;
		}
		return pointTypes[ind];
	}

	public String getHighway() {
		String highway = null;
		int sz = types.length;
		for (int i = 0; i < sz; i++) {
			RouteTypeRule r = region.quickGetEncodingRule(types[i]);
			highway = r.highwayRoad();
			if (highway != null) {
				break;
			}
		}
		return highway;
	}
}