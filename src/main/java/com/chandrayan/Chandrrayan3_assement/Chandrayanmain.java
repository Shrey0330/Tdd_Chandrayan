package com.chandrayan.Chandrrayan3_assement;

import org.w3c.dom.ranges.RangeException;

class Chandrayanmain {
	private char[] move;
	private int x, y, z;
	private String direction;
	private String previousDir;
	private String previousDirComplement;
	private boolean verticalAxis = false;

	Chandrayanmain(int x, int y, int z, String dir, char[] move) throws Exception {
		if (x < -100 || x > 100 || y < -100 || y > 100 || z < -100 || z > 100)
			throw new Exception("Out of range of galatics coordinate");
		if (dir != "N" && dir != "S" && dir != "E" && dir != "W" && dir != "Up" && dir != "Down") {
			throw new NullPointerException("Invalid Input");
		}
		for (char c : move) {
			if (c != 'f' && c != 'b' && c != 'l' && c != 'r' && c != 'u' && c != 'd' && c != ' ') {
				throw new NullPointerException("Invalid Input");
			}
		}
		this.setX(x);
		this.setY(y);
		this.setZ(z);
		this.setDirection(dir);
		this.move = move;
		this.previousDir = dir;
	}

	void previousDirComplement(String previousDir) {

		if (previousDir.equals("N"))
			previousDirComplement = "S";
		else if (previousDir.equals("S"))
			previousDirComplement = "N";
		else if (previousDir.equals("W"))
			previousDirComplement = "E";
		else if (previousDir.equals("E"))
			previousDirComplement = "W";
		else if (previousDir.equals("Up"))
			previousDirComplement = "Down";
		else if (previousDir.equals("Down"))

			previousDirComplement = "Up";

	}

	void moveRocketForward() {

		if (getDirection().equals("N"))
			setY(getY() + 1);
		else if (getDirection().equals("S"))
			setY(getY() - 1);
		else if (getDirection().equals("W"))
			setX(getX() - 1);
		else if (getDirection().equals("E"))
			setX(getX() + 1);
		else if (getDirection().equals("Up"))
			setZ(getZ() + 1);
		else if (getDirection().equals("Down"))

			setZ(getZ() - 1);

	}

	void moveRocketBackward() {

		if (getDirection().equals("N"))
			setY(getY() - 1);
		else if (getDirection().equals("S"))
			setY(getY() + 1);
		else if (getDirection().equals("W"))
			setX(getX() + 1);
		else if (getDirection().equals("E"))
			setX(getX() - 1);
		else if (getDirection().equals("Up"))
			setZ(getZ() - 1);
		else if (getDirection().equals("Down"))

			setZ(getZ() + 1);
	}

	void turnRocketLeft() {

		if (getDirection().equals("N"))
			setDirection("W");
		else if (getDirection().equals("S"))
			setDirection("E");
		else if (getDirection().equals("W")) {
			if (!verticalAxis) {
				setDirection("S");
			} else {
				setDirection("Down");
			}
		} else if (getDirection().equals("E"))
			setDirection("N");
		else if (getDirection().equals("Up")) {
			setDirection(previousDir);
			turnRocketLeft();
		} else if (getDirection().equals("Down")) {
			setDirection(previousDirComplement);
			turnRocketRight();
		}
	}

	void turnRocketRight() {

		if (getDirection().equals("N"))
			setDirection("E");
		else if (getDirection().equals("S"))
			setDirection("W");
		else if (getDirection().equals("W")) {
			setDirection("N");
		} else if (getDirection().equals("E"))
			setDirection("S");
		else if (getDirection().equals("Up")) {
			setDirection(previousDirComplement);
			turnRocketLeft();
		} else if (getDirection().equals("Down")) {
			setDirection(previousDir);
			turnRocketRight();
		}
	}

	void turnRocketUp() {
		previousDir = getDirection();
		previousDirComplement(previousDir);

		if (getDirection().equals("N")) {
			setDirection("Up");
			if (!verticalAxis) {
				turnRocketRight();
			}
		} else if (getDirection().equals("S")) {
			setDirection("Up");
			if (!verticalAxis) {
				turnRocketRight();
			}
		} else if (getDirection().equals("W")) {
			setDirection("Up");
			if (!verticalAxis) {
				turnRocketRight();
			}
		} else if (getDirection().equals("E")) {
			setDirection("Up");
			if (!verticalAxis) {
				turnRocketRight();
			}
		} else if (getDirection().equals("Up")) {
			setDirection(previousDirComplement);

		} else if (getDirection().equals("Down")) {
			setDirection(previousDir);
			turnRocketRight();
		}
	}

	void turnRocketDown() {
		previousDir = getDirection();
		previousDirComplement(previousDir);

		if (getDirection().equals("N")) {
			setDirection("Down");
			if (!verticalAxis) {
				turnRocketLeft();
			}
		} else if (getDirection().equals("S")) {
			setDirection("Down");
			if (!verticalAxis) {
				turnRocketLeft();
			}
		} else if (getDirection().equals("W")) {
			setDirection("Down");
			if (!verticalAxis) {
				turnRocketLeft();
			}
		} else if (getDirection().equals("E")) {
			setDirection("Down");
			if (!verticalAxis) {
				turnRocketLeft();
			}
		} else if (getDirection().equals("Up")) {
			setDirection(previousDir);

		} else if (getDirection().equals("Down")) {
			setDirection(previousDirComplement);
			turnRocketRight();
		}
	}

	void Test() {

		for (char c : move)

		{
			if (c == 'u' || c == 'd') {
				if (!verticalAxis) {
					verticalAxis = true;
				} else {
					verticalAxis = false;
				}
			}
			if (c == 'f')
				moveRocketForward();
			else if (c == 'b')
				moveRocketBackward();
			else if (c == 'l')
				turnRocketLeft();
			else if (c == 'r')
				turnRocketRight();
			else if (c == 'u')
				turnRocketUp();
			else {
				turnRocketDown();
			}
		}
		System.out.println(getX() + ", " + getY() + ", " + getZ());
		System.out.println(getDirection());

	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}