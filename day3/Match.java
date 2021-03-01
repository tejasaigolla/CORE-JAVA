package com.ltts;

public abstract class Match {
      private int currentscore;
      private float currentover;
      private int target;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
      abstract float calculateRunRate();
      abstract int calculateBalls();
      abstract void display(double reqRunrate,int balls);
      }
