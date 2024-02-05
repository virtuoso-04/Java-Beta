public class ArrayStack
  {
  public int getMaxSize()
    {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public int[] getStackArray() {
		return stackArray;
	}

	public void setStackArray(int[] stackArray) {
		this.stackArray = stackArray;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

private int maxSize;
  private int[] stackArray;
  private int top;

  public ArrayStack(int size) {
    maxSize = size;
    stackArray = new int[maxSize];
    top = -1;
  }

  public void push(int value) {
    stackArray[++top] = value;
  }

  public int pop() {
    return stackArray[top--];
  }

  public int peek() {
    return stackArray[top];
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public boolean isFull() {
    return (top == maxSize - 1);
  }
}
