package com.shivam.practise.spring;

public class Triangle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("POINT A : {"+this.pointA.getX()+" , "+this.pointA.getY()+"}");
		System.out.println("POINT B : {"+this.pointB.getX()+" , "+this.pointB.getY()+"}");
		System.out.println("POINT C : {"+this.pointC.getX()+" , "+this.pointC.getY()+"}");
		
	}
	
	
	
}
