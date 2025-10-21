package model.entities;

public class Matrix {
	private Integer size;
	private Integer string;
	private Integer column;
	private Integer matrix[][];
	
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getString() {
		return string;
	}
	public void setString(Integer string) {
		this.string = string;
	}
	public Integer getColumn() {
		return column;
	}
	public void setColumn(Integer column) {
		this.column = column;
	}
	public Integer[][] getMatrix() {
		return matrix;
	}
	public void setMatrix(Integer[][] matrix) {
		this.matrix = matrix;
	}
}
